package cn.competition.demo;

import java.util.ArrayList;
import java.util.List;

public class Chromosome_A {
    private boolean[] gene;//基因序列
    private int score;//对应的函数得分

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGene(boolean[] gene) {
        this.gene = gene;
    }

    //随机生成基因序列
    public Chromosome_A(int size) {
        if (size <= 0) {
            return;
        }
        initGeneSize(size);
        for (int i = 0; i < size; i++) {
            gene[i] = Math.random() >= 0.5;
        }
    }

    //生成一个新基因
    public Chromosome_A() {

    }

    //克隆基因
    public static Chromosome_A clone(final Chromosome_A c) {
        if (c == null || c.gene == null) {
            return null;
        }
        Chromosome_A copy = new Chromosome_A();
        copy.initGeneSize(c.gene.length);
        for (int i = 0; i < c.gene.length; i++) {
            copy.gene[i] = c.gene[i];
        }
        return copy;
    }

    //初始化基因长度
    private void initGeneSize(int size) {
        if (size <= 0) {
            return;
        }
        gene = new boolean[size];
    }

    //遗传产生下一代
    public static List<Chromosome_A> genetic(Chromosome_A p1, Chromosome_A p2) {
        if (p1 == null || p2 == null) { //染色体有一个为空，不产生下一代
            return null;
        }
        if (p1.gene == null || p2.gene == null) { //染色体有一个没有基因序列，不产生下一代
            return null;
        }
        if (p1.gene.length != p2.gene.length) { //染色体基因序列长度不同，不产生下一代
            return null;
        }
        Chromosome_A c1 = clone(p1);
        Chromosome_A c2 = clone(p2);
        //随机产生交叉互换位置
        int size = c1.gene.length;
        int a = ((int) (Math.random() * size)) % size;
        int b = ((int) (Math.random() * size)) % size;
        int min = a > b ? b : a;
        int max = a > b ? a : b;
        //对位置上的基因进行交叉互换
        for (int i = min; i <= max; i++) {
            boolean t = c1.gene[i];
            c1.gene[i] = c2.gene[i];
            c2.gene[i] = t;
        }
        List<Chromosome_A> list = new ArrayList<Chromosome_A>();
        list.add(c1);
        list.add(c2);
        return list;
    }

    //基因num个位置发生变异
    public void mutation(int num) {
        //允许变异
        int size = gene.length;
        for (int i = 0; i < num; i++) {
            //寻找变异位置
            int at = ((int) (Math.random() * size)) % size;
            //变异后的值
            boolean bool = !gene[at];
            gene[at] = bool;
        }
    }

    //将基因转化为对应的序列
    public List<Ordering_Amachine> getOrderingAmachine() {
        String finalPosition0,finalPosition1,finalPosition2,finalPosition3;
        List<Ordering_Amachine> orderingAmachines = new ArrayList<>();
        if (gene == null) {
            return null;
        }
        for (int i = 0; i < gene.length/5; i++) {
            if (gene[5*i+0])
                finalPosition0="LLA";
            else
                finalPosition0="LLB";
            if (gene[5*i+1])
                finalPosition1="PM3";
            else
                finalPosition1="PM4";
            if (gene[5*i+2]&&gene[5*i+3])
                finalPosition2="PM1";
            else if ((!gene[5*i+2])&&gene[5*i+3])
                finalPosition2="PM2";
            else if (gene[5*i+2]&&(!gene[5*i+3]))
                finalPosition2="PM5";
            else
                finalPosition2="PM6";
            if (gene[5*i+4])
                finalPosition3="LLA";
            else
                finalPosition3="LLB";
            orderingAmachines.add(new Ordering_Amachine(finalPosition0,finalPosition1,finalPosition2,finalPosition3));
        }
        return orderingAmachines;
    }

    //获得基因的均匀度
//    public double getUniformity(){
//        int d1 = 0,d2 = 0,d3=0,d4=0,d5=0,d6=0,d7=0;
//        double average=gene.length/10;
//        double totalVariance;
//        for (int i = 0; i < gene.length/5; i++) {
//            if (gene[5*i+0])
//                d1++;
//
//            if (gene[5*i+1])
//                d2++;
//
//            if (gene[5*i+2]&&gene[5*i+3])
//                d3++;
//            else if ((!gene[5*i+2])&&gene[5*i+3])
//                d4++;
//            else if (gene[5*i+2]&&(!gene[5*i+3]))
//                d5++;
//            else
//                d6++;
//
//            if (gene[5*i+4])
//                d7++;
//        }
//        totalVariance=(average-d1)*(average-d1)+(average-d2)*(average-d2)+0.25*(d4-d5)*(d4-d5)+0.25*(d3-d6)*(d3-d6)+(average-d7)*(average-d7);
//        return totalVariance;
//    }
}
