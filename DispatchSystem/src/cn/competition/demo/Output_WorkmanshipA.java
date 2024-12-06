package cn.competition.demo;

import java.io.IOException;
import java.util.*;

import static cn.competition.demo.Show.*;

public class Output_WorkmanshipA {
    public static void main(String[] args) throws IOException {
        System.out.println(new Date());
        List<Distance> distanceTable = new ArrayList<>();
        String[] position = {"LP1", "LP2", "LP3", "AL", "LLA", "LLB"};
        for (int i = 0; i < position.length; i++) {
            distanceTable.add(new Distance(position[i], position[i], 0));
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
        List<Ordering_Amachine> orderingAmachines_init = new ArrayList<>(Arrays.asList(
                //4695.9
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM6", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4696.4
                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM6", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4708.8
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"),new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"),new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"),new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"),new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4674.6
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM6", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4695.4
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM6", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM1", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
                //4694.0
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM1", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM1", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM6", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM6", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM6", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM6", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM6", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM4", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB")
                //4700.4
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM1", "LLB"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB")
                //4776.6
//                new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLA", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLA"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLB"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA"), new Ordering_Amachine("LLB", "PM4", "PM5", "LLB"), new Ordering_Amachine("LLA", "PM3", "PM2", "LLA")
        ));
        int[] delayTime=new int[75];
        delayTime= new int[]{0, 0, 9, 0, 0, 0, 0, 0, 275, 200, 62, 275, 200, 90, 60, 101, 60, 135, 65, 200, 0, 45, 548, 0, 32, 370, 436, 11, 147, 168, 183, 23, 352, 0, 485, 285, 280, 105, 303, 385, 0, 60, 167, 6, 311, 24, 55, 290, 37, 280, 262, 60, 323, 32, 295, 237, 65, 318, 47, 280, 262, 60, 308, 47, 280, 252, 65, 303, 47, 280, 262, 60, 308, 47, 280};
//        int[] delayTime=new Output_WorkmanshipA().optimizeWaitingTime(distanceTable,orderingAmachines_init);
//        for (int i = 0; i < delayTime.length; i++) {
//            System.out.print(delayTime[i]+",");
//        }
        List<Machine> machineList = new ArrayList<>();
        List<Procedure> procedureList = new ArrayList<>();
        for (Ordering_Amachine orderingAmachine : orderingAmachines_init) {
//            machineList = procedureListToMachineList(procedureList);
//                if (orderingAmachines_init.indexOf(orderingAmachine)==25)
//                    break;
            if (orderingAmachines_init.indexOf(orderingAmachine) < 25)
                machineList = new Output_WorkmanshipA().LP1_A(orderingAmachine.getFinalPosition0(), orderingAmachine.getFinalPosition1(), orderingAmachine.getFinalPosition2(), orderingAmachine.getFinalPosition3(), procedureList, distanceTable, machineList, orderingAmachines_init.indexOf(orderingAmachine),delayTime);
            else if (orderingAmachines_init.indexOf(orderingAmachine) < 50)
                machineList = new Output_WorkmanshipA().LP2_A(orderingAmachine.getFinalPosition0(), orderingAmachine.getFinalPosition1(), orderingAmachine.getFinalPosition2(), orderingAmachine.getFinalPosition3(), procedureList, distanceTable, machineList, orderingAmachines_init.indexOf(orderingAmachine),delayTime);
            else
                machineList = new Output_WorkmanshipA().LP3_A(orderingAmachine.getFinalPosition0(), orderingAmachine.getFinalPosition1(), orderingAmachine.getFinalPosition2(), orderingAmachine.getFinalPosition3(), procedureList, distanceTable, machineList, orderingAmachines_init.indexOf(orderingAmachine),delayTime);
        }
        System.out.println(new Date());
        System.out.println("75片晶圆完成加工总时间:"+machineList.get(0).getWorkingList().get(machineList.get(0).getWorkingList().size() - 1).getEndTime() / 10.0+"秒");
        //A工序
        Scanner sc = new Scanner(System.in);
        System.out.println("最优产能序列为:");
        System.out.println(waferProductivity(procedureList));
        System.out.println("请输入您要写入的文件位置（不包含空格）");//C:\Users\Justin\Desktop\晶圆在PM上的停留时间_问题一A工艺.xlsx
        String path = sc.next();
        //writeStayTime
        writeStayTime(6, machineList, path);
        System.out.println("写入成功！");
        System.out.println("请输入您要写入的文件位置（不包含空格）");//C:\Users\Justin\Desktop\工艺A产能最优调度方案.xlsx
        String path1 = sc.next();
        int wafer = 75;
        for (int i = 0; i < wafer; i++) {
            write(procedureList, path1, i + 1);
        }
        System.out.println("写入成功！");
        //writemachineList
        System.out.println("请输入您要写入的文件位置（不包含空格）");
        String path2 = sc.next();
        writeMachineList(machineList, path2);
        System.out.println("写入成功！");
    }
    public List<Machine> LP1_A(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, int i, int[] delayTime) {
        //LP1->AL:TM1
        int startTime;
        int endTime;
        if (machineList.size() == 0)
            startTime = 0;
        else
            startTime = delayTime[i]+procedureList.get(procedureList.size() - 15).getEtime() + lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size() - 15).getEtime(), machineList, 0, null), "LP1", distanceTable);
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,true,true,machineList,endTime1,finalPosition0);
            if (newTime.size()!=0){
                startTime2=newTime.get(newTime.size()-2);
                endTime2=newTime.get(newTime.size()-1);
                counter=1;
            }
