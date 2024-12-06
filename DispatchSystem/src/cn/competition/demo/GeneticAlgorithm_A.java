package cn.competition.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static cn.competition.demo.Show.*;

public abstract class GeneticAlgorithm_A {
    private List<Chromosome_A> population = new ArrayList<Chromosome_A>();
    private int popSize;// = 100;//种群数量
    private int geneSize;//=125;//基因最大长度
    private int maxIterNum;// = 100;//最大迭代次数
    private double mutationRate;// = 0.3;//基因变异的概率
    private int maxMutationNum;// = 15;//最大变异步长
    private int generation=1;//当前遗传到第几代
    private int maxNum;//将最小值转变为最大值求解
    private int bestScore;//最好得分
    private int worstScore;//最坏得分
    private int totalScore;//总得分
    private double averageScore;//平均得分
    private List<Ordering_Amachine> geneX=new ArrayList<>(); //记录历史种群中最好的X值
    private int y; //记录历史种群中最好的Y值
    private int geneI;//x y所在代数
    private List<Distance> distanceTable;
    private boolean[] genes;

    public void caculte(){
        //初始化种群
        generation = 1;
        init();
        while (generation < maxIterNum) {
            //种群遗传
            evolve();
            print();
            generation++;
        }
    }

    private void print() {
        System.out.println("--------------------------------");
        System.out.println("the generation is:" + generation);
        System.out.println("the best y is:" + (maxNum-bestScore)/10.0);
        System.out.println("the worst fitness is:" + (maxNum-worstScore)/10.0);
        System.out.println("the average fitness is:" + (maxNum-averageScore)/10.0);
        System.out.println("geneI:" + geneI + "\ngeneX:" + geneX + "\ny:" + (maxNum-y)/10.0);
    }

    //初始化种群
    private void init(){
        distanceTable = new ArrayList<>();
        String[] position = {"LP1", "LP2", "LP3", "AL", "LLA", "LLB"};
        for (int i = 0; i < position.length; i++) {
            distanceTable.add(new Distance(position[i],position[i],0));
        }
        int dis[] = {10, 20, 30, 30, 40, 10, 25, 35, 35, 20, 40, 30, 25, 20, 10};
        int counter = 0;
        for (int i = 0; i < position.length - 1; i++) {
            for (int j = i + 1; j < position.length; j++) {
                distanceTable.add(new Distance(position[i], position[j], dis[counter]));
                distanceTable.add(new Distance(position[j], position[i], dis[counter]));
                counter++;
            }
        }
        population = new ArrayList<Chromosome_A>();
        for (int i = 0; i < popSize; i++) {
            Chromosome_A chromosome_a=new Chromosome_A();
            if (i<popSize/5){
                chromosome_a.setGene(genes);
                population.add(chromosome_a);
            }
            else{
                Chromosome_A chro = new Chromosome_A(geneSize);
                population.add(chro);
            }
        }
        caculteScore_init();

    }

    //种群进行遗传
    private void evolve() {
        List<Chromosome_A> childPopulation = new ArrayList<Chromosome_A>();
        //生成下一代种群
        while (childPopulation.size() < popSize) {
            Chromosome_A p1 = getParentChromosome();
            Chromosome_A p2 = getParentChromosome();
            List<Chromosome_A> children = Chromosome_A.genetic(p1, p2);
            if (children != null) {
                for (Chromosome_A chro : children) {
                    childPopulation.add(chro);
                }
            }
        }
        //新种群替换旧种群
        List<Chromosome_A> t = population;
        population = childPopulation;
        t.clear();
        t = null;
        //基因突变
        mutation();
        //计算新种群的适应度
        caculteScore();
    }

