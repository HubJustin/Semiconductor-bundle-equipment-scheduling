package cn.competition.demo;

import java.util.List;

public class Machine {
    private String machine;
    private List<Working> workingList;

    public String toString() {
        return  machine  +"\t"+
                workingList.toString() ;
    }

    public Machine(String machine, List<Working> workingList) {
        this.machine = machine;
        this.workingList = workingList;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public List<Working> getWorkingList() {
        return workingList;
    }

    public void setWorkingList(List<Working> workingList) {
        this.workingList = workingList;
    }
}