//            List<Integer> newDelayTime=checkMachineDelay_TM2(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
//            if (counter==0&&newDelayTime.size()!=0){
//                startTime2=newDelayTime.get(0);
//                endTime2=newDelayTime.get(1);
//                procedureList.set(i*17-9,new Procedure(procedureList.get(i*17-9).getProcedure(),procedureList.get(i*17-9).getMid(),procedureList.get(i*17-9).getCtime()+newDelayTime.get(2),procedureList.get(i*17-9).getStime(),procedureList.get(i*17-9).getEtime()+newDelayTime.get(2)));
//                for (int j = 0; j < 8; j++) {
//                    procedureList.set(i*17-8+j,new Procedure(procedureList.get(i*17-8+j).getProcedure(),procedureList.get(i*17-8+j).getMid(),procedureList.get(i*17-8+j).getCtime(),procedureList.get(i*17-8+j).getStime()+newDelayTime.get(2),procedureList.get(i*17-8+j).getEtime()+newDelayTime.get(2)));
//                }
//                machineList = procedureListToMachineList(procedureList);
//                counter=1;
//            }
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime2+750,startTime3,endTime3,"TM2",finalPosition1,finalPosition2,false,false,machineList,endTime2,finalPosition1);
            if (newTime.size()!=0){
                startTime3=newTime.get(newTime.size()-2);
                endTime3=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = counter==1 || checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
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
                    if (j != 0) {
                        System.out.println("编号:"+(i+1));
                        System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!" + j);
                    }
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime3+600,startTime4,endTime4,"TM2",finalPosition2,finalPosition3,true,false,machineList,endTime3,finalPosition2);
            if (newTime.size()!=0){
                startTime4=newTime.get(newTime.size()-2);
                endTime4=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b10 = counter==1 || checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
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
//        System.out.print(",");
        return machineList;
    }
    public List<Machine> LP2_A(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, int i, int[] delayTime) {
        //LP2->AL:TM1
        int startTime;
        int endTime;
        startTime = delayTime[i]+procedureList.get(procedureList.size() - 15).getEtime() + lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size() - 15).getEtime(), machineList, 0, null), "LP2", distanceTable);
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,true,true,machineList,endTime1,finalPosition0);
            if (newTime.size()!=0){
                startTime2=newTime.get(newTime.size()-2);
                endTime2=newTime.get(newTime.size()-1);
                counter=1;
            }
//            List<Integer> newDelayTime=checkMachineDelay_TM2(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
//            if (counter==0&&newDelayTime.size()!=0){
//                startTime2=newDelayTime.get(0);
//                endTime2=newDelayTime.get(1);
//                procedureList.set(i*17-9,new Procedure(procedureList.get(i*17-9).getProcedure(),procedureList.get(i*17-9).getMid(),procedureList.get(i*17-9).getCtime()+newDelayTime.get(2),procedureList.get(i*17-9).getStime(),procedureList.get(i*17-9).getEtime()+newDelayTime.get(2)));
//                for (int j = 0; j < 8; j++) {
//                    procedureList.set(i*17-8+j,new Procedure(procedureList.get(i*17-8+j).getProcedure(),procedureList.get(i*17-8+j).getMid(),procedureList.get(i*17-8+j).getCtime(),procedureList.get(i*17-8+j).getStime()+newDelayTime.get(2),procedureList.get(i*17-8+j).getEtime()+newDelayTime.get(2)));
//                }
//                machineList = procedureListToMachineList(procedureList);
//                counter=1;
//            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter==1 || checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime2+750,startTime3,endTime3,"TM2",finalPosition1,finalPosition2,false,false,machineList,endTime2,finalPosition1);
            if (newTime.size()!=0){
                startTime3=newTime.get(newTime.size()-2);
                endTime3=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = counter==1 || checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);

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
                    if (j != 0) {
                        System.out.println("编号:"+(i+1));
                        System.out.println("PM3/4->PM1/2/5/6:TM2阈值过小!!!" + j);
                    }
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime3+600,startTime4,endTime4,"TM2",finalPosition2,finalPosition3,true,false,machineList,endTime3,finalPosition2);
            if (newTime.size()!=0){
                startTime4=newTime.get(newTime.size()-2);
                endTime4=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b10 = counter==1 || checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
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
//        System.out.print(",");
        return machineList;
    }
    public List<Machine> LP3_A(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3, List<Procedure> procedureList, List<Distance> distanceTable, List<Machine> machineList, int i, int[] delayTime) {
        //LP3->AL:TM1
        int startTime;
        int endTime;
        startTime = delayTime[i]+procedureList.get(procedureList.size() - 15).getEtime() + lookDistance(lookLastPosition_TM1(procedureList.get(procedureList.size() - 15).getEtime(), machineList, 0, null), "LP3", distanceTable);
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,true,true,machineList,endTime1,finalPosition0);
            if (newTime.size()!=0){
                startTime2=newTime.get(newTime.size()-2);
                endTime2=newTime.get(newTime.size()-1);
                counter=1;
            }
