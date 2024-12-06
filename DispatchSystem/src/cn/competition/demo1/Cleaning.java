package cn.competition.demo1;

public class Cleaning {
    private String machine;
    private int continueTime;
    private int startTime;
    private int endTime;

    public String toString() {
        return '\n'+"machine='" + machine + '\'' +
                ", continueTime=" + continueTime/10.0 +
                ", startTime=" + startTime/10.0 +
                ", endTime=" + endTime/10.0;
    }

    public Cleaning(String machine, int continueTime, int startTime, int endTime) {
        this.machine = machine;
        this.continueTime = continueTime;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public int getContinueTime() {
        return continueTime;
    }

    public void setContinueTime(int continueTime) {
        this.continueTime = continueTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}

