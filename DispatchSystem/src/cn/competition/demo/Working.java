package cn.competition.demo;

public class Working {
    private Integer wid;
    private int startTime;
    private int endTime;

    public Working(Integer wid, int startTime, int endTime) {
        this.wid = wid;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String toString() {
        return ""+ wid  +" "+ startTime/10.0 +" "+ endTime/10.0;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
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