//            List<Integer> newDelayTime=checkMachineDelay_TM2(endTime1+150,startTime2,endTime2,"TM2",finalPosition0,finalPosition1,machineList,endTime1,finalPosition0);
//            if (counter==0&&newDelayTime.size()!=0){
//                startTime2=newDelayTime.get(0);
//                endTime2=newDelayTime.get(1);
//                procedureList.set(i*17-9,new Procedure(procedureList.get(i*17-9).getProcedure(),procedureList.get(i*17-9).getMid(),procedureList.get(i*17-9).getCtime()+newDelayTime.get(2),procedureList.get(i*17-9).getStime(),procedureList.get(i*17-9).getEtime()+newDelayTime.get(2)));
//                for (int j = 0; j < 8; j++) {
//                    procedureList.set(i*17-8+j,new Procedure(procedureList.get(i*17-8+j).getProcedure(),procedureList.get(i*17-8+j).getMid(),procedureList.get(i*17-8+j).getCtime(),procedureList.get(i*17-8+j).getStime()+newDelayTime.get(2),procedureList.get(i*17-8+j).getEtime()+newDelayTime.get(2)));
//                }
//                machineList = procedureListToMachineList(procedureList);
//                counter=1;
//            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter==1 || checkMachine_TM2(startTime2, endTime2, "TM2", finalPosition0, finalPosition1, machineList, endTime1, finalPosition0);
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime2+750,startTime3,endTime3,"TM2",finalPosition1,finalPosition2,false,false,machineList,endTime2,finalPosition1);
            if (newTime.size()!=0){
                startTime3=newTime.get(newTime.size()-2);
                endTime3=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = counter==1 || checkMachine_TM2(startTime3, endTime3, "TM2", finalPosition1, finalPosition2, machineList, endTime2, finalPosition1);
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
            int counter=0;
            List<Integer> newTime=checkMachineSpecial_TM2(endTime3+600,startTime4,endTime4,"TM2",finalPosition2,finalPosition3,true,false,machineList,endTime3,finalPosition2);
            if (newTime.size()!=0){
                startTime4=newTime.get(newTime.size()-2);
                endTime4=newTime.get(newTime.size()-1);
                counter=1;
            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b10 = counter==1 || checkMachine_TM2(startTime4, endTime4, "TM2", finalPosition2, finalPosition3, machineList, endTime3, finalPosition2);
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
//        List<Ordering_Amachine> orderingAmachines=new ArrayList<>();
//        orderingAmachines.add(new Ordering_Amachine(finalPosition0,finalPosition1,finalPosition2,finalPosition3));
//        System.out.print(orderingAmachines.get(0).toString());
//        System.out.print(",");
        if (i==74){
            System.out.println("晶圆编号："+(i+1));
            for (Machine machine : machineList) {
                System.out.println(machine.toString());
            }
        }
        return machineList;
    }
    public int[] optimizeWaitingTime(List<Distance> distanceTable,List<Ordering_Amachine> orderingAmachines){
        int[] delayTime=new int[75];
        List<Machine> machineList_init = new ArrayList<>();
        List<Procedure> procedureList_init = new ArrayList<>();
        for (Ordering_Amachine orderingAmachine:orderingAmachines){
            machineList_init=procedureListToMachineList(procedureList_init);
            if (orderingAmachines.indexOf(orderingAmachine)<25)
                machineList_init=new Output_WorkmanshipA().LP1_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList_init,distanceTable,machineList_init,orderingAmachines.indexOf(orderingAmachine),delayTime);
            else if (orderingAmachines.indexOf(orderingAmachine)<50)
                machineList_init=new Output_WorkmanshipA().LP2_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList_init,distanceTable,machineList_init,orderingAmachines.indexOf(orderingAmachine),delayTime);
            else
                machineList_init=new Output_WorkmanshipA().LP3_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList_init,distanceTable,machineList_init,orderingAmachines.indexOf(orderingAmachine),delayTime);
        }
        int totalProductionTime=machineList_init.get(0).getWorkingList().get(machineList_init.get(0).getWorkingList().size() - 1).getEndTime();
        int continueTime_init=300;
        int continueTime=procedureList_init.get(17*2-1).getEtime()-procedureList_init.get(17).getStime()-continueTime_init;
        for (int positionIndex = 1; positionIndex < 75; positionIndex++) {
            delayTime[positionIndex]=positionIndexOptimizing(positionIndex,continueTime,distanceTable,orderingAmachines,delayTime,totalProductionTime);
            for (int i = delayTime[positionIndex]; i < 10000; i++) {
                delayTime[positionIndex]=i;
                List<Machine> machineList = new ArrayList<>();
                List<Procedure> procedureList = new ArrayList<>();
                for (Ordering_Amachine orderingAmachine:orderingAmachines){
                    machineList=procedureListToMachineList(procedureList);
                    if (orderingAmachines.indexOf(orderingAmachine)<25)
                        machineList=new Output_WorkmanshipA().LP1_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine),delayTime);
                    else if (orderingAmachines.indexOf(orderingAmachine)<50)
                        machineList=new Output_WorkmanshipA().LP2_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine),delayTime);
                    else
                        machineList=new Output_WorkmanshipA().LP3_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine),delayTime);
                }
                if (totalProductionTime!=machineList.get(0).getWorkingList().get(machineList.get(0).getWorkingList().size() - 1).getEndTime()){
                    delayTime[positionIndex]=delayTime[positionIndex]-1;
                    System.out.println("positionIndex:"+positionIndex+"\t"+"delayTime["+positionIndex+"]:"+delayTime[positionIndex]);
                    if (positionIndex!=74)
                        continueTime=procedureList.get(positionIndex*17+33).getEtime()-procedureList.get(positionIndex*17+16).getStime()-continueTime_init;
                    break;
                }
            }
            System.out.println("----------------------");
        }
        return delayTime;
    }
    public boolean optimizing(List<Distance> distanceTable,List<Ordering_Amachine> orderingAmachines,int[] delayTime,int totalProductionTime){
        List<Machine> machineList = new ArrayList<>();
        List<Procedure> procedureList = new ArrayList<>();
        for (Ordering_Amachine orderingAmachine:orderingAmachines){
            machineList=procedureListToMachineList(procedureList);
            if (orderingAmachines.indexOf(orderingAmachine)<25)
                machineList=new Output_WorkmanshipA().LP1_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine),delayTime);
            else if (orderingAmachines.indexOf(orderingAmachine)<50)
                machineList=new Output_WorkmanshipA().LP2_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine),delayTime);
            else
                machineList=new Output_WorkmanshipA().LP3_A(orderingAmachine.getFinalPosition0(),orderingAmachine.getFinalPosition1(),orderingAmachine.getFinalPosition2(),orderingAmachine.getFinalPosition3(),procedureList,distanceTable,machineList,orderingAmachines.indexOf(orderingAmachine),delayTime);
        }
        if (totalProductionTime!=machineList.get(0).getWorkingList().get(machineList.get(0).getWorkingList().size() - 1).getEndTime())
            return false;
        else
            return true;
    }
    public int positionIndexOptimizing(int positionIndex,int continueTime,List<Distance> distanceTable,List<Ordering_Amachine> orderingAmachines,int[] delayTime,int totalProductionTime){
        int minValue,maxValue;
        delayTime[positionIndex]=continueTime;
        if (optimizing(distanceTable,orderingAmachines,delayTime,totalProductionTime)){
            do {
                minValue=delayTime[positionIndex];
                delayTime[positionIndex]=minValue+20;
            }while (optimizing(distanceTable,orderingAmachines,delayTime,totalProductionTime));
            return minValue;
        }
        maxValue=continueTime;
        minValue=0;
        do {
            delayTime[positionIndex]=(maxValue+minValue)/2;
            if (optimizing(distanceTable,orderingAmachines,delayTime,totalProductionTime))
                minValue=delayTime[positionIndex];
            else
                maxValue=delayTime[positionIndex];
        }while (!((maxValue-minValue)<5));
        return minValue;
    }
}