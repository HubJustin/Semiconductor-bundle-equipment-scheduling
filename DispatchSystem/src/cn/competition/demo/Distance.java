package cn.competition.demo;

public class Distance {
    private String startDest;
    private String dest;
    private int distance;

    public String toString() {
        return ""+ startDest  +"\t"+ dest +"\t"+ distance;
    }

    public Distance(String startDest, String dest, int distance) {
        this.startDest = startDest;
        this.dest = dest;
        this.distance = distance;
    }

    public String getStartDest() {
        return startDest;
    }

    public void setStartDest(String startDest) {
        this.startDest = startDest;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}


