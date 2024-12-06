package cn.competition.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static cn.competition.demo.Show.*;

public class Workmanship1 extends GeneticAlgorithm_A {
    public static void main(String[] args) {
        Workmanship1 workmanship1 = new Workmanship1();
        workmanship1.setGenes(ordering_AmachineToGene(new ArrayList<>(Arrays.asList(
                //4708.8
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4674.6
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM6", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4695.4
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM6", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4695.9
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM6", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4696.4
                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM6", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4776.6
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
        ))));
        workmanship1.setPopSize(100);//设置种群数量
        workmanship1.setGeneSize(375);//设置基因最大长度
        workmanship1.setMaxIterNum(500);//设置最大迭代次数
        workmanship1.setMutationRate(0.3);//设置基因变异的概率
        workmanship1.setMaxMutationNum(225);//设置最大变异步长
        workmanship1.setMaxNum(75000);//将最小值转变为最大值求解,单位为毫秒
        workmanship1.caculte();
    }

    public List<Machine> LP1(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, int i) {
        //LP1->AL:TM1
        int startTime;
        int endTime;
        if (machineList.size() == 0)
            startTime = 0;
        else
            startTime = procedureList.get(procedureList.size() - 15).getEtime() + lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size() - 15).getEtime(), machineList, 0, null), "LP1", distanceTable);
        endTime = startTime + 50 + lookDistance("LP1", "AL", distanceTable) + 50;
        boolean b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null);
        boolean b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
        if (b01 && b02) {
            procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
        } else {
            //改动部分
            int startTimeMax = startTime;
            if (!checkMachine_TM1(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null));
            startTime = startTimeMax;
            endTime = startTime + 50 + lookDistance("LP1", "AL", distanceTable) + 50;
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP1", "AL", machineList, distanceTable, 0, null);
                b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
                if (b01 && b02) {
                    procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
                    if (j != 0)
                        System.out.println("LP1->AL:TM1阈值过小!!!" + j);
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
        machineList = procedureListToMachineList(procedureList);

        //AL->LL(S2):TM1
        int startTime1;
        int endTime1;
//        finalPosition0=changeLL("AL",endTime+100,machineList,distanceTable,endTime,"AL");
        startTime1 = endTime + 100;
        endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
        boolean b1 = checkMachineState(endTime1 - 50, finalPosition0, machineList);
        boolean b2 = (lookLastTime(lookWorkingListSize(finalPosition0 + "(S2)", machineList) - 1, finalPosition0 + "(S2)", machineList) + 250 <= endTime1 - 50);
        boolean b3 = checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL");
        if (b1 && b2 && b3) {
            procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
            procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
        } else {
            endTime1 = lookLastTime(lookWorkingListSize(finalPosition0 + "(S2)", machineList) - 1, finalPosition0 + "(S2)", machineList) + 50 + 200 + 50;
            startTime1 = endTime1 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50);
            if (startTime1 < endTime + 100) {
                startTime1 = endTime + 100;
                endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            do {
                if (!checkMachineState(endTime1 - 50, finalPosition0, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState_Out(endTime1 - 50, finalPosition0, machineList) + 50 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50));
                if (!checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL"))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL"));
                startTime1 = startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
            } while (!(checkMachineState(endTime1 - 50, finalPosition0, machineList) && checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL")));
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b1 = checkMachineState(endTime1 - 50, finalPosition0, machineList);
                b3 = checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL");
                if (b1 && b3) {
                    procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
                    procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
                    if (j != 0)
                        System.out.println("AL->LL(S2):TM1阈值过小!!!" + j);
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
        machineList = procedureListToMachineList(procedureList);

        //LL(S2)->PM3/4:TM2
        int startTime2;
        int endTime2;
//        finalPosition1=changePM34(finalPosition0,endTime1+150,machineList,endTime1,finalPosition0);
        startTime2 = endTime1 + 150;
        endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
        boolean b4 = (endTime2 - 50 >= lookLastTime(lookWorkingListSize(finalPosition1, machineList) - 1, finalPosition1, machineList) + 50);
        boolean b5 = checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
        boolean b6 = checkMachineState1(startTime2, finalPosition0, machineList);
        if (b4 && b5 && b6) {
            if (finalPosition0.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, 0, startTime2, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            } else {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }
        } else {
            endTime2 = lookLastTime(lookWorkingListSize(finalPosition1, machineList) - 1, finalPosition1, machineList) + 50 + 50;
            startTime2 = endTime2 - (50 + findDistance(finalPosition0, finalPosition1) + 50);
            if (startTime2 < endTime1 + 150) {
                startTime2 = endTime1 + 150;
                endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            do {
                if (!checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0));
                if (!checkMachineState1(startTime2, finalPosition0, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(startTime2, finalPosition0, machineList));
                startTime2 = startTimeMax;
                endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
            } while (!(checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0) && checkMachineState1(startTime2, finalPosition0, machineList)));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime1 + 150, startTime2, endTime2, "TM2", finalPosition0, finalPosition1, true, true, machineList, endTime1, finalPosition0);
            if (newTime.size() != 0) {
                startTime2 = newTime.get(newTime.size() - 2);
                endTime2 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter == 1 || checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
                b6 = checkMachineState1(startTime2, finalPosition0, machineList);
                if (b5 && b6) {
                    if (finalPosition0.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, 0, startTime2, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    } else {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }
                    if (j != 0)
                        System.out.println("LL(S2)->PM3/4:TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + findDistance(finalPosition0, finalPosition1) + 50);
                }
                if (j == 9999) {
                    System.out.println("LL(S2)->PM3/4:TM2阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(procedureList);

        //PM3/4->PM1/2/5/6:TM2
        int startTime3;
        int endTime3;
//        finalPosition2 = changePM1256(finalPosition1,endTime2+750,machineList,endTime2,finalPosition1);
        startTime3 = endTime2 + 750;
        endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
        boolean b7 = (endTime3 - 50 >= lookLastTime(lookWorkingListSize(finalPosition2, machineList) - 1, finalPosition2, machineList) + 50);
        boolean b8 = checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
        if (b7 && b8) {
            if (finalPosition1.equals("PM3")) {
                procedureList.add(new Procedure("PM3", 5, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("PM4", 6, 0, startTime3, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            } else {
                procedureList.add(new Procedure("PM3", 5, 0, endTime2, endTime2));
                procedureList.add(new Procedure("PM4", 6, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }
        } else {
            endTime3 = lookLastTime(lookWorkingListSize(finalPosition2, machineList) - 1, finalPosition2, machineList) + 50 + 50;
            startTime3 = endTime3 - (50 + findDistance(finalPosition1, finalPosition2) + 50);
            if (startTime3 < endTime2 + 750) {
                startTime3 = endTime2 + 750;
                endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
            }
            //改动部分
            int startTimeMax = startTime3;
//            do {
            if (!checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1));
            startTime3 = startTimeMax;
            endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
//            }while(!checkMachine_TM2(startTime3,endTime3,"TM2",finalPosition1,finalPosition2,machineList,endTime2,finalPosition1));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime2 + 750, startTime3, endTime3, "TM2", finalPosition1, finalPosition2, false, false, machineList, endTime2, finalPosition1);
            if (newTime.size() != 0) {
                startTime3 = newTime.get(newTime.size() - 2);
                endTime3 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = counter == 1 || checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
                if (b8) {
                    if (finalPosition1.equals("PM3")) {
                        procedureList.add(new Procedure("PM3", 5, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("PM4", 6, 0, startTime3, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    } else {
                        procedureList.add(new Procedure("PM3", 5, 0, endTime2, endTime2));
                        procedureList.add(new Procedure("PM4", 6, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }
                    if (j != 0)
                        System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime3 = endTime3 + 1;
                    startTime3 = endTime3 - (50 + findDistance(finalPosition1, finalPosition2) + 50);
                }
                if (j == 9999)
                    System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);


        //PM1/2/5/6->LL(S1):TM2
        int startTime4;
        int endTime4;
//        finalPosition3=changeLL1(finalPosition2,endTime3+600,machineList,endTime3,finalPosition2);
        startTime4 = endTime3 + 600;
        endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
        boolean b9 = (endTime4 - 50 >= lookLastTime(lookWorkingListSize(finalPosition3 + "(S1)", machineList) - 1, finalPosition3 + "(S1)", machineList) + 200);
        boolean b10 = checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
        boolean b11 = checkMachineState1(endTime4 - 50, finalPosition3, machineList);
        if (b9 && b10 && b11) {
            if (finalPosition2.equals("PM1")) {
                procedureList.add(new Procedure("PM1", 7, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM2", 8, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else if (finalPosition2.equals("PM2")) {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else if (finalPosition2.equals("PM5")) {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM5", 9, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM5", 9, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM6", 10, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            }
        } else {
            endTime4 = lookLastTime(lookWorkingListSize(finalPosition3 + "(S1)", machineList) - 1, finalPosition3 + "(S1)", machineList) + 200 + 50;
            startTime4 = endTime4 - (50 + findDistance(finalPosition2, finalPosition3) + 50);
            if (startTime4 < endTime3 + 600) {
                startTime4 = endTime3 + 600;
                endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
            }
            //改动部分
            int startTimeMax = startTime4;
            do {
                if (!checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2));
                if (!checkMachineState1(endTime4 - 50, finalPosition3, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(endTime4 - 50, finalPosition3, machineList) + 50 - (50 + findDistance(finalPosition2, finalPosition3) + 50));
                startTime4 = startTimeMax;
                endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
            } while (!(checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2) && checkMachineState1(endTime4 - 50, finalPosition3, machineList)));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime3 + 600, startTime4, endTime4, "TM2", finalPosition2, finalPosition3, true, false, machineList, endTime3, finalPosition2);
            if (newTime.size() != 0) {
                startTime4 = newTime.get(newTime.size() - 2);
                endTime4 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b10 = counter == 1 || checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
                b11 = checkMachineState1(endTime4 - 50, finalPosition3, machineList);
                if (b10 && b11) {
                    if (finalPosition2.equals("PM1")) {
                        procedureList.add(new Procedure("PM1", 7, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM2", 8, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else if (finalPosition2.equals("PM2")) {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else if (finalPosition2.equals("PM5")) {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM5", 9, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM5", 9, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM6", 10, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    }
                    if (j != 0)
                        System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime4 = endTime4 + 1;
                    startTime4 = endTime4 - (50 + findDistance(finalPosition2, finalPosition3) + 50);
                }
                if (j == 9999)
                    System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);

        //LL(S1)->LP1:TM1
        int startTime5;
        int endTime5;
        if (procedureList.size() == 14)
            startTime5 = endTime4 + 700;
        else
            startTime5 = Math.max((endTime4 + 700), (procedureList.get(procedureList.size() - 15).getEtime() + lookDistance("LP1", finalPosition3, distanceTable)));
        endTime5 = startTime5 + 50 + lookDistance(finalPosition3, "LP1", distanceTable) + 50;
        boolean b12 = checkMachine_TM1(startTime5, endTime5, "TM1", finalPosition3, "LP1", machineList, distanceTable, 0, null);
        boolean b13 = checkMachineState(startTime5, finalPosition3, machineList);
        if (b12 && b13) {
            if (finalPosition3.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime5 - endTime4, endTime4, startTime5));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime5, startTime5));
                procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
            } else {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, 0, endTime4, endTime4));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime5 - endTime4, endTime4, startTime5));
                procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
            }
        } else {
            TM1:
            for (int j = 0; j < 10000; j++) {
                b12 = checkMachine_TM1(startTime5, endTime5, "TM1", finalPosition3, "LP1", machineList, distanceTable, 0, null);
                b13 = checkMachineState(startTime5, finalPosition3, machineList);
                if (b12 && b13) {
                    if (finalPosition3.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime5 - endTime4, endTime4, startTime5));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime5, startTime5));
                        procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
                    } else {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, 0, endTime4, endTime4));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime5 - endTime4, endTime4, startTime5));
                        procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
                    }
                    if (j != 0)
                        System.out.println("LL(S1)->LP1:TM1阈值过小!!!" + j);
                    break TM1;
                } else {
                    endTime5 = endTime5 + 1;
                    startTime5 = endTime5 - (50 + lookDistance(finalPosition3, "LP1", distanceTable) + 50);
                }
                if (j == 9999)
                    System.out.println("LL(S1)->LP1:TM1阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);
//        System.out.println("晶圆编号："+(i+1));
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
//        List<Ordering_Amachine> orderingAmachines=new ArrayList<>();
//        orderingAmachines.add(new Ordering_Amachine(finalPosition0,finalPosition1,finalPosition2,finalPosition3));
//        System.out.print(orderingAmachines.get(0).toString());
//        System.out.println(",");
        return machineList;
    }

    public List<Machine> LP2(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, int i) {
        //LP2->AL:TM1
        int startTime;
        int endTime;
        startTime = procedureList.get(procedureList.size() - 15).getEtime() + lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size() - 15).getEtime(), machineList, 0, null), "LP2", distanceTable);
        endTime = startTime + 50 + lookDistance("LP2", "AL", distanceTable) + 50;
        boolean b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null);
        boolean b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
        if (b01 && b02) {
            procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
        } else {
            //改动部分
            int startTimeMax = startTime;
            if (!checkMachine_TM1(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null));
            startTime = startTimeMax;
            endTime = startTime + 50 + lookDistance("LP2", "AL", distanceTable) + 50;
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP2", "AL", machineList, distanceTable, 0, null);
                b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
                if (b01 && b02) {
                    procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
                    if (j != 0)
                        System.out.println("LP2->AL:TM1阈值过小!!!" + j);
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
        machineList = procedureListToMachineList(procedureList);

        //AL->LL(S2):TM1
        int startTime1;
        int endTime1;
//        finalPosition0=changeLL("AL",endTime+100,machineList,distanceTable,endTime,"AL");
        startTime1 = endTime + 100;
        endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
        boolean b1 = checkMachineState(endTime1 - 50, finalPosition0, machineList);
        boolean b2 = (lookLastTime(lookWorkingListSize(finalPosition0 + "(S2)", machineList) - 1, finalPosition0 + "(S2)", machineList) + 250 <= endTime1 - 50);
        boolean b3 = checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL");
        if (b1 && b2 && b3) {
            procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
            procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
        } else {
            endTime1 = lookLastTime(lookWorkingListSize(finalPosition0 + "(S2)", machineList) - 1, finalPosition0 + "(S2)", machineList) + 50 + 200 + 50;
            startTime1 = endTime1 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50);
            if (startTime1 < endTime + 100) {
                startTime1 = endTime + 100;
                endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            do {
                if (!checkMachineState(endTime1 - 50, finalPosition0, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState_Out(endTime1 - 50, finalPosition0, machineList) + 50 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50));
                if (!checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL"))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL"));
                startTime1 = startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
            } while (!(checkMachineState(endTime1 - 50, finalPosition0, machineList) && checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL")));
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b1 = checkMachineState(endTime1 - 50, finalPosition0, machineList);
                b3 = checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL");
                if (b1 && b3) {
                    procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
                    procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
                    if (j != 0)
                        System.out.println("AL->LL(S2):TM1阈值过小!!!" + j);
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
        machineList = procedureListToMachineList(procedureList);

        //LL(S2)->PM3/4:TM2
        int startTime2;
        int endTime2;
//        finalPosition1=changePM34(finalPosition0,endTime1+150,machineList,endTime1,finalPosition0);
        startTime2 = endTime1 + 150;
        endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
        boolean b4 = (endTime2 - 50 >= lookLastTime(lookWorkingListSize(finalPosition1, machineList) - 1, finalPosition1, machineList) + 50);
        boolean b5 = checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
        boolean b6 = checkMachineState1(startTime2, finalPosition0, machineList);
        if (b4 && b5 && b6) {
            if (finalPosition0.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, 0, startTime2, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            } else {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }
        } else {
            endTime2 = lookLastTime(lookWorkingListSize(finalPosition1, machineList) - 1, finalPosition1, machineList) + 50 + 50;
            startTime2 = endTime2 - (50 + findDistance(finalPosition0, finalPosition1) + 50);
            if (startTime2 < endTime1 + 150) {
                startTime2 = endTime1 + 150;
                endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            do {
                if (!checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0));
                if (!checkMachineState1(startTime2, finalPosition0, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(startTime2, finalPosition0, machineList));
                startTime2 = startTimeMax;
                endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
            } while (!(checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0) && checkMachineState1(startTime2, finalPosition0, machineList)));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime1 + 150, startTime2, endTime2, "TM2", finalPosition0, finalPosition1, true, true, machineList, endTime1, finalPosition0);
            if (newTime.size() != 0) {
                startTime2 = newTime.get(newTime.size() - 2);
                endTime2 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter == 1 || checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
                b6 = checkMachineState1(startTime2, finalPosition0, machineList);
                if (b5 && b6) {
                    if (finalPosition0.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, 0, startTime2, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    } else {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }
                    if (j != 0)
                        System.out.println("LL(S2)->PM3/4:TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + findDistance(finalPosition0, finalPosition1) + 50);
                }
                if (j == 9999) {
                    System.out.println("LL(S2)->PM3/4:TM2阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(procedureList);

        //PM3/4->PM1/2/5/6:TM2
        int startTime3;
        int endTime3;
//        finalPosition2 = changePM1256(finalPosition1,endTime2+750,machineList,endTime2,finalPosition1);
        startTime3 = endTime2 + 750;
        endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
        boolean b7 = (endTime3 - 50 >= lookLastTime(lookWorkingListSize(finalPosition2, machineList) - 1, finalPosition2, machineList) + 50);
        boolean b8 = checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
        if (b7 && b8) {
            if (finalPosition1.equals("PM3")) {
                procedureList.add(new Procedure("PM3", 5, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("PM4", 6, 0, startTime3, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            } else {
                procedureList.add(new Procedure("PM3", 5, 0, endTime2, endTime2));
                procedureList.add(new Procedure("PM4", 6, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }
        } else {
            endTime3 = lookLastTime(lookWorkingListSize(finalPosition2, machineList) - 1, finalPosition2, machineList) + 50 + 50;
            startTime3 = endTime3 - (50 + findDistance(finalPosition1, finalPosition2) + 50);
            if (startTime3 < endTime2 + 750) {
                startTime3 = endTime2 + 750;
                endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
            }
            //改动部分
            int startTimeMax = startTime3;
//            do {
            if (!checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1));
            startTime3 = startTimeMax;
            endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
//            }while(!checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime2 + 750, startTime3, endTime3, "TM2", finalPosition1, finalPosition2, false, false, machineList, endTime2, finalPosition1);
            if (newTime.size() != 0) {
                startTime3 = newTime.get(newTime.size() - 2);
                endTime3 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = counter == 1 || checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
                if (b8) {
                    if (finalPosition1.equals("PM3")) {
                        procedureList.add(new Procedure("PM3", 5, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("PM4", 6, 0, startTime3, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    } else {
                        procedureList.add(new Procedure("PM3", 5, 0, endTime2, endTime2));
                        procedureList.add(new Procedure("PM4", 6, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }
                    if (j != 0)
                        System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime3 = endTime3 + 1;
                    startTime3 = endTime3 - (50 + findDistance(finalPosition1, finalPosition2) + 50);
                }
                if (j == 9999)
                    System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);


        //PM1/2/5/6->LL(S1):TM2
        int startTime4;
        int endTime4;
//        finalPosition3=changeLL1(finalPosition2,endTime3+600,machineList,endTime3,finalPosition2);
        startTime4 = endTime3 + 600;
        endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
        boolean b9 = (endTime4 - 50 >= lookLastTime(lookWorkingListSize(finalPosition3 + "(S1)", machineList) - 1, finalPosition3 + "(S1)", machineList) + 200);
        boolean b10 = checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
        boolean b11 = checkMachineState1(endTime4 - 50, finalPosition3, machineList);
        if (b9 && b10 && b11) {
            if (finalPosition2.equals("PM1")) {
                procedureList.add(new Procedure("PM1", 7, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM2", 8, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else if (finalPosition2.equals("PM2")) {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else if (finalPosition2.equals("PM5")) {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM5", 9, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM5", 9, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM6", 10, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            }
        } else {
            endTime4 = lookLastTime(lookWorkingListSize(finalPosition3 + "(S1)", machineList) - 1, finalPosition3 + "(S1)", machineList) + 200 + 50;
            startTime4 = endTime4 - (50 + findDistance(finalPosition2, finalPosition3) + 50);
            if (startTime4 < endTime3 + 600) {
                startTime4 = endTime3 + 600;
                endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
            }
            //改动部分
            int startTimeMax = startTime4;
            do {
                if (!checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2));
                if (!checkMachineState1(endTime4 - 50, finalPosition3, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(endTime4 - 50, finalPosition3, machineList) + 50 - (50 + findDistance(finalPosition2, finalPosition3) + 50));
                startTime4 = startTimeMax;
                endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
            } while (!(checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2) && checkMachineState1(endTime4 - 50, finalPosition3, machineList)));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime3 + 600, startTime4, endTime4, "TM2", finalPosition2, finalPosition3, true, false, machineList, endTime3, finalPosition2);
            if (newTime.size() != 0) {
                startTime4 = newTime.get(newTime.size() - 2);
                endTime4 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b10 = counter == 1 || checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
                b11 = checkMachineState1(endTime4 - 50, finalPosition3, machineList);
                if (b10 && b11) {
                    if (finalPosition2.equals("PM1")) {
                        procedureList.add(new Procedure("PM1", 7, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM2", 8, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else if (finalPosition2.equals("PM2")) {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else if (finalPosition2.equals("PM5")) {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM5", 9, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM5", 9, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM6", 10, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    }
                    if (j != 0)
                        System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime4 = endTime4 + 1;
                    startTime4 = endTime4 - (50 + findDistance(finalPosition2, finalPosition3) + 50);
                }
                if (j == 9999)
                    System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!");
            }

        }
        machineList = procedureListToMachineList(procedureList);

        //LL(S1)->LP2:TM1
        int startTime5;
        int endTime5;
        if ((procedureList.size() - 14) / 17 == 25)
            startTime5 = Math.max((endTime4 + 700), (procedureList.get(procedureList.size() - 15).getEtime() + lookDistance("LP1", finalPosition3, distanceTable)));
        else
            startTime5 = Math.max((endTime4 + 700), (procedureList.get(procedureList.size() - 15).getEtime() + lookDistance("LP2", finalPosition3, distanceTable)));
        endTime5 = startTime5 + 50 + lookDistance(finalPosition3, "LP2", distanceTable) + 50;
        boolean b12 = checkMachine_TM1(startTime5, endTime5, "TM1", finalPosition3, "LP2", machineList, distanceTable, 0, null);
        boolean b13 = checkMachineState(startTime5, finalPosition3, machineList);
        if (b12 && b13) {
            if (finalPosition3.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime5 - endTime4, endTime4, startTime5));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime5, startTime5));
                procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
            } else {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, 0, endTime4, endTime4));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime5 - endTime4, endTime4, startTime5));
                procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
            }
        } else {
            TM1:
            for (int j = 0; j < 10000; j++) {
                b12 = checkMachine_TM1(startTime5, endTime5, "TM1", finalPosition3, "LP2", machineList, distanceTable, 0, null);
                b13 = checkMachineState(startTime5, finalPosition3, machineList);
                if (b12 && b13) {
                    if (finalPosition3.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime5 - endTime4, endTime4, startTime5));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime5, startTime5));
                        procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
                    } else {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, 0, endTime4, endTime4));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime5 - endTime4, endTime4, startTime5));
                        procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
                    }
                    if (j != 0)
                        System.out.println("LL(S1)->LP2:TM1阈值过小!!!" + j);
                    break TM1;
                } else {
                    endTime5 = endTime5 + 1;
                    startTime5 = endTime5 - (50 + lookDistance(finalPosition3, "LP2", distanceTable) + 50);
                }
                if (j == 9999)
                    System.out.println("LL(S1)->LP2:TM1阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);
//        System.out.println("晶圆编号："+(i+1));
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
//        List<Ordering_Amachine> orderingAmachines=new ArrayList<>();
//        orderingAmachines.add(new Ordering_Amachine(finalPosition0,finalPosition1,finalPosition2,finalPosition3));
//        System.out.print(orderingAmachines.get(0).toString());
//        System.out.println(",");
        return machineList;
    }

    public List<Machine> LP3(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, int i) {
        //LP3->AL:TM1
        int startTime;
        int endTime;
        startTime = procedureList.get(procedureList.size() - 15).getEtime() + lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size() - 15).getEtime(), machineList, 0, null), "LP3", distanceTable);
        endTime = startTime + 50 + lookDistance("LP3", "AL", distanceTable) + 50;
        boolean b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null);
        boolean b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
        if (b01 && b02) {
            procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
        } else {
            //改动部分
            int startTimeMax = startTime;
            if (!checkMachine_TM1(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null));
            startTime = startTimeMax;
            endTime = startTime + 50 + lookDistance("LP3", "AL", distanceTable) + 50;
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b01 = checkMachine_TM1(startTime, endTime, "TM1", "LP3", "AL", machineList, distanceTable, 0, null);
                b02 = checkMachine(endTime, endTime + 100, "AL", machineList);
                if (b01 && b02) {
                    procedureList.add(new Procedure("TM1", 0, endTime - startTime, startTime, endTime));
                    if (j != 0)
                        System.out.println("LP3->AL:TM1阈值过小!!!" + j);
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
        machineList = procedureListToMachineList(procedureList);

        //AL->LL(S2):TM1
        int startTime1;
        int endTime1;
//        finalPosition0=changeLL("AL",endTime+100,machineList,distanceTable,endTime,"AL");
        startTime1 = endTime + 100;
        endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
        boolean b1 = checkMachineState(endTime1 - 50, finalPosition0, machineList);
        boolean b2 = (lookLastTime(lookWorkingListSize(finalPosition0 + "(S2)", machineList) - 1, finalPosition0 + "(S2)", machineList) + 250 <= endTime1 - 50);
        boolean b3 = checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL");
        if (b1 && b2 && b3) {
            procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
            procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
        } else {
            endTime1 = lookLastTime(lookWorkingListSize(finalPosition0 + "(S2)", machineList) - 1, finalPosition0 + "(S2)", machineList) + 50 + 200 + 50;
            startTime1 = endTime1 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50);
            if (startTime1 < endTime + 100) {
                startTime1 = endTime + 100;
                endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            do {
                if (!checkMachineState(endTime1 - 50, finalPosition0, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState_Out(endTime1 - 50, finalPosition0, machineList) + 50 - (50 + lookDistance("AL", finalPosition0, distanceTable) + 50));
                if (!checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL"))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL"));
                startTime1 = startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance("AL", finalPosition0, distanceTable) + 50;
            } while (!(checkMachineState(endTime1 - 50, finalPosition0, machineList) && checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL")));
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b1 = checkMachineState(endTime1 - 50, finalPosition0, machineList);
                b3 = checkMachine_TM1(startTime1, endTime1, "TM1", "AL", finalPosition0, machineList, distanceTable, endTime, "AL");
                if (b1 && b3) {
                    procedureList.add(new Procedure("AL", 1, startTime1 - endTime, endTime, startTime1));
                    procedureList.add(new Procedure("TM1", 0, endTime1 - startTime1, startTime1, endTime1));
                    if (j != 0)
                        System.out.println("AL->LL(S2):TM1阈值过小!!!" + j);
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
        machineList = procedureListToMachineList(procedureList);

        //LL(S2)->PM3/4:TM2
        int startTime2;
        int endTime2;
//        finalPosition1=changePM34(finalPosition0,endTime1+150,machineList,endTime1,finalPosition0);
        startTime2 = endTime1 + 150;
        endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
        boolean b4 = (endTime2 - 50 >= lookLastTime(lookWorkingListSize(finalPosition1, machineList) - 1, finalPosition1, machineList) + 50);
        boolean b5 = checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
        boolean b6 = checkMachineState1(startTime2, finalPosition0, machineList);
        if (b4 && b5 && b6) {
            if (finalPosition0.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, 0, startTime2, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            } else {
                procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
            }
        } else {
            endTime2 = lookLastTime(lookWorkingListSize(finalPosition1, machineList) - 1, finalPosition1, machineList) + 50 + 50;
            startTime2 = endTime2 - (50 + findDistance(finalPosition0, finalPosition1) + 50);
            if (startTime2 < endTime1 + 150) {
                startTime2 = endTime1 + 150;
                endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            do {
                if (!checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0));
                if (!checkMachineState1(startTime2, finalPosition0, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(startTime2, finalPosition0, machineList));
                startTime2 = startTimeMax;
                endTime2 = startTime2 + 50 + findDistance(finalPosition0, finalPosition1) + 50;
            } while (!(checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0) && checkMachineState1(startTime2, finalPosition0, machineList)));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime1 + 150, startTime2, endTime2, "TM2", finalPosition0, finalPosition1, true, true, machineList, endTime1, finalPosition0);
            if (newTime.size() != 0) {
                startTime2 = newTime.get(newTime.size() - 2);
                endTime2 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter == 1 || checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
                b6 = checkMachineState1(startTime2, finalPosition0, machineList);
                if (b5 && b6) {
                    if (finalPosition0.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, 0, startTime2, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    } else {
                        procedureList.add(new Procedure("LLA" + "(S2)", 2, 0, endTime1, endTime1));
                        procedureList.add(new Procedure("LLB" + "(S2)", 3, startTime2 - endTime1, endTime1, startTime2));
                        procedureList.add(new Procedure("TM2", 4, endTime2 - startTime2, startTime2, endTime2));
                    }
                    if (j != 0)
                        System.out.println("LL(S2)->PM3/4:TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + findDistance(finalPosition0, finalPosition1) + 50);
                }
                if (j == 9999) {
                    System.out.println("LL(S2)->PM3/4:TM2阈值过小!!!");
                }
            }
        }
        machineList = procedureListToMachineList(procedureList);

        //PM3/4->PM1/2/5/6:TM2
        int startTime3;
        int endTime3;
//        finalPosition2 = changePM1256(finalPosition1,endTime2+750,machineList,endTime2,finalPosition1);
        startTime3 = endTime2 + 750;
        endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
        boolean b7 = (endTime3 - 50 >= lookLastTime(lookWorkingListSize(finalPosition2, machineList) - 1, finalPosition2, machineList) + 50);
        boolean b8 = checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
        if (b7 && b8) {
            if (finalPosition1.equals("PM3")) {
                procedureList.add(new Procedure("PM3", 5, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("PM4", 6, 0, startTime3, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            } else {
                procedureList.add(new Procedure("PM3", 5, 0, endTime2, endTime2));
                procedureList.add(new Procedure("PM4", 6, startTime3 - endTime2, endTime2, startTime3));
                procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
            }
        } else {
            endTime3 = lookLastTime(lookWorkingListSize(finalPosition2, machineList) - 1, finalPosition2, machineList) + 50 + 50;
            startTime3 = endTime3 - (50 + findDistance(finalPosition1, finalPosition2) + 50);
            if (startTime3 < endTime2 + 750) {
                startTime3 = endTime2 + 750;
                endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
            }
            //改动部分
            int startTimeMax = startTime3;
//            do {
            if (!checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1));
            startTime3 = startTimeMax;
            endTime3 = startTime3 + 50 + findDistance(finalPosition1, finalPosition2) + 50;
//            }while (!checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime2 + 750, startTime3, endTime3, "TM2", finalPosition1, finalPosition2, false, false, machineList, endTime2, finalPosition1);
            if (newTime.size() != 0) {
                startTime3 = newTime.get(newTime.size() - 2);
                endTime3 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = counter == 1 || checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
                if (b8) {
                    if (finalPosition1.equals("PM3")) {
                        procedureList.add(new Procedure("PM3", 5, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("PM4", 6, 0, startTime3, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    } else {
                        procedureList.add(new Procedure("PM3", 5, 0, endTime2, endTime2));
                        procedureList.add(new Procedure("PM4", 6, startTime3 - endTime2, endTime2, startTime3));
                        procedureList.add(new Procedure("TM2", 4, endTime3 - startTime3, startTime3, endTime3));
                    }
                    if (j != 0)
                        System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime3 = endTime3 + 1;
                    startTime3 = endTime3 - (50 + findDistance(finalPosition1, finalPosition2) + 50);
                }
                if (j == 9999)
                    System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);


        //PM1/2/5/6->LL(S1):TM2
        int startTime4;
        int endTime4;
//        finalPosition3=changeLL1(finalPosition2,endTime3+600,machineList,endTime3,finalPosition2);
        startTime4 = endTime3 + 600;
        endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
        boolean b9 = (endTime4 - 50 >= lookLastTime(lookWorkingListSize(finalPosition3 + "(S1)", machineList) - 1, finalPosition3 + "(S1)", machineList) + 200);
        boolean b10 = checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
        boolean b11 = checkMachineState1(endTime4 - 50, finalPosition3, machineList);
        if (b9 && b10 && b11) {
            if (finalPosition2.equals("PM1")) {
                procedureList.add(new Procedure("PM1", 7, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM2", 8, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else if (finalPosition2.equals("PM2")) {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else if (finalPosition2.equals("PM5")) {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM5", 9, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            } else {
                procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM5", 9, 0, endTime3, endTime3));
                procedureList.add(new Procedure("PM6", 10, startTime4 - endTime3, endTime3, startTime4));
                procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
            }
        } else {
            endTime4 = lookLastTime(lookWorkingListSize(finalPosition3 + "(S1)", machineList) - 1, finalPosition3 + "(S1)", machineList) + 200 + 50;
            startTime4 = endTime4 - (50 + findDistance(finalPosition2, finalPosition3) + 50);
            if (startTime4 < endTime3 + 600) {
                startTime4 = endTime3 + 600;
                endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
            }
            //改动部分
            int startTimeMax = startTime4;
            do {
                if (!checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2));
                if (!checkMachineState1(endTime4 - 50, finalPosition3, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(endTime4 - 50, finalPosition3, machineList) + 50 - (50 + findDistance(finalPosition2, finalPosition3) + 50));
                startTime4 = startTimeMax;
                endTime4 = startTime4 + 50 + findDistance(finalPosition2, finalPosition3) + 50;
            } while (!(checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2) && checkMachineState1(endTime4 - 50, finalPosition3, machineList)));
            //改动部分
            int counter = 0;
            List<Integer> newTime = checkMachineSpecial_TM2(endTime3 + 600, startTime4, endTime4, "TM2", finalPosition2, finalPosition3, true, false, machineList, endTime3, finalPosition2);
            if (newTime.size() != 0) {
                startTime4 = newTime.get(newTime.size() - 2);
                endTime4 = newTime.get(newTime.size() - 1);
                counter = 1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b10 = counter == 1 || checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
                b11 = checkMachineState1(endTime4 - 50, finalPosition3, machineList);
                if (b10 && b11) {
                    if (finalPosition2.equals("PM1")) {
                        procedureList.add(new Procedure("PM1", 7, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM2", 8, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else if (finalPosition2.equals("PM2")) {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM5", 9, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else if (finalPosition2.equals("PM5")) {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM5", 9, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("PM6", 10, 0, startTime4, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    } else {
                        procedureList.add(new Procedure("PM1", 7, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM2", 8, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM5", 9, 0, endTime3, endTime3));
                        procedureList.add(new Procedure("PM6", 10, startTime4 - endTime3, endTime3, startTime4));
                        procedureList.add(new Procedure("TM2", 4, endTime4 - startTime4, startTime4, endTime4));
                    }
                    if (j != 0)
                        System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!" + j);
                    break TM2;
                } else {
                    endTime4 = endTime4 + 1;
                    startTime4 = endTime4 - (50 + findDistance(finalPosition2, finalPosition3) + 50);
                }
                if (j == 9999)
                    System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!");
            }

        }
        machineList = procedureListToMachineList(procedureList);

        //LL(S1)->LP3:TM1
        int startTime5;
        int endTime5;
        if ((procedureList.size() - 14) / 17 == 50)
            startTime5 = Math.max((endTime4 + 700), (procedureList.get(procedureList.size() - 15).getEtime() + lookDistance("LP2", finalPosition3, distanceTable)));
        else
            startTime5 = Math.max((endTime4 + 700), (procedureList.get(procedureList.size() - 15).getEtime() + lookDistance("LP3", finalPosition3, distanceTable)));
        endTime5 = startTime5 + 50 + lookDistance(finalPosition3, "LP3", distanceTable) + 50;
        boolean b12 = checkMachine_TM1(startTime5, endTime5, "TM1", finalPosition3, "LP3", machineList, distanceTable, 0, null);
        boolean b13 = checkMachineState(startTime5, finalPosition3, machineList);
        if (b12 && b13) {
            if (finalPosition3.equals("LLA")) {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime5 - endTime4, endTime4, startTime5));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime5, startTime5));
                procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
            } else {
                procedureList.add(new Procedure("LLA" + "(S1)", 2, 0, endTime4, endTime4));
                procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime5 - endTime4, endTime4, startTime5));
                procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
            }
        } else {
            TM1:
            for (int j = 0; j < 10000; j++) {
                b12 = checkMachine_TM1(startTime5, endTime5, "TM1", finalPosition3, "LP3", machineList, distanceTable, 0, null);
                b13 = checkMachineState(startTime5, finalPosition3, machineList);
                if (b12 && b13) {
                    if (finalPosition3.equals("LLA")) {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, startTime5 - endTime4, endTime4, startTime5));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, 0, startTime5, startTime5));
                        procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
                    } else {
                        procedureList.add(new Procedure("LLA" + "(S1)", 2, 0, endTime4, endTime4));
                        procedureList.add(new Procedure("LLB" + "(S1)", 3, startTime5 - endTime4, endTime4, startTime5));
                        procedureList.add(new Procedure("TM1", 0, endTime5 - startTime5, startTime5, endTime5));
                    }
                    if (j != 0)
                        System.out.println("LL(S1)->LP3:TM1阈值过小!!!" + j);
                    break TM1;
                } else {
                    endTime5 = endTime5 + 1;
                    startTime5 = endTime5 - (50 + lookDistance(finalPosition3, "LP3", distanceTable) + 50);
                }
                if (j == 9999)
                    System.out.println("LL(S1)->LP3:TM1阈值过小!!!");
            }
        }
        machineList = procedureListToMachineList(procedureList);
//        if (i==74){
//            System.out.println("晶圆编号："+(i+1));
//            for (Machine machine : machineList) {
//                System.out.println(machine.toString());
//            }
//        }
//        List<Ordering_Amachine> orderingAmachines=new ArrayList<>();
//        orderingAmachines.add(new Ordering_Amachine(finalPosition0,finalPosition1,finalPosition2,finalPosition3));
//        System.out.print(orderingAmachines.get(0).toString());
//        System.out.println(",");
        return machineList;
    }
}