    //轮盘赌法选择可以遗传下一代的染色体
    private Chromosome_A getParentChromosome () {
//        double totalVariance=0;
//        for (Chromosome_A chro : population) {
//            totalVariance+=10000.0/chro.getUniformity();
//        }
//        double slice1=Math.random()*totalVariance;
//        double sum1=0;
        double slice = Math.random() * totalScore;
        int sum = 0;
        for (Chromosome_A chro : population) {
            sum += chro.getScore();
//            sum1+=10000.0/chro.getUniformity();
            if (sum > slice && chro.getScore() >= averageScore){//&&sum1>slice1) {
                return chro;
            }
        }
        return null;
    }
    //计算种群适应度
    private void caculteScore() {
        setChromosomeScore(population.get(0));
        bestScore = population.get(0).getScore();
        worstScore = population.get(0).getScore();
        totalScore = 0;
        for (Chromosome_A chro : population) {
            setChromosomeScore(chro);
            if (chro.getScore() >= bestScore) { //设置最好基因值
                bestScore = chro.getScore();
                if (y < bestScore) {
                    geneX = changeX_A(chro);
                    y = bestScore;
                    geneI = generation;
                }
            }
            if (chro.getScore() < worstScore) { //设置最坏基因值
                worstScore = chro.getScore();
            }
            totalScore += chro.getScore();
        }
        averageScore = totalScore / popSize;
        //因为精度问题导致的平均值大于最好值，将平均值设置成最好值
//        averageScore = averageScore > bestScore ? bestScore : averageScore;
    }
    private void caculteScore_init() {
        setChromosomeScore(population.get(0));
        bestScore = population.get(0).getScore();
        worstScore = population.get(0).getScore();
        totalScore = 0;
        y=bestScore;
        for (Chromosome_A chro : population) {
            setChromosomeScore(chro);
            if (chro.getScore() >= bestScore) { //设置最好基因值
                bestScore = chro.getScore();
                if (y <= bestScore) {
                    geneX = changeX_A(chro);
                    y = bestScore;
                    geneI = generation;
                }
            }
            if (chro.getScore() < worstScore) { //设置最坏基因值
                worstScore = chro.getScore();
            }
            totalScore += chro.getScore();
        }
        averageScore = totalScore / popSize;
        //因为精度问题导致的平均值大于最好值，将平均值设置成最好值
//        averageScore = averageScore > bestScore ? bestScore : averageScore;
    }
    //基因突变
    private void mutation() {
        for (Chromosome_A chro : population) {
            if (Math.random() < mutationRate) { //发生基因突变
                int mutationNum = (int) (Math.random() * maxMutationNum);
                chro.mutation(mutationNum);
            }
        }
    }
    //设置染色体得分
    private void setChromosomeScore(Chromosome_A chro) {
        if (chro == null) {
            return;
        }
        List<Ordering_Amachine> x = changeX_A(chro);
        int y = maxNum-caculateY(x);
        chro.setScore(y);

    }
    //将二进制转化为对应的X
    public List<Ordering_Amachine> changeX_A(Chromosome_A chro) {
        return chro.getOrderingAmachine();
    }
    //根据X计算Y值 Y=F(X)
    public int caculateY(List<Ordering_Amachine> orderingAmachines) {
        List<Procedure> procedureList=new ArrayList<>();
        List<Machine> machineList=new ArrayList<>();
        for (Ordering_Amachine orderingAmachine:orderingAmachines) {
            if (orderingAmachines.indexOf(orderingAmachine)<25)
                machineList=LP1(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine));
            else if (orderingAmachines.indexOf(orderingAmachine)<50)
                machineList=LP2(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine));
            else
                machineList=LP3(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine));
        }
        return machineList.get(0).getWorkingList().get(machineList.get(0).getWorkingList().size()-1).getEndTime();
    }

    public abstract List<Machine> LP1(String finalPosition0,String finalPosition1,String finalPosition2,String finalPosition3,List<Procedure> procedureList,List<Distance> distanceTable,List<Machine> machineList,int i) ;
    public abstract List<Machine> LP2(String finalPosition0,String finalPosition1,String finalPosition2,String finalPosition3,List<Procedure> procedureList,List<Distance> distanceTable,List<Machine> machineList,int i) ;
    public abstract List<Machine> LP3(String finalPosition0,String finalPosition1,String finalPosition2,String finalPosition3,List<Procedure> procedureList,List<Distance> distanceTable,List<Machine> machineList,int i) ;

    public void setGenes(boolean[] genes) {
        this.genes = genes;
    }

    public void setPopulation(List<Chromosome_A> population) {
        this.population = population;
    }

    public void setPopSize(int popSize) {
        this.popSize = popSize;
    }

    public void setGeneSize(int geneSize) {
        this.geneSize = geneSize;
    }

    public void setMaxIterNum(int maxIterNum) {
        this.maxIterNum = maxIterNum;
    }

    public void setMutationRate(double mutationRate) {
        this.mutationRate = mutationRate;
    }

    public void setMaxMutationNum(int maxMutationNum) {
        this.maxMutationNum = maxMutationNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getBestScore() {
        return bestScore;
    }

    public int getWorstScore() {
        return worstScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public List<Ordering_Amachine> getGeneX() {
        return geneX;
    }

    public int getY() {
        return y;
    }
}

