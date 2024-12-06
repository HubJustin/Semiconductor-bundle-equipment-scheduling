package cn.competition.demo1;

import cn.competition.demo.Distance;
import cn.competition.demo.Machine;
import cn.competition.demo.Procedure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static cn.competition.demo.Show.*;
import static cn.competition.demo1.Show1.*;

public class Workmanship3 extends GeneticAlgorithm_B{
    public static void main(String[] args) {
        Workmanship3 workmanship3=new Workmanship3();
        workmanship3.setTranslateMode(0);
        workmanship3.setGenes(ordering_BmachineToGene(0,new ArrayList<>(Arrays.asList(
                //9417.8
                new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM9", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLA"), new Ordering_Bmachine("LLB", "PM8", "PM9", "LLA"), new Ordering_Bmachine("LLB", "PM7", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLA"), new Ordering_Bmachine("LLA", "PM8", "PM10", "LLA"), new Ordering_Bmachine("LLA", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM10", "LLA"), new Ordering_Bmachine("LLA", "PM8", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"), new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLA"), new Ordering_Bmachine("LLB", "PM7", "null", "LLA"), new Ordering_Bmachine("LLA", "PM8", "null", "LLA"), new Ordering_Bmachine("LLB", "PM7", "null", "LLB"), new Ordering_Bmachine("LLA", "PM8", "null", "LLA"), new Ordering_Bmachine("LLA", "PM8", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB"), new Ordering_Bmachine("LLA", "PM7", "null", "LLB"), new Ordering_Bmachine("LLB", "PM8", "null", "LLB")
                //9422.8
//                new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM5", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM4", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM4", "LLA"),new Ordering_Bmachine("LLB", "PM8", "PM5", "LLA"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM9", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM9", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "PM10", "LLB"),new Ordering_Bmachine("LLA", "PM7", "PM9", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB"),new Ordering_Bmachine("LLA", "PM7", "null", "LLB"),new Ordering_Bmachine("LLB", "PM8", "null", "LLB")
        ))));
        workmanship3.setPopSize(100);//设置种群数量
        workmanship3.setGeneSize(300);//设置基因最大长度
        workmanship3.setMaxIterNum(500);//设置最大迭代次数
        workmanship3.setMutationRate(0.3);//设置基因变异的概率
        workmanship3.setMaxMutationNum(180);//设置最大变异步长
        workmanship3.setMaxNum(110000);//将最小值转变为最大值求解
        workmanship3.caculte();
    }
    public List<Machine> LP1(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, List<Machine> cleanMachineList, List<Cleaning> cleaningList, int i) {
        //LP1->AL:TM1
        int startTime;
        int endTime;
        if (machineList.size()==0)
            startTime=0;
        else
            startTime=procedureList.get(procedureList.size()-21).getEtime()+lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size()-21).getEtime(),machineList,0,null),"LP1",distanceTable);
        endTime=startTime+50+lookDistance("LP1","AL",distanceTable)+50;
        boolean b01=checkMachine_TM1(startTime,endTime,"TM1","LP1","AL",machineList,distanceTable,0,null);
        boolean b02=checkMachine(endTime,endTime+100,"AL",machineList);
        if (b01 && b02) {
            procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
        } else {
            //改动部分
            int startTimeMax=startTime;
            if (!checkMachine_TM1(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM1_Out(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null));
            startTime=startTimeMax;
            endTime = startTime + 50 + lookDistance("LP1", "AL", distanceTable) + 50;
            //改动部分
            TM1:for (int j = 0; j < 10000; j++) {
                b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null);
                b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
                if (b01 && b02) {
                    procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
                    if (j!=0)
                        System.out.println("LP1->AL:TM1阈值过小!!!"+j);
                    break TM1;
                } else {
                    startTime = startTime + 1;
                    endTime = startTime + 50 + lookDistance("LP1", "AL", distanceTable) + 50;
                }
                if (j == 9999) {
                    System.out.println("LP1->AL:TM1阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //AL->LL(S2):TM1
        int startTime1;
        int endTime1;
//        finalPosition0=changeLL("AL",endTime+100,machineList,distanceTable,endTime,"AL");
        startTime1=endTime+100;
        endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
        boolean b1=checkMachineState(endTime1-50,finalPosition0,machineList);
        boolean b2=(lookLastTime(lookWorkingListSize(finalPosition0+"(S2)", machineList)-1, finalPosition0+"(S2)", machineList)+250<=endTime1-50);
        boolean b3=checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL");
        if (b1&&b2&&b3) {
            procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
            procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
        }else {
            endTime1 = lookLastTime(lookWorkingListSize(finalPosition0+"(S2)", machineList)-1, finalPosition0+"(S2)", machineList)+50+200+50;
            startTime1 = endTime1-(50 + lookDistance("AL",finalPosition0,distanceTable) + 50);
            if (startTime1<endTime+100){
                startTime1=endTime+100;
                endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
            }
            //改动部分
            int startTimeMax=startTime1;
            do {
                if (!checkMachineState(endTime1-50,finalPosition0,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState_Out(endTime1-50,finalPosition0,machineList)+50-(50 + lookDistance("AL", finalPosition0, distanceTable) + 50));
                if (!checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM1_Out(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL"));
                startTime1=startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
            }while(!(checkMachineState(endTime1-50,finalPosition0,machineList)&&checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL")));
            //改动部分
            TM1:for (int j = 0; j < 10000; j++) {
                b1=checkMachineState(endTime1-50,finalPosition0,machineList);
                b3=checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL");
                if (b1 && b3) {
                    procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
                    procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
                    if (j!=0)
                        System.out.println("AL->LL(S2):TM1阈值过小!!!"+j);
                    break TM1;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50);
                }
                if (j == 9999) {
                    System.out.println("AL->LL(S2):TM1阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //LL(S2)->PM7/8:TM2
        int startTime2;
        int endTime2;
//        finalPosition1=changePM78(finalPosition0,endTime1+150,machineList,cleanMachineList,endTime1,finalPosition0);
        startTime2=endTime1+150;
        endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
        boolean b4=(endTime2-50>=lookLastTime(lookWorkingListSize(finalPosition1,machineList)-1,finalPosition1,machineList)+50);
        boolean b5=checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
        boolean b6=checkMachineState1(startTime2,finalPosition0,machineList);
        boolean a1=checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList);
        if (b4&&b5&&b6&&a1) {
            if (finalPosition0.equals("LLA")){
                procedureList.add(new Procedure("LLA"+"(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("LLB"+"(S2)", 3, 0,startTime2,startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }else {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }
        }else {
            endTime2 = lookLastTime(lookWorkingListSize(finalPosition1, machineList)-1, finalPosition1, machineList)+50+50;
            startTime2 = endTime2-(50 + findDistance1(finalPosition0,finalPosition1) + 50);
            if (startTime2<endTime1+150){
                startTime2=endTime1+150;
                endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
            }
            //改动部分
            int startTimeMax=startTime2;
            do {
                if (!checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0));
                if (!checkMachineState1(startTime2,finalPosition0,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(startTime2,finalPosition0,machineList));
                if (!checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime2-50,finalPosition1,cleanMachineList)+50-(50 + findDistance1(finalPosition0,finalPosition1) + 50));
                startTime2=startTimeMax;
                endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
            }while (!(checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0)&&checkMachineState1(startTime2,finalPosition0,machineList)&&checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,true,true,true,machineList,cleanMachineList,endTime1,finalPosition0);
            if (newTime.size()!=0){
                startTime2=newTime.get(newTime.size()-2);
                endTime2=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b5=counter==1||checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
                b6=checkMachineState1(startTime2,finalPosition0,machineList);
                a1=checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList);
                if (b5&&b6&a1) {
                    if (finalPosition0.equals("LLA")){
                        procedureList.add(new Procedure("LLA"+"(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("LLB"+"(S2)", 3, 0,startTime2,startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }else {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }
                    if (j!=0)
                        System.out.println("LL(S2)->PM7/8:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime2=endTime2+1;
                    startTime2 = endTime2-(50 + findDistance1(finalPosition0,finalPosition1) + 50);
                }
                if (j==9999){
                    System.out.println("LL(S2)->PM7/8:TM2阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM7/8->LLC:TM2
        int startTime3;
        int endTime3;
        startTime3=endTime2+700;
        endTime3=startTime3 + 50 + findDistance1(finalPosition1,"LLC") + 50;
        boolean b7=(endTime3-50>=lookLastTime(lookWorkingListSize("LLC",machineList)-1,"LLC",machineList)+50);
        boolean b8=checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1);
        if (b7&&b8) {
            if (finalPosition1.equals("PM7")){
                procedureList.add(new Procedure("PM7", 14, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("PM8", 15, 0, startTime3, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }else{
                procedureList.add(new Procedure("PM7", 14, 0, endTime2,endTime2));
                procedureList.add(new Procedure("PM8", 15, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }
        }else {
            endTime3 = lookLastTime(lookWorkingListSize("LLC", machineList)-1, "LLC", machineList)+50+50;
            startTime3 = endTime3-(50 + findDistance1(finalPosition1,"LLC") + 50);
            if (startTime3<endTime2+700){
                startTime3=endTime2+700;
                endTime3=startTime3 + 50 + findDistance1(finalPosition1,"LLC") + 50;
            }
            //改动部分
            int startTimeMax=startTime3;
//            do {
            if (!checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1));
            startTime3=startTimeMax;
            endTime3=startTime3 + 50 + findDistance1(finalPosition1,"LLC") + 50;
//            }while(!checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime2+700,startTime3,endTime3,"TM2",finalPosition1,"LLC",false,false,false,machineList,cleanMachineList,endTime2,finalPosition1);
            if (newTime.size()!=0){
                startTime3=newTime.get(newTime.size()-2);
                endTime3=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b8=counter==1||checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1);
                if (b8) {
                    if (finalPosition1.equals("PM7")){
                        procedureList.add(new Procedure("PM7", 14, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("PM8", 15, 0, startTime3, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }else{
                        procedureList.add(new Procedure("PM7", 14, 0, endTime2,endTime2));
                        procedureList.add(new Procedure("PM8", 15, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }
                    if (j!=0)
                        System.out.println("PM7/8->LLC:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime3=endTime3+1;
                    startTime3 = endTime3-(50 + findDistance1(finalPosition1,"LLC") + 50);
                }
                if (j==9999)
                    System.out.println("PM7/8->LLC:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine(finalPosition1,machineList,cleaningList,startTime3+50);

        //LLC->PM2:TM3
        int startTime4;
        int endTime4;
        startTime4=endTime3;
        endTime4=startTime4 + 50 + findDistance2("LLC","PM2") + 50;
        boolean b9=(endTime4-50>=lookLastTime(lookWorkingListSize("PM2",machineList)-1,"PM2",machineList)+50);
        boolean b10=checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM2",machineList,endTime3,"LLC");
        boolean a2=checkMachine_PM(endTime4-50,"PM2",cleanMachineList);
        if (b9&&b10&&a2) {
            procedureList.add(new Procedure("LLC", 6, startTime4 - endTime3, endTime3, startTime4));
            procedureList.add(new Procedure("TM3", 5, endTime4 - startTime4, startTime4, endTime4));
        }else {
            endTime4 = lookLastTime(lookWorkingListSize("PM2", machineList)-1, "PM2", machineList)+50+50;
            startTime4 = endTime4-(50 + findDistance2("LLC","PM2") + 50);
            if (startTime4<endTime3){
                startTime4=endTime3;
                endTime4=startTime4 + 50 + findDistance2("LLC","PM2") + 50;
            }
            //改动部分
            int startTimeMax=startTime4;
            do {
                if (!checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM2",machineList,endTime3,"LLC"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime4,endTime4,"TM3","LLC","PM2",machineList,endTime3,"LLC"));
                if (!checkMachine_PM(endTime4-50,"PM2",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime4-50,"PM2",cleanMachineList)+50-(50 + findDistance2("LLC","PM2") + 50));
                startTime4=startTimeMax;
                endTime4=startTime4 + 50 + findDistance2("LLC","PM2") + 50;
            }while (!(checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM2",machineList,endTime3,"LLC")&&checkMachine_PM(endTime4-50,"PM2",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime3,startTime4,endTime4,"TM3","LLC","PM2",false,false,true,machineList,cleanMachineList,endTime3,"LLC");
            if (newTime.size()!=0){
                startTime4=newTime.get(newTime.size()-2);
                endTime4=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b10=counter==1||checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM2",machineList,endTime3,"LLC");
                a2=checkMachine_PM(endTime4-50,"PM2",cleanMachineList);
                if (b10&&a2) {
                    procedureList.add(new Procedure("LLC", 6, startTime4 - endTime3, endTime3, startTime4));
                    procedureList.add(new Procedure("TM3", 5, endTime4 - startTime4, startTime4, endTime4));
                    if (j!=0)
                        System.out.println("LLC->PM2:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime4=endTime4+1;
                    startTime4 = endTime4-(50 + findDistance2("LLC","PM2") + 50);
                }
                if (j==9999)
                    System.out.println("LLC->PM2:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM2->PM4/5:TM3
        int startTime5;
        int endTime5;
//        finalPosition2=changePM45("PM2",endTime4+700,machineList,cleanMachineList,endTime4,"PM2");
        startTime5=endTime4+700;
        endTime5=startTime5 + 50 + findDistance2("PM2",finalPosition2) + 50;
        boolean b11=(endTime5-50>=lookLastTime(lookWorkingListSize(finalPosition2,machineList)-1,finalPosition2,machineList)+50);
        boolean b12=checkMachine_TM23(startTime5,endTime5,"TM3","PM2",finalPosition2,machineList,endTime4,"PM2");
        boolean a3=checkMachine_PM(endTime5-50,finalPosition2,cleanMachineList);
        if (b11&b12&&a3){
            procedureList.add(new Procedure("PM2", 9, startTime5 - endTime4, endTime4, startTime5));
            procedureList.add(new Procedure("TM3", 5, endTime5 - startTime5, startTime5, endTime5));
        }else{
            endTime5 = lookLastTime(lookWorkingListSize(finalPosition2, machineList)-1, finalPosition2, machineList)+50+50;
            startTime5 = endTime5-(50 + findDistance2("PM2",finalPosition2) + 50);
            if (startTime5<endTime4+700){
                startTime5=endTime4+700;
                endTime5=startTime5 + 50 + findDistance2("PM2",finalPosition2) + 50;
            }
            //改动部分
            int startTimeMax=startTime5;
            do {
                if (!checkMachine_TM23(startTime5,endTime5,"TM3","PM2",finalPosition2,machineList,endTime4,"PM2"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime5,endTime5,"TM3","PM2",finalPosition2,machineList,endTime4,"PM2"));
                if (!checkMachine_PM(endTime5-50,finalPosition2,cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime5-50,finalPosition2,cleanMachineList)+50-(50 + findDistance2("PM2",finalPosition2) + 50));
                startTime5=startTimeMax;
                endTime5=startTime5 + 50 + findDistance2("PM2",finalPosition2) + 50;
            }while (!(checkMachine_TM23(startTime5,endTime5,"TM3","PM2",finalPosition2,machineList,endTime4,"PM2")&&checkMachine_PM(endTime5-50,finalPosition2,cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime4+700,startTime5,endTime5,"TM3","PM2",finalPosition2,false,false,true,machineList,cleanMachineList,endTime4,"PM2");
            if (newTime.size()!=0){
                startTime5=newTime.get(newTime.size()-2);
                endTime5=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b12=counter==1||checkMachine_TM23(startTime5,endTime5,"TM3","PM2",finalPosition2,machineList,endTime4,"PM2");
                a3=checkMachine_PM(endTime5-50,finalPosition2,cleanMachineList);
                if (b12&&a3) {
                    procedureList.add(new Procedure("PM2", 9, startTime5 - endTime4, endTime4, startTime5));
                    procedureList.add(new Procedure("TM3", 5, endTime5 - startTime5, startTime5, endTime5));
                    if (j!=0)
                        System.out.println("PM2->PM4/5:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime5=endTime5+1;
                    startTime5 = endTime5-(50 + findDistance2("PM2",finalPosition2) + 50);
                }
                if (j==9999)
                    System.out.println("PM2->PM4/5:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM2",machineList,cleaningList,startTime5+50);

        //PM4/5->LLD:TM3
        int startTime6;
        int endTime6;
        startTime6=endTime5+1000;
        endTime6=startTime6+50+findDistance2(finalPosition2,"LLD")+50;
        boolean b13=(endTime6-50>=lookLastTime(lookWorkingListSize("LLD",machineList)-1,"LLD",machineList)+50);
        boolean b14=checkMachine_TM23(startTime6,endTime6,"TM3",finalPosition2,"LLD",machineList,endTime5,finalPosition2);
        if (b13&&b14){
            if (finalPosition2.contains("PM4")){
                procedureList.add(new Procedure("PM4",11,startTime6-endTime5,endTime5,startTime6));
                procedureList.add(new Procedure("PM5",12,0,startTime6,startTime6));
                procedureList.add(new Procedure("TM3",5,endTime6-startTime6,startTime6,endTime6));
            }else{
                procedureList.add(new Procedure("PM4",11,0,endTime5,endTime5));
                procedureList.add(new Procedure("PM5",12,startTime6-endTime5,endTime5,startTime6));
                procedureList.add(new Procedure("TM3",5,endTime6-startTime6,startTime6,endTime6));
            }
        }else{
            endTime6=lookLastTime(lookWorkingListSize("LLD",machineList)-1,"LLD",machineList)+50+50;
            startTime6=endTime6-(50+findDistance2(finalPosition2,"LLD")+50);
            if (startTime6<endTime5+1000){
                startTime6=endTime5+1000;
                endTime6=startTime6+50+findDistance2(finalPosition2,"LLD")+50;
            }
            //改动部分
            int startTimeMax=startTime6;
//            do {
            if (!checkMachine_TM23(startTime6,endTime6,"TM3",finalPosition2,"LLD",machineList,endTime5,finalPosition2))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime6,endTime6,"TM3",finalPosition2,"LLD",machineList,endTime5,finalPosition2));
            startTime6=startTimeMax;
            endTime6=startTime6+50+findDistance2(finalPosition2,"LLD")+50;
//            }while (!checkMachine_TM23(startTime6,endTime6,"TM3",finalPosition2,"LLD",machineList,endTime5,finalPosition2));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime5+1000,startTime6,endTime6,"TM3",finalPosition2,"LLD",false,false,false,machineList,cleanMachineList,endTime5,finalPosition2);
            if (newTime.size()!=0){
                startTime6=newTime.get(newTime.size()-2);
                endTime6=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b14=counter==1||checkMachine_TM23(startTime6,endTime6,"TM3",finalPosition2,"LLD",machineList,endTime5,finalPosition2);
                if (b14){
                    if (finalPosition2.contains("PM4")){
                        procedureList.add(new Procedure("PM4",11,startTime6-endTime5,endTime5,startTime6));
                        procedureList.add(new Procedure("PM5",12,0,startTime6,startTime6));
                        procedureList.add(new Procedure("TM3",5,endTime6-startTime6,startTime6,endTime6));
                    }else{
                        procedureList.add(new Procedure("PM4",11,0,endTime5,endTime5));
                        procedureList.add(new Procedure("PM5",12,startTime6-endTime5,endTime5,startTime6));
                        procedureList.add(new Procedure("TM3",5,endTime6-startTime6,startTime6,endTime6));
                    }
                    if (j!=0)
                        System.out.println("PM4/5->LLD:TM3阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime6=endTime6+1;
                    startTime6=endTime6-(50+findDistance2(finalPosition2,"LLD")+50);
                }
                if (j==9999)
                    System.out.println("PM4/5->LLD:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine(finalPosition2,machineList,cleaningList,startTime6+50);

        //LLD->PM10:TM2
        int startTime7;
        int endTime7;
        startTime7=endTime6+400;
        endTime7=startTime7 + 50 + findDistance1("LLD","PM10") + 50;
        boolean b15=(endTime7-50>=lookLastTime(lookWorkingListSize("PM10",machineList)-1,"PM10",machineList)+50);
        boolean b16=checkMachine_TM23(startTime7,endTime7,"TM2","LLD","PM10",machineList,endTime6,"LLD");
        boolean a4=checkMachine_PM(endTime7-50,"PM10",cleanMachineList);
        if (b15&&b16&&a4) {
            procedureList.add(new Procedure("LLD", 7, startTime7 - endTime6, endTime6, startTime7));
            procedureList.add(new Procedure("TM2", 4, endTime7 - startTime7, startTime7, endTime7));
        }else {
            endTime7 = lookLastTime(lookWorkingListSize("PM10",machineList)-1,"PM10",machineList)+50+50;
            startTime7 = endTime7-(50 + findDistance1("LLD","PM10") + 50);
            if (startTime7<endTime6+400){
                startTime7=endTime6+400;
                endTime7=startTime7 + 50 + findDistance1("LLD","PM10") + 50;
            }
            //改动部分
            int startTimeMax=startTime7;
            do {
                if (!checkMachine_TM23(startTime7,endTime7,"TM2","LLD","PM10",machineList,endTime6,"LLD"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime7,endTime7,"TM2","LLD","PM10",machineList,endTime6,"LLD"));
                if (!checkMachine_PM(endTime7-50,"PM10",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime7-50,"PM10",cleanMachineList)+50-(50 + findDistance1("LLD","PM10") + 50));
                startTime7=startTimeMax;
                endTime7=startTime7 + 50 + findDistance1("LLD","PM10") + 50;
            }while (!(checkMachine_TM23(startTime7,endTime7,"TM2","LLD","PM10",machineList,endTime6,"LLD")&&checkMachine_PM(endTime7-50,"PM10",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime6+400,startTime7,endTime7,"TM2","LLD","PM10",false,false,true,machineList,cleanMachineList,endTime6,"LLD");
            if (newTime.size()!=0){
                startTime7=newTime.get(newTime.size()-2);
                endTime7=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b16=counter==1||checkMachine_TM23(startTime7,endTime7,"TM2","LLD","PM10",machineList,endTime6,"LLD");
                a4=checkMachine_PM(endTime7-50,"PM10",cleanMachineList);
                if (b16&&a4) {
                    procedureList.add(new Procedure("LLD", 7, startTime7 - endTime6, endTime6, startTime7));
                    procedureList.add(new Procedure("TM2", 4, endTime7 - startTime7, startTime7, endTime7));
                    if (j!=0)
                        System.out.println("LLD->PM10:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime7=endTime7+1;
                    startTime7 = endTime7-(50 + findDistance1("LLD","PM10") + 50);
                }
                if (j==9999)
                    System.out.println("LLD->PM10:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM10->LL(S1):TM2
        int startTime8;
        int endTime8;
//        finalPosition3=changeLL1("PM10",endTime7+550,machineList,endTime7,"PM10");
        startTime8=endTime7+550;
        endTime8=startTime8+50+findDistance1("PM10",finalPosition3)+50;
        boolean b17=(endTime8-50>=lookLastTime(lookWorkingListSize(finalPosition3+"(S1)",machineList)-1,finalPosition3+"(S1)",machineList)+200);
        boolean b18=checkMachine_TM23(startTime8,endTime8,"TM2","PM10",finalPosition3,machineList,endTime7,"PM10");
        boolean b19=checkMachineState1(endTime8-50,finalPosition3,machineList);
        if (b17&&b18&&b19){
            procedureList.add(new Procedure("PM10",17,startTime8-endTime7,endTime7,startTime8));
            procedureList.add(new Procedure("TM2",4,endTime8-startTime8,startTime8,endTime8));
        }else{
            endTime8=lookLastTime(lookWorkingListSize(finalPosition3+"(S1)",machineList)-1,finalPosition3+"(S1)",machineList)+200+50;
            startTime8=endTime8-(50+findDistance1("PM10",finalPosition3)+50);
            if (startTime8<endTime7+550){
                startTime8=endTime7+550;
                endTime8=startTime8+50+findDistance1("PM10",finalPosition3)+50;
            }
            //改动部分
            int startTimeMax=startTime8;
            do {
                if (!checkMachine_TM23(startTime8,endTime8,"TM2","PM10",finalPosition3,machineList,endTime7,"PM10"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime8,endTime8,"TM2","PM10",finalPosition3,machineList,endTime7,"PM10"));
                if (!checkMachineState1(endTime8-50,finalPosition3,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(endTime8-50,finalPosition3,machineList)+50-(50+findDistance1("PM10",finalPosition3)+50));
                startTime8=startTimeMax;
                endTime8=startTime8+50+findDistance1("PM10",finalPosition3)+50;
            }while (!(checkMachine_TM23(startTime8,endTime8,"TM2","PM10",finalPosition3,machineList,endTime7,"PM10")&&checkMachineState1(endTime8-50,finalPosition3,machineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime7+550,startTime8,endTime8,"TM2","PM10",finalPosition3,true,false,false,machineList,cleanMachineList,endTime7,"PM10");
            if (newTime.size()!=0){
                startTime8=newTime.get(newTime.size()-2);
                endTime8=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b18=counter==1||checkMachine_TM23(startTime8,endTime8,"TM2","PM10",finalPosition3,machineList,endTime7,"PM10");
                b19=checkMachineState1(endTime8-50,finalPosition3,machineList);
                if (b18&b19){
                    procedureList.add(new Procedure("PM10",17,startTime8-endTime7,endTime7,startTime8));
                    procedureList.add(new Procedure("TM2",4,endTime8-startTime8,startTime8,endTime8));
                    if (j!=0)
                        System.out.println("PM10->LL(S1):TM2阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime8=endTime8+1;
                    startTime8=endTime8-(50+findDistance1("PM10",finalPosition3)+50);
                }
                if (j==9999)
                    System.out.println("PM10->LL(S1):TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM10",machineList,cleaningList,startTime8+50);

        //LL(S1)->LP1:TM1
        int startTime9;
        int endTime9;
        if (procedureList.size()==20)
            startTime9=endTime8+200;
        else
            startTime9=Math.max(endTime8+200,(procedureList.get(procedureList.size()-21).getEtime()+lookDistance("LP1",finalPosition3,distanceTable)));
        endTime9=startTime9+50+lookDistance(finalPosition3,"LP1",distanceTable)+50;
        boolean b20=checkMachine_TM1(startTime9,endTime9,"TM1",finalPosition3,"LP1",machineList,distanceTable,0,null);
        boolean b21=checkMachineState(startTime9,finalPosition3,machineList);
        if (b20&b21){
            if (finalPosition3.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime9 - endTime8, endTime8, startTime9));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime9, startTime9));
                procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
            }else{
                procedureList.add(new Procedure("LLA" + "(S1)", 2, 0,endTime8,endTime8));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime9 - endTime8, endTime8, startTime9));
                procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
            }
        }else{
            TM1:for (int j = 0; j < 10000; j++) {
                b20=checkMachine_TM1(startTime9,endTime9,"TM1",finalPosition3,"LP1",machineList,distanceTable,0,null);
                b21=checkMachineState(startTime9,finalPosition3,machineList);
                if (b20&&b21){
                    if (finalPosition3.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime9 - endTime8, endTime8, startTime9));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime9, startTime9));
                        procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
                    }else{
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, 0,endTime8,endTime8));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime9 - endTime8, endTime8, startTime9));
                        procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
                    }
                    if (j!=0)
                        System.out.println("LL(S1)->LP1:TM1阈值过小!!!"+j);
                    break TM1;
                }else{
                    endTime9=endTime9+1;
                    startTime9=endTime9-(50 + lookDistance(finalPosition3,"LP1",distanceTable) + 50);
                }
                if (j==9999)
                    System.out.println("LL(S1)->LP1:TM1阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
//        System.out.println("晶圆编号："+(i+1));
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
//        List<Ordering_Bmachine> orderingBmachines=new ArrayList<>();
//        orderingBmachines.add(new Ordering_Bmachine(finalPosition0, finalPosition1, finalPosition2, finalPosition3));
//        System.out.print(orderingBmachines.get(0).toString());
//        System.out.print(",");
        return machineList;
    }
    public List<Machine> LP2(String finalPosition0,String finalPosition1,String finalPosition2,String finalPosition3,List<Procedure> procedureList,List<Distance> distanceTable,List<Machine> machineList,List<Machine> cleanMachineList,List<Cleaning> cleaningList,int i){
        //LP2->AL:TM1
        int startTime;
        int endTime;
        startTime=procedureList.get(procedureList.size()-21).getEtime()+lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size()-21).getEtime(),machineList,0,null),"LP2",distanceTable);
        endTime=startTime+50+lookDistance("LP2","AL",distanceTable)+50;
        boolean b01=checkMachine_TM1(startTime,endTime,"TM1","LP2","AL",machineList,distanceTable,0,null);
        boolean b02=checkMachine(endTime,endTime+100,"AL",machineList);
        if (b01 && b02) {
            procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
        }else {
            //改动部分
            int startTimeMax=startTime;
            if (!checkMachine_TM1(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM1_Out(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null));
            startTime=startTimeMax;
            endTime = startTime + 50 + lookDistance("LP2", "AL", distanceTable) + 50;
            //改动部分
            TM1:for (int j = 0; j < 10000; j++) {
                b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null);
                b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
                if (b01 && b02) {
                    procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
                    if (j!=0)
                        System.out.println("LP2->AL:TM1阈值过小!!!"+j);
                    break TM1;
                } else {
                    startTime = startTime + 1;
                    endTime = startTime + 50 + lookDistance("LP2", "AL", distanceTable) + 50;
                }
                if (j == 9999) {
                    System.out.println("LP2->AL:TM1阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        //AL->LL(S2):TM1
        int startTime1;
        int endTime1;
//        finalPosition0=changeLL("AL",endTime+100,machineList,distanceTable,endTime,"AL");
        startTime1=endTime+100;
        endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
        boolean b1=checkMachineState(endTime1-50,finalPosition0,machineList);
        boolean b2=(lookLastTime(lookWorkingListSize(finalPosition0+"(S2)", machineList)-1, finalPosition0+"(S2)", machineList)+250<=endTime1-50);
        boolean b3=checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL");
        if (b1&&b2&&b3) {
            procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
            procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
        }else {
            endTime1 = lookLastTime(lookWorkingListSize(finalPosition0+"(S2)", machineList)-1, finalPosition0+"(S2)", machineList)+50+200+50;
            startTime1 = endTime1-(50 + lookDistance("AL",finalPosition0,distanceTable) + 50);
            if (startTime1<endTime+100){
                startTime1=endTime+100;
                endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
            }
            //改动部分
            int startTimeMax=startTime1;
            do {
                if (!checkMachineState(endTime1-50,finalPosition0,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState_Out(endTime1-50,finalPosition0,machineList)+50-(50 + lookDistance("AL", finalPosition0, distanceTable) + 50));
                if (!checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM1_Out(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL"));
                startTime1=startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
            }while (!(checkMachineState(endTime1-50,finalPosition0,machineList)&&checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL")));
            //改动部分
            TM1:for (int j = 0; j < 10000; j++) {
                b1=checkMachineState(endTime1-50,finalPosition0,machineList);
                b3=checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL");
                if (b1 && b3) {
                    procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
                    procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
                    if (j!=0)
                        System.out.println("AL->LL(S2):TM1阈值过小!!!"+j);
                    break TM1;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50);
                }
                if (j == 9999) {
                    System.out.println("AL->LL(S2):TM1阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //LL(S2)->PM7/8:TM2
        int startTime2;
        int endTime2;
//        finalPosition1=changePM78(finalPosition0,endTime1+150,machineList,cleanMachineList,endTime1,finalPosition0);
        startTime2=endTime1+150;
        endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
        boolean b4=(endTime2-50>=lookLastTime(lookWorkingListSize(finalPosition1,machineList)-1,finalPosition1,machineList)+50);
        boolean b5=checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
        boolean b6=checkMachineState1(startTime2,finalPosition0,machineList);
        boolean a1=checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList);
        if (b4&&b5&&b6&&a1) {
            if (finalPosition0.equals("LLA")){
                procedureList.add(new Procedure("LLA"+"(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("LLB"+"(S2)", 3, 0,startTime2,startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }else {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }
        }else {
            endTime2 = lookLastTime(lookWorkingListSize(finalPosition1, machineList)-1, finalPosition1, machineList)+50+50;
            startTime2 = endTime2-(50 + findDistance1(finalPosition0,finalPosition1) + 50);
            if (startTime2<endTime1+150){
                startTime2=endTime1+150;
                endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
            }
            //改动部分
            int startTimeMax=startTime2;
            do {
                if (!checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0));
                if (!checkMachineState1(startTime2,finalPosition0,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(startTime2,finalPosition0,machineList));
                if (!checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime2-50,finalPosition1,cleanMachineList)+50-(50 + findDistance1(finalPosition0,finalPosition1) + 50));
                startTime2=startTimeMax;
                endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
            }while (!(checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0)&&checkMachineState1(startTime2,finalPosition0,machineList)&&checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,true,true,true,machineList,cleanMachineList,endTime1,finalPosition0);
            if (newTime.size()!=0){
                startTime2=newTime.get(newTime.size()-2);
                endTime2=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b5=counter==1||checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
                b6=checkMachineState1(startTime2,finalPosition0,machineList);
                a1=checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList);
                if (b5&&b6&a1) {
                    if (finalPosition0.equals("LLA")){
                        procedureList.add(new Procedure("LLA"+"(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("LLB"+"(S2)", 3, 0,startTime2,startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }else {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }
                    if (j!=0)
                        System.out.println("LL(S2)->PM7/8:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime2=endTime2+1;
                    startTime2 = endTime2-(50 + findDistance1(finalPosition0,finalPosition1) + 50);
                }
                if (j==9999){
                    System.out.println("LL(S2)->PM7/8:TM2阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM7/8->PM9/10:TM2
        int startTime3;
        int endTime3;
//        finalPosition2=changePM910(finalPosition1,endTime2+850,machineList,cleanMachineList,endTime2,finalPosition1);
        startTime3=endTime2+850;
        endTime3=startTime3+50+findDistance1(finalPosition1,finalPosition2)+50;
        boolean b7=(endTime3-50>=lookLastTime(lookWorkingListSize(finalPosition2,machineList)-1,finalPosition2,machineList)+50);
        boolean b8=checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,finalPosition2,machineList,endTime2,finalPosition1);
        boolean a2=checkMachine_PM(endTime3-50,finalPosition2,cleanMachineList);
        if (b7&&b8&&a2){
            if (finalPosition1.equals("PM7")){
                procedureList.add(new Procedure("PM7",14,startTime3-endTime2,endTime2,startTime3));
                procedureList.add(new Procedure("PM8",15,0,startTime3,startTime3));
                procedureList.add(new Procedure("TM2",4,endTime3-startTime3,startTime3,endTime3));
            }else{
                procedureList.add(new Procedure("PM7",14,0,endTime2,endTime2));
                procedureList.add(new Procedure("PM8",15,startTime3-endTime2,endTime2,startTime3));
                procedureList.add(new Procedure("TM2",4,endTime3-startTime3,startTime3,endTime3));
            }
        }else{
            endTime3=lookLastTime(lookWorkingListSize(finalPosition2,machineList)-1,finalPosition2,machineList)+50+50;
            startTime3=endTime3-(50+findDistance1(finalPosition1,finalPosition2)+50);
            if (startTime3<endTime2+850){
                startTime3=endTime2+850;
                endTime3=startTime3+50+findDistance1(finalPosition1,finalPosition2)+50;
            }
            //改动部分
            int startTimeMax=startTime3;
            do {
                if (!checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,finalPosition2,machineList,endTime2,finalPosition1))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime3,endTime3,"TM2",finalPosition1,finalPosition2,machineList,endTime2,finalPosition1));
                if (!checkMachine_PM(endTime3-50,finalPosition2,cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime3-50,finalPosition2,cleanMachineList)+50-(50+findDistance1(finalPosition1,finalPosition2)+50));
                startTime3=startTimeMax;
                endTime3=startTime3+50+findDistance1(finalPosition1,finalPosition2)+50;
            } while (!(checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,finalPosition2,machineList,endTime2,finalPosition1)&&checkMachine_PM(endTime3-50,finalPosition2,cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime2+850,startTime3,endTime3,"TM2",finalPosition1,finalPosition2,false,false,true,machineList,cleanMachineList,endTime2,finalPosition1);
            if (newTime.size()!=0){
                startTime3=newTime.get(newTime.size()-2);
                endTime3=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b8=counter==1||checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,finalPosition2,machineList,endTime2,finalPosition1);
                a2=checkMachine_PM(endTime3-50,finalPosition2,cleanMachineList);
                if (b8&&a2){
                    if (finalPosition1.equals("PM7")){
                        procedureList.add(new Procedure("PM7",14,startTime3-endTime2,endTime2,startTime3));
                        procedureList.add(new Procedure("PM8",15,0,startTime3,startTime3));
                        procedureList.add(new Procedure("TM2",4,endTime3-startTime3,startTime3,endTime3));
                    }else{
                        procedureList.add(new Procedure("PM7",14,0,endTime2,endTime2));
                        procedureList.add(new Procedure("PM8",15,startTime3-endTime2,endTime2,startTime3));
                        procedureList.add(new Procedure("TM2",4,endTime3-startTime3,startTime3,endTime3));
                    }
                    if (j!=0)
                        System.out.println("changeTM910阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime3=endTime3+1;
                    startTime3=endTime3-(50+findDistance1(finalPosition1,finalPosition2)+50);
                }
                if (j==9999)
                    System.out.println("changeTM910阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine(finalPosition1,machineList,cleaningList,startTime3+50);

        //PM9/10->LLC:TM2
        int startTime4;
        int endTime4;
        startTime4=endTime3+700;
        endTime4=startTime4 + 50 + findDistance1(finalPosition2,"LLC") + 50;
        boolean b9=(endTime4-50>=lookLastTime(lookWorkingListSize("LLC",machineList)-1,"LLC",machineList)+50);
        boolean b10=checkMachine_TM23(startTime4,endTime4,"TM2",finalPosition2,"LLC",machineList,endTime3,finalPosition2);
        if (b9&&b10) {
            if (finalPosition2.equals("PM9")){
                procedureList.add(new Procedure("PM9", 16, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM10", 17, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            }else{
                procedureList.add(new Procedure("PM9", 16, 0,endTime3,endTime3));
                procedureList.add(new Procedure("PM10", 17, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            }
        }else {
            endTime4 = lookLastTime(lookWorkingListSize("LLC", machineList)-1, "LLC", machineList)+50+50;
            startTime4= endTime4-(50 + findDistance1(finalPosition2,"LLC") + 50);
            if (startTime4<endTime3+700){
                startTime4=endTime3+700;
                endTime4=startTime4 + 50 + findDistance1(finalPosition2,"LLC") + 50;
            }
            //改动部分
            int startTimeMax=startTime4;
//            do {
            if (!checkMachine_TM23(startTime4,endTime4,"TM2",finalPosition2,"LLC",machineList,endTime3,finalPosition2))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime4,endTime4,"TM2",finalPosition2,"LLC",machineList,endTime3,finalPosition2));
            startTime4=startTimeMax;
            endTime4=startTime4 + 50 + findDistance1(finalPosition2,"LLC") + 50;
//            }while(!checkMachine_TM23(startTime4,endTime4,"TM2",finalPosition2,"LLC",machineList,endTime3,finalPosition2));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime3+700,startTime4,endTime4,"TM2",finalPosition2,"LLC",false,false,false,machineList,cleanMachineList,endTime3,finalPosition2);
            if (newTime.size()!=0){
                startTime4=newTime.get(newTime.size()-2);
                endTime4= newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b10=counter==1||checkMachine_TM23(startTime4,endTime4,"TM2",finalPosition2,"LLC",machineList,endTime3,finalPosition2);
                if (b10) {
                    if (finalPosition2.equals("PM9")){
                        procedureList.add(new Procedure("PM9", 16, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM10", 17, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    }else{
                        procedureList.add(new Procedure("PM9", 16, 0,endTime3,endTime3));
                        procedureList.add(new Procedure("PM10", 17, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    }
                    if (j!=0)
                        System.out.println("PM9/10->LLC:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime4=endTime4+1;
                    startTime4= endTime4-(50 + findDistance1(finalPosition2,"LLC") + 50);
                }
                if (j==9999)
                    System.out.println("PM9/10->LLC:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine(finalPosition2,machineList,cleaningList,startTime4+50);

        //LLC->PM3:TM3
        int startTime5;
        int endTime5;
        startTime5=endTime4;
        endTime5=startTime5 + 50 + findDistance2("LLC","PM3") + 50;
        boolean b11=(endTime5-50>=lookLastTime(lookWorkingListSize("PM3",machineList)-1,"PM3",machineList)+50);
        boolean b12=checkMachine_TM23(startTime5,endTime5,"TM3","LLC","PM3",machineList,endTime4,"LLC");
        boolean a3=checkMachine_PM(endTime5-50,"PM3",cleanMachineList);
        if (b11&&b12&&a3) {
            procedureList.add(new Procedure("LLC", 6, startTime5 - endTime4, endTime4, startTime5));
            procedureList.add(new Procedure("TM3", 5, endTime5 - startTime5, startTime5, endTime5));
        }else {
            endTime5 = lookLastTime(lookWorkingListSize("PM3",machineList)-1,"PM3",machineList)+50+50;
            startTime5 = endTime5-(50 + findDistance2("LLC","PM3") + 50);
            if (startTime5<endTime4){
                startTime5=endTime4;
                endTime5=startTime5 + 50 + findDistance2("LLC","PM3") + 50;
            }
            //改动部分
            int startTimeMax=startTime5;
            do {
                if (!checkMachine_TM23(startTime5,endTime5,"TM3","LLC","PM3",machineList,endTime4,"LLC"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime5,endTime5,"TM3","LLC","PM3",machineList,endTime4,"LLC"));
                if (!checkMachine_PM(endTime5-50,"PM3",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime5-50,"PM3",cleanMachineList)+50-(50 + findDistance2("LLC","PM3") + 50));
                startTime5=startTimeMax;
                endTime5=startTime5 + 50 + findDistance2("LLC","PM3") + 50;
            }while (!(checkMachine_TM23(startTime5,endTime5,"TM3","LLC","PM3",machineList,endTime4,"LLC")&&checkMachine_PM(endTime5-50,"PM3",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime4,startTime5,endTime5,"TM3","LLC","PM3",false,false,true,machineList,cleanMachineList,endTime4,"LLC");
            if (newTime.size()!=0){
                startTime5=newTime.get(newTime.size()-2);
                endTime5=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b12=counter==1||checkMachine_TM23(startTime5,endTime5,"TM3","LLC","PM3",machineList,endTime4,"LLC");
                a3=checkMachine_PM(endTime5-50,"PM3",cleanMachineList);
                if (b12&&a3) {
                    procedureList.add(new Procedure("LLC", 6, startTime5 - endTime4, endTime4, startTime5));
                    procedureList.add(new Procedure("TM3", 5, endTime5 - startTime5, startTime5, endTime5));
                    if (j!=0)
                        System.out.println("LLC->PM3:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime5=endTime5+1;
                    startTime5 = endTime5-(50 + findDistance2("LLC","PM3") + 50);
                }
                if (j==9999)
                    System.out.println("LLC->PM3:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM3->PM1:TM3
        int startTime6;
        int endTime6;
        startTime6=endTime5+900;
        endTime6=startTime6 + 50 + findDistance2("PM3","PM1") + 50;
        boolean b13=(endTime6-50>=lookLastTime(lookWorkingListSize("PM1",machineList)-1,"PM1",machineList)+50);
        boolean b14=checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM1",machineList,endTime5,"PM3");
        boolean a4=checkMachine_PM(endTime6-50,"PM1",cleanMachineList);
        if (b13&&b14&&a4) {
            procedureList.add(new Procedure("PM3", 10, startTime6 - endTime5, endTime5, startTime6));
            procedureList.add(new Procedure("TM3", 5, endTime6 - startTime6, startTime6, endTime6));
        }else {
            endTime6 = lookLastTime(lookWorkingListSize("PM1",machineList)-1,"PM1",machineList)+50+50;
            startTime6 = endTime6-(50 + findDistance2("PM3","PM1") + 50);
            if (startTime6<endTime5+900){
                startTime6=endTime5+900;
                endTime6=startTime6 + 50 + findDistance2("PM3","PM1") + 50;
            }
            //改动部分
            int startTimeMax=startTime6;
            do {
                if (!checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM1",machineList,endTime5,"PM3"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime6,endTime6,"TM3","PM3","PM1",machineList,endTime5,"PM3"));
                if (!checkMachine_PM(endTime6-50,"PM1",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime6-50,"PM1",cleanMachineList)+50-(50 + findDistance2("PM3","PM1") + 50));
                startTime6=startTimeMax;
                endTime6=startTime6 + 50 + findDistance2("PM3","PM1") + 50;
            }while (!(checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM1",machineList,endTime5,"PM3")&&checkMachine_PM(endTime6-50,"PM1",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime5+900,startTime6,endTime6,"TM3","PM3","PM1",false,false,true,machineList,cleanMachineList,endTime5,"PM3");
            if (newTime.size()!=0){
                startTime6=newTime.get(newTime.size()-2);
                endTime6=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b14=counter==1||checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM1",machineList,endTime5,"PM3");
                a4=checkMachine_PM(endTime6-50,"PM1",cleanMachineList);
                if (b14&&a4) {
                    procedureList.add(new Procedure("PM3", 10, startTime6 - endTime5, endTime5, startTime6));
                    procedureList.add(new Procedure("TM3", 5, endTime6 - startTime6, startTime6, endTime6));
                    if (j!=0)
                        System.out.println("PM3->PM1:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime6=endTime6+1;
                    startTime6 = endTime6-(50 + findDistance2("PM3","PM1") + 50);
                }
                if (j==9999)
                    System.out.println("PM3->PM1:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM3",machineList,cleaningList,startTime6+50);

        //PM1->LLD:TM3
        int startTime7;
        int endTime7;
        startTime7=endTime6+800;
        endTime7=startTime7+50+findDistance2("PM1","LLD")+50;
        boolean b15=(endTime7-50>=lookLastTime(lookWorkingListSize("LLD",machineList)-1,"LLD",machineList)+50);
        boolean b16=checkMachine_TM23(startTime7,endTime7,"TM3","PM1","LLD",machineList,endTime6,"PM1");
        if (b15&&b16){
            procedureList.add(new Procedure("PM1",8,startTime7-endTime6,endTime6,startTime7));
            procedureList.add(new Procedure("TM3",5,endTime7-startTime7,startTime7,endTime7));
        }else{
            endTime7=lookLastTime(lookWorkingListSize("LLD",machineList)-1,"LLD",machineList)+50+50;
            startTime7=endTime7-(50+findDistance2("PM1","LLD")+50);
            if (startTime7<endTime6+800){
                startTime7=endTime6+800;
                endTime7=startTime7+50+findDistance2("PM1","LLD")+50;
            }
            //改动部分
            int startTimeMax=startTime7;
//            do {
            if (!checkMachine_TM23(startTime7,endTime7,"TM3","PM1","LLD",machineList,endTime6,"PM1"))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime7,endTime7,"TM3","PM1","LLD",machineList,endTime6,"PM1"));
            startTime7=startTimeMax;
            endTime7=startTime7+50+findDistance2("PM1","LLD")+50;
//            }while (!checkMachine_TM23(startTime7,endTime7,"TM3","PM1","LLD",machineList,endTime6,"PM1"));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime6+800,startTime7,endTime7,"TM3","PM1","LLD",false,false,false,machineList,cleanMachineList,endTime6,"PM1");
            if (newTime.size()!=0){
                startTime7=newTime.get(newTime.size()-2);
                endTime7=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b16=counter==1||checkMachine_TM23(startTime7,endTime7,"TM3","PM1","LLD",machineList,endTime6,"PM1");
                if (b16){
                    procedureList.add(new Procedure("PM1",8,startTime7-endTime6,endTime6,startTime7));
                    procedureList.add(new Procedure("TM3",5,endTime7-startTime7,startTime7,endTime7));
                    if (j!=0)
                        System.out.println("PM1->LLD:TM3阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime7=endTime7+1;
                    startTime7=endTime7-(50+findDistance2("PM1","LLD")+50);
                }
                if (j==9999)
                    System.out.println("PM1->LLD:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM1",machineList,cleaningList,startTime7+50);

        //LLD->LL(S1):TM2
        int startTime8;
        int endTime8;
//        finalPosition3=changeLL1("LLD",endTime7+450,machineList,endTime7,"LLD");
        startTime8=endTime7+450;
        endTime8=startTime8+50+findDistance1("LLD",finalPosition3)+50;
        boolean b17=(endTime8-50>=lookLastTime(lookWorkingListSize(finalPosition3+"(S1)",machineList)-1,finalPosition3+"(S1)",machineList)+200);
        boolean b18=checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD");
        boolean b19=checkMachineState1(endTime8-50,finalPosition3,machineList);
        if (b17&&b18&&b19){
            procedureList.add(new Procedure("LLD",7,startTime8-endTime7,endTime7,startTime8));
            procedureList.add(new Procedure("TM2",4,endTime8-startTime8,startTime8,endTime8));
        }else{
            endTime8=lookLastTime(lookWorkingListSize(finalPosition3+"(S1)",machineList)-1,finalPosition3+"(S1)",machineList)+200+50;
            startTime8=endTime8-(50+findDistance1("LLD",finalPosition3)+50);
            if (startTime8<endTime7+450){
                startTime8=endTime7+450;
                endTime8=startTime8+50+findDistance1("LLD",finalPosition3)+50;
            }
            //改动部分
            int startTimeMax=startTime8;
            do {
                if (!checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD"));
                if (!checkMachineState1(endTime8-50,finalPosition3,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(endTime8-50,finalPosition3,machineList)+50-(50+findDistance1("LLD",finalPosition3)+50));
                startTime8=startTimeMax;
                endTime8=startTime8+50+findDistance1("LLD",finalPosition3)+50;
            }while (!(checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD")&&checkMachineState1(endTime8-50,finalPosition3,machineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime7+450,startTime8,endTime8,"TM2","LLD",finalPosition3,true,false,false,machineList,cleanMachineList,endTime7,"LLD");
            if (newTime.size()!=0){
                startTime8=newTime.get(newTime.size()-2);
                endTime8=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b18=counter==1||checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD");
                b19=checkMachineState1(endTime8-50,finalPosition3,machineList);
                if (b18&b19){
                    procedureList.add(new Procedure("LLD",7,startTime8-endTime7,endTime7,startTime8));
                    procedureList.add(new Procedure("TM2",4,endTime8-startTime8,startTime8,endTime8));
                    if (j!=0)
                        System.out.println("LLD->LL(S1):TM2阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime8=endTime8+1;
                    startTime8=endTime8-(50+findDistance1("LLD",finalPosition3)+50);
                }
                if (j==9999)
                    System.out.println("LLD->LL(S1):TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //LL(S1)->LP2:TM1
        int startTime9;
        int endTime9;
        if ((procedureList.size()-20)/23==25)
            startTime9=Math.max(endTime8+200,(procedureList.get(procedureList.size()-21).getEtime()+lookDistance("LP1",finalPosition3,distanceTable)));
        else
            startTime9=Math.max(endTime8+200,(procedureList.get(procedureList.size()-21).getEtime()+lookDistance("LP2",finalPosition3,distanceTable)));
        endTime9=startTime9+50+lookDistance(finalPosition3,"LP2",distanceTable)+50;
        boolean b20=checkMachine_TM1(startTime9,endTime9,"TM1",finalPosition3,"LP2",machineList,distanceTable,0,null);
        boolean b21=checkMachineState(startTime9,finalPosition3,machineList);
        if (b20&b21){
            if (finalPosition3.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime9 - endTime8, endTime8, startTime9));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime9, startTime9));
                procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
            }else{
                procedureList.add(new Procedure("LLA" + "(S1)", 2, 0,endTime8,endTime8));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime9 - endTime8, endTime8, startTime9));
                procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
            }
        }else{
            TM1:for (int j = 0; j < 10000; j++) {
                b20=checkMachine_TM1(startTime9,endTime9,"TM1",finalPosition3,"LP2",machineList,distanceTable,0,null);
                b21=checkMachineState(startTime9,finalPosition3,machineList);
                if (b20&&b21){
                    if (finalPosition3.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime9 - endTime8, endTime8, startTime9));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime9, startTime9));
                        procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
                    }else{
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, 0,endTime8,endTime8));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime9 - endTime8, endTime8, startTime9));
                        procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
                    }
                    if (j!=0)
                        System.out.println("LL(S1)->LP2:TM1阈值过小!!!"+j);
                    break TM1;
                }else{
                    endTime9=endTime9+1;
                    startTime9=endTime9-(50 + lookDistance(finalPosition3,"LP2",distanceTable) + 50);
                }
                if (j==9999)
                    System.out.println("LL(S1)->LP2:TM1阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
//        System.out.println("晶圆编号："+(i+1));
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
//        List<Ordering_Bmachine> orderingBmachines=new ArrayList<>();
//        orderingBmachines.add(new Ordering_Bmachine(finalPosition0, finalPosition1, finalPosition2, finalPosition3));
//        System.out.print(orderingBmachines.get(0).toString());
//        System.out.print(",");
        return machineList;
    }
    public List<Machine> LP3(String finalPosition0,String finalPosition1,String finalPosition2,String finalPosition3,List<Procedure> procedureList,List<Distance> distanceTable,List<Machine> machineList,List<Machine> cleanMachineList,List<Cleaning> cleaningList,int i) {
        //LP3->AL:TM1
        int startTime;
        int endTime;
        startTime=procedureList.get(procedureList.size()-21).getEtime()+lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size()-21).getEtime(),machineList,0,null),"LP3",distanceTable);
        endTime=startTime+50+lookDistance("LP3","AL",distanceTable)+50;
        boolean b01=checkMachine_TM1(startTime,endTime,"TM1","LP3","AL",machineList,distanceTable,0,null);
        boolean b02=checkMachine(endTime,endTime+10,"AL",machineList);
        if (b01 && b02) {
            procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
        }else {
            //改动部分
            int startTimeMax=startTime;
            if (!checkMachine_TM1(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null)) {
                startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null));
            }
            startTime=startTimeMax;
            endTime = startTime + 50 + lookDistance("LP3", "AL", distanceTable) + 50;
            //改动部分
            TM1:for (int j = 0; j < 10000; j++) {
                b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null);
                b02 = checkMachine(endTime, endTime + 10, "AL", machineList);
                if (b01 && b02) {
                    procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
                    if (j!=0)
                        System.out.println("LP3->AL:TM1阈值过小!!!"+j);
                    break TM1;
                } else {
                    startTime = startTime + 1;
                    endTime = startTime + 50 + lookDistance("LP3", "AL", distanceTable) + 50;
                }
                if (j == 9999) {
                    System.out.println("LP3->AL:TM1阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //AL->LL(S2):TM1
        int startTime1;
        int endTime1;
//        finalPosition0=changeLL("AL",endTime+100,machineList,distanceTable,endTime,"AL");
        startTime1=endTime+100;
        endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
        boolean b1=checkMachineState(endTime1-50,finalPosition0,machineList);
        boolean b2=(lookLastTime(lookWorkingListSize(finalPosition0+"(S2)", machineList)-1, finalPosition0+"(S2)", machineList)+250<=endTime1-50);
        boolean b3=checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL");
        if (b1&&b2&&b3) {
            procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
            procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
        }else {
            endTime1 = lookLastTime(lookWorkingListSize(finalPosition0+"(S2)", machineList)-1, finalPosition0+"(S2)", machineList)+50+200+50;
            startTime1 = endTime1-(50 + lookDistance("AL",finalPosition0,distanceTable) + 50);
            if (startTime1<endTime+100){
                startTime1=endTime+100;
                endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
            }
            //改动部分
            int startTimeMax=startTime1;
            do {
                if (!checkMachineState(endTime1-50,finalPosition0,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState_Out(endTime1-50,finalPosition0,machineList)+50-(50 + lookDistance("AL", finalPosition0, distanceTable) + 50));
                if (!checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM1_Out(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL"));
                startTime1=startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance("AL",finalPosition0,distanceTable) + 50;
            }while(!(checkMachineState(endTime1-50,finalPosition0,machineList)&&checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL")));
            //改动部分
            TM1:for (int j = 0; j < 10000; j++) {
                b1=checkMachineState(endTime1-50,finalPosition0,machineList);
                b3=checkMachine_TM1(startTime1,endTime1,"TM1","AL",finalPosition0,machineList,distanceTable,endTime,"AL");
                if (b1 && b3) {
                    procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
                    procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
                    if (j!=0)
                        System.out.println("AL->LL(S2):TM1阈值过小!!!"+j);
                    break TM1;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50);
                }
                if (j == 9999) {
                    System.out.println("AL->LL(S2):TM1阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //LL(S2)->PM7/8:TM2
        int startTime2;
        int endTime2;
//        finalPosition1=changePM78(finalPosition0,endTime1+150,machineList,cleanMachineList,endTime1,finalPosition0);
        startTime2=endTime1+150;
        endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
        boolean b4=(endTime2-50>=lookLastTime(lookWorkingListSize(finalPosition1,machineList)-1,finalPosition1,machineList)+50);
        boolean b5=checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
        boolean b6=checkMachineState1(startTime2,finalPosition0,machineList);
        boolean a1=checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList);
        if (b4&&b5&&b6&&a1) {
            if (finalPosition0.equals("LLA")){
                procedureList.add(new Procedure("LLA"+"(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("LLB"+"(S2)", 3, 0,startTime2,startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }else {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }
        }else {
            endTime2 = lookLastTime(lookWorkingListSize(finalPosition1, machineList)-1, finalPosition1, machineList)+50+50;
            startTime2 = endTime2-(50 + findDistance1(finalPosition0,finalPosition1) + 50);
            if (startTime2<endTime1+150){
                startTime2=endTime1+150;
                endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
            }
            //改动部分
            int startTimeMax=startTime2;
            do {
                if (!checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0));
                if (!checkMachineState1(startTime2,finalPosition0,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(startTime2,finalPosition0,machineList));
                if (!checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime2-50,finalPosition1,cleanMachineList)+50-(50 + findDistance1(finalPosition0,finalPosition1) + 50));
                startTime2=startTimeMax;
                endTime2=startTime2 + 50 + findDistance1(finalPosition0,finalPosition1) + 50;
            }while (!(checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0)&&checkMachineState1(startTime2,finalPosition0,machineList)&&checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,true,true,true,machineList,cleanMachineList,endTime1,finalPosition0);
            if (newTime.size()!=0){
                startTime2=newTime.get(newTime.size()-2);
                endTime2=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b5=counter==1||checkMachine_TM23(startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
                b6=checkMachineState1(startTime2,finalPosition0,machineList);
                a1=checkMachine_PM(endTime2-50,finalPosition1,cleanMachineList);
                if (b5&&b6&a1) {
                    if (finalPosition0.equals("LLA")){
                        procedureList.add(new Procedure("LLA"+"(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("LLB"+"(S2)", 3, 0,startTime2,startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }else {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }
                    if (j!=0)
                        System.out.println("LL(S2)->PM7/8:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime2=endTime2+1;
                    startTime2 = endTime2-(50 + findDistance1(finalPosition0,finalPosition1) + 50);
                }
                if (j==9999){
                    System.out.println("LL(S2)->PM7/8:TM2阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM7/8->LLC:TM2
        int startTime3;
        int endTime3;
        startTime3=endTime2+850;
        endTime3=startTime3 + 50 + findDistance1(finalPosition1,"LLC") + 50;
        boolean b7=(endTime3-50>=lookLastTime(lookWorkingListSize("LLC",machineList)-1,"LLC",machineList)+50);
        boolean b8=checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1);
        if (b7&&b8) {
            if (finalPosition1.equals("PM7")){
                procedureList.add(new Procedure("PM7", 14, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("PM8", 15, 0, startTime3, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }else{
                procedureList.add(new Procedure("PM7", 14, 0, endTime2,endTime2));
                procedureList.add(new Procedure("PM8", 15, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }
        }else {
            endTime3 = lookLastTime(lookWorkingListSize("LLC", machineList)-1, "LLC", machineList)+50+50;
            startTime3 = endTime3-(50 + findDistance1(finalPosition1,"LLC") + 50);
            if (startTime3<endTime2+850){
                startTime3=endTime2+850;
                endTime3=startTime3 + 50 + findDistance1(finalPosition1,"LLC") + 50;
            }
            //改动部分
            int startTimeMax=startTime3;
//            do {
            if (!checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1));
            startTime3=startTimeMax;
            endTime3=startTime3 + 50 + findDistance1(finalPosition1,"LLC") + 50;
//            }while (!checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime2+850,startTime3,endTime3,"TM2",finalPosition1,"LLC",false,false,false,machineList,cleanMachineList,endTime2,finalPosition1);
            if (newTime.size()!=0){
                startTime3=newTime.get(newTime.size()-2);
                endTime3=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b8=counter==1||checkMachine_TM23(startTime3,endTime3,"TM2",finalPosition1,"LLC",machineList,endTime2,finalPosition1);
                if (b8) {
                    if (finalPosition1.equals("PM7")){
                        procedureList.add(new Procedure("PM7", 14, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("PM8", 15, 0, startTime3, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }else{
                        procedureList.add(new Procedure("PM7", 14, 0, endTime2,endTime2));
                        procedureList.add(new Procedure("PM8", 15, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }
                    if (j!=0)
                        System.out.println("PM7/8->LLC:TM2阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime3=endTime3+1;
                    startTime3 = endTime3-(50 + findDistance1(finalPosition1,"LLC") + 50);
                }
                if (j==9999)
                    System.out.println("PM7/8->LLC:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine(finalPosition1,machineList,cleaningList,startTime3+50);

        //LLC->PM1:TM3
        int startTime4;
        int endTime4;
        startTime4=endTime3;
        endTime4=startTime4 + 50 + findDistance2("LLC","PM1") + 50;
        boolean b9=(endTime4-50>=lookLastTime(lookWorkingListSize("PM1",machineList)-1,"PM1",machineList)+50);
        boolean b10=checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM1",machineList,endTime3,"LLC");
        boolean a2=checkMachine_PM(endTime4-50,"PM1",cleanMachineList);
        if (b9&&b10&&a2) {
            procedureList.add(new Procedure("LLC", 6, startTime4 - endTime3, endTime3, startTime4));
            procedureList.add(new Procedure("TM3", 5, endTime4 - startTime4, startTime4, endTime4));
        }else {
            endTime4 = lookLastTime(lookWorkingListSize("PM1", machineList)-1, "PM1", machineList)+50+50;
            startTime4 = endTime4-(50 + findDistance2("LLC","PM1") + 50);
            if (startTime4<endTime3){
                startTime4=endTime3;
                endTime4=startTime4 + 50 + findDistance2("LLC","PM1") + 50;
            }
            //改动部分
            int startTimeMax=startTime4;
            do {
                if (!checkMachine_TM23(startTime4, endTime4, "TM3", "LLC", "PM1", machineList, endTime3, "LLC"))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM23_Out(startTime4, endTime4, "TM3", "LLC", "PM1", machineList, endTime3, "LLC"));
                if (!checkMachine_PM(endTime4-50,"PM1",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime4-50,"PM1",cleanMachineList)+50-(50 + findDistance2("LLC","PM1") + 50));
                startTime4 = startTimeMax;
                endTime4=startTime4 + 50 + findDistance2("LLC","PM1") + 50;
            }while (!(checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM1",machineList,endTime3,"LLC")&&checkMachine_PM(endTime4-50,"PM1",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime3,startTime4,endTime4,"TM3","LLC","PM1",false,false,true,machineList,cleanMachineList,endTime3,"LLC");
            if (newTime.size()!=0){
                startTime4=newTime.get(newTime.size()-2);
                endTime4=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b10=counter==1||checkMachine_TM23(startTime4,endTime4,"TM3","LLC","PM1",machineList,endTime3,"LLC");
                a2=checkMachine_PM(endTime4-50,"PM1",cleanMachineList);
                if (b10&&a2) {
                    procedureList.add(new Procedure("LLC", 6, startTime4 - endTime3, endTime3, startTime4));
                    procedureList.add(new Procedure("TM3", 5, endTime4 - startTime4, startTime4, endTime4));
                    if (j!=0)
                        System.out.println("LLC->PM1:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime4=endTime4+1;
                    startTime4 = endTime4-(50 + findDistance2("LLC","PM1") + 50);
                }
                if (j==9999)
                    System.out.println("LLC->PM1:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);

        //PM1->PM3:TM3
        int startTime5;
        int endTime5;
        startTime5=endTime4+750;
        endTime5=startTime5 + 50 + findDistance2("PM1","PM3") + 50;
        boolean b11=(endTime5-50>=lookLastTime(lookWorkingListSize("PM3",machineList)-1,"PM3",machineList)+50);
        boolean b12=checkMachine_TM23(startTime5,endTime5,"TM3","PM1","PM3",machineList,endTime4,"PM1");
        boolean a3=checkMachine_PM(endTime5-50,"PM3",cleanMachineList);
        if (b11&b12&&a3){
            procedureList.add(new Procedure("PM1", 8, startTime5 - endTime4, endTime4, startTime5));
            procedureList.add(new Procedure("TM3", 5, endTime5 - startTime5, startTime5, endTime5));
        }else{
            endTime5 = lookLastTime(lookWorkingListSize("PM3", machineList)-1, "PM3", machineList)+50+50;
            startTime5 = endTime5-(50 + findDistance2("PM1","PM3") + 50);
            if (startTime5<endTime4+750){
                startTime5=endTime4+750;
                endTime5=startTime5 + 50 + findDistance2("PM1","PM3") + 50;
            }
            //改动部分
            int startTimeMax=startTime5;
            do {
                if (!checkMachine_TM23(startTime5,endTime5,"TM3","PM1","PM3",machineList,endTime4,"PM1"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime5,endTime5,"TM3","PM1","PM3",machineList,endTime4,"PM1"));
                if (!checkMachine_PM(endTime5-50,"PM3",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime5-50,"PM3",cleanMachineList)+50-(50 + findDistance2("PM1","PM3") + 50));
                startTime5=startTimeMax;
                endTime5=startTime5 + 50 + findDistance2("PM1","PM3") + 50;
            }while (!(checkMachine_TM23(startTime5,endTime5,"TM3","PM1","PM3",machineList,endTime4,"PM1")&&checkMachine_PM(endTime5-50,"PM3",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime4+750,startTime5,endTime5,"TM3","PM1","PM3",false,false,true,machineList,cleanMachineList,endTime4,"PM1");
            if (newTime.size()!=0){
                startTime5=newTime.get(newTime.size()-2);
                endTime5=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b12=counter==1||checkMachine_TM23(startTime5,endTime5,"TM3","PM1","PM3",machineList,endTime4,"PM1");
                a3=checkMachine_PM(endTime5-50,"PM3",cleanMachineList);
                if (b12&&a3) {
                    procedureList.add(new Procedure("PM1", 8, startTime5 - endTime4, endTime4, startTime5));
                    procedureList.add(new Procedure("TM3", 5, endTime5 - startTime5, startTime5, endTime5));
                    if (j!=0)
                        System.out.println("PM1->PM3:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime5=endTime5+1;
                    startTime5 = endTime5-(50 + findDistance2("PM1","PM3") + 50);
                }
                if (j==9999)
                    System.out.println("PM1->PM3:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM1",machineList,cleaningList,startTime5+50);

        //PM3->PM6:TM3
        int startTime6;
        int endTime6;
        startTime6=endTime5+700;
        endTime6=startTime6 + 50 + findDistance2("PM3","PM6") + 50;
        boolean b13=(endTime6-50>=lookLastTime(lookWorkingListSize("PM6",machineList)-1,"PM6",machineList)+50);
        boolean b14=checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM6",machineList,endTime5,"PM3");
        boolean a4=checkMachine_PM(endTime6-50,"PM6",cleanMachineList);
        if (b13&b14&&a4){
            procedureList.add(new Procedure("PM3", 10, startTime6 - endTime5, endTime5, startTime6));
            procedureList.add(new Procedure("TM3", 5, endTime6 - startTime6, startTime6, endTime6));
        }else{
            endTime6 = lookLastTime(lookWorkingListSize("PM6",machineList)-1,"PM6",machineList)+50+50;
            startTime6 = endTime6-(50 + findDistance2("PM3","PM6") + 50);
            if (startTime6<endTime5+700){
                startTime6=endTime5+700;
                endTime6=startTime6 + 50 + findDistance2("PM3","PM6") + 50;
            }
            //改动部分
            int startTimeMax=startTime6;
            do {
                if (!checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM6",machineList,endTime5,"PM3"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime6,endTime6,"TM3","PM3","PM6",machineList,endTime5,"PM3"));
                if (!checkMachine_PM(endTime6-50,"PM6",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime6-50,"PM6",cleanMachineList)+50-(50 + findDistance2("PM3","PM6") + 50));
                startTime6=startTimeMax;
                endTime6=startTime6 + 50 + findDistance2("PM3","PM6") + 50;
            }while (!(checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM6",machineList,endTime5,"PM3")&&checkMachine_PM(endTime6-50,"PM6",cleanMachineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime5+700,startTime6,endTime6,"TM3","PM3","PM6",false,false,true,machineList,cleanMachineList,endTime5,"PM3");
            if (newTime.size()!=0){
                startTime6=newTime.get(newTime.size()-2);
                endTime6=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b14=counter==1||checkMachine_TM23(startTime6,endTime6,"TM3","PM3","PM6",machineList,endTime5,"PM3");
                a4=checkMachine_PM(endTime6-50,"PM6",cleanMachineList);
                if (b14&&a4) {
                    procedureList.add(new Procedure("PM3", 10, startTime6 - endTime5, endTime5, startTime6));
                    procedureList.add(new Procedure("TM3", 5, endTime6 - startTime6, startTime6, endTime6));
                    if (j!=0)
                        System.out.println("PM3->PM6:TM3阈值过小!!!"+j);
                    break TM2;
                }else {
                    endTime6=endTime6+1;
                    startTime6 = endTime6-(50 + findDistance2("PM3","PM6") + 50);
                }
                if (j==9999)
                    System.out.println("PM3->PM6:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM3",machineList,cleaningList,startTime6+50);

        //PM6->LLD:TM3
        int startTime7;
        int endTime7;
        startTime7=endTime6+850;
        endTime7=startTime7+50+findDistance2("PM6","LLD")+50;
        boolean b15=(endTime7-50>=lookLastTime(lookWorkingListSize("LLD",machineList)-1,"LLD",machineList)+50);
        boolean b16=checkMachine_TM23(startTime7,endTime7,"TM3","PM6","LLD",machineList,endTime6,"PM6");
        if (b15&&b16){
            procedureList.add(new Procedure("PM6",13,startTime7-endTime6,endTime6,startTime7));
            procedureList.add(new Procedure("TM3",5,endTime7-startTime7,startTime7,endTime7));
        }else{
            endTime7=lookLastTime(lookWorkingListSize("LLD",machineList)-1,"LLD",machineList)+50+50;
            startTime7=endTime7-(50+findDistance2("PM6","LLD")+50);
            if (startTime7<endTime6+850){
                startTime7=endTime6+850;
                endTime7=startTime7+50+findDistance2("PM6","LLD")+50;
            }
            //改动部分
            int startTimeMax=startTime7;
//            do {
            if (!checkMachine_TM23(startTime7,endTime7,"TM3","PM6","LLD",machineList,endTime6,"PM6"))
                startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime7,endTime7,"TM3","PM6","LLD",machineList,endTime6,"PM6"));
            startTime7=startTimeMax;
            endTime7=startTime7+50+findDistance2("PM6","LLD")+50;
//            }while (!checkMachine_TM23(startTime7,endTime7,"TM3","PM6","LLD",machineList,endTime6,"PM6"));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime6+850,startTime7,endTime7,"TM3","PM6","LLD",false,false,false,machineList,cleanMachineList,endTime6,"PM6");
            if (newTime.size()!=0){
                startTime7=newTime.get(newTime.size()-2);
                endTime7=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b16=counter==1||checkMachine_TM23(startTime7,endTime7,"TM3","PM6","LLD",machineList,endTime6,"PM6");
                if (b16){
                    procedureList.add(new Procedure("PM6",13,startTime7-endTime6,endTime6,startTime7));
                    procedureList.add(new Procedure("TM3",5,endTime7-startTime7,startTime7,endTime7));
                    if (j!=0)
                        System.out.println("PM6->LLD:TM3阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime7=endTime7+1;
                    startTime7=endTime7-(50+findDistance2("PM6","LLD")+50);
                }
                if (j==9999)
                    System.out.println("PM6->LLD:TM3阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        cleanMachineList=cleanMachine("PM6",machineList,cleaningList,startTime7+50);
        //LLD->LL(S1):TM2
        int startTime8;
        int endTime8;
//        finalPosition3=changeLL1("LLD",endTime7+450,machineList,endTime7,"LLD");
        startTime8=endTime7+450;
        endTime8=startTime8+50+findDistance1("LLD",finalPosition3)+50;
        boolean b17=(endTime8-50>=lookLastTime(lookWorkingListSize(finalPosition3+"(S1)",machineList)-1,finalPosition3+"(S1)",machineList)+200);
        boolean b18=checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD");
        boolean b19=checkMachineState1(endTime8-50,finalPosition3,machineList);
        if (b17&&b18&&b19){
            procedureList.add(new Procedure("LLD",7,startTime8-endTime7,endTime7,startTime8));
            procedureList.add(new Procedure("TM2",4,endTime8-startTime8,startTime8,endTime8));
        }else{
            endTime8=lookLastTime(lookWorkingListSize(finalPosition3+"(S1)",machineList)-1,finalPosition3+"(S1)",machineList)+200+50;
            startTime8=endTime8-(50+findDistance1("LLD",finalPosition3)+50);
            if (startTime8<endTime7+450){
                startTime8=endTime7+450;
                endTime8=startTime8+50+findDistance1("LLD",finalPosition3)+50;
            }
            //改动部分
            int startTimeMax=startTime8;
            do {
                if (!checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD"))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD"));
                if (!checkMachineState1(endTime8-50,finalPosition3,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(endTime8-50,finalPosition3,machineList)+50-(50+findDistance1("LLD",finalPosition3)+50));
                startTime8=startTimeMax;
                endTime8=startTime8+50+findDistance1("LLD",finalPosition3)+50;
            }while (!(checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD")&&checkMachineState1(endTime8-50,finalPosition3,machineList)));
            //改动部分
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM23(endTime7+450,startTime8,endTime8,"TM2","LLD",finalPosition3,true,false,false,machineList,cleanMachineList,endTime7,"LLD");
            if (newTime.size()!=0){
                startTime8=newTime.get(newTime.size()-2);
                endTime8=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:for (int j = 0; j < 10000; j++) {
                b18=counter==1||checkMachine_TM23(startTime8,endTime8,"TM2","LLD",finalPosition3,machineList,endTime7,"LLD");
                b19=checkMachineState1(endTime8-50,finalPosition3,machineList);
                if (b18&b19){
                    procedureList.add(new Procedure("LLD",7,startTime8-endTime7,endTime7,startTime8));
                    procedureList.add(new Procedure("TM2",4,endTime8-startTime8,startTime8,endTime8));
                    if (j!=0)
                        System.out.println("LLD->LL(S1):TM2阈值过小!!!"+j);
                    break TM2;
                }else{
                    endTime8=endTime8+1;
                    startTime8=endTime8-(50+findDistance1("LLD",finalPosition3)+50);
                }
                if (j==9999)
                    System.out.println("LLD->LL(S1):TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        //LL(S1)->LP3:TM1
        int startTime9;
        int endTime9;
        if ((procedureList.size()-20)/23==50)
            startTime9=Math.max(endTime8+200,(procedureList.get(procedureList.size()-21).getEtime()+lookDistance("LP2",finalPosition3,distanceTable)));
        else
            startTime9=Math.max(endTime8+200,(procedureList.get(procedureList.size()-21).getEtime()+lookDistance("LP3",finalPosition3,distanceTable)));
        endTime9=startTime9+50+lookDistance(finalPosition3,"LP3",distanceTable)+50;
        boolean b20=checkMachine_TM1(startTime9,endTime9,"TM1",finalPosition3,"LP3",machineList,distanceTable,0,null);
        boolean b21=checkMachineState(startTime9,finalPosition3,machineList);
        if (b20&b21){
            if (finalPosition3.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime9 - endTime8, endTime8, startTime9));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime9, startTime9));
                procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
            }else{
                procedureList.add(new Procedure("LLA" + "(S1)", 2, 0,endTime8,endTime8));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime9 - endTime8, endTime8, startTime9));
                procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
            }
        }else{
            TM1:for (int j = 0; j < 10000; j++) {
                b20=checkMachine_TM1(startTime9,endTime9,"TM1",finalPosition3,"LP3",machineList,distanceTable,0,null);
                b21=checkMachineState(startTime9,finalPosition3,machineList);
                if (b20&&b21){
                    if (finalPosition3.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime9 - endTime8, endTime8, startTime9));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime9, startTime9));
                        procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
                    }else{
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, 0,endTime8,endTime8));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime9 - endTime8, endTime8, startTime9));
                        procedureList.add(new Procedure("TM1", 0, endTime9 - startTime9, startTime9, endTime9));
                    }
                    if (j!=0)
                        System.out.println("LL(S1)->LP3:TM1阈值过小!!!"+j);
                    break TM1;
                }else{
                    endTime9=endTime9+1;
                    startTime9=endTime9-(50 + lookDistance(finalPosition3,"LP3",distanceTable) + 50);
                }
                if (j==9999)
                    System.out.println("LL(S1)->LP3:TM1阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(23,procedureList);
        procedureList.add(new Procedure("LP3", 99, 0, endTime9, endTime9));
        machineList = procedureListToMachineList(23,procedureList);
//        System.out.println("晶圆编号："+(i+1));
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
//        List<Ordering_Bmachine> orderingBmachines=new ArrayList<>();
//        orderingBmachines.add(new Ordering_Bmachine(finalPosition0, finalPosition1, finalPosition2, finalPosition3));
//        System.out.print(orderingBmachines.get(0).toString());
//        System.out.print(",");
        return machineList;
    }
}
