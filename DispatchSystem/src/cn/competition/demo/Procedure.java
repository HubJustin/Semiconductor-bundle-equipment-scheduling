package cn.competition.demo;

public class Procedure {
    private String procedure;
    private Integer mid;
    private int ctime;
    private int stime;
    private int etime;

    @Override
    public String toString() {
        return '\n'+"procedure='" + procedure + '\'' +
                ", mid=" + mid +
                ", ctime=" + ctime/10.0 +
                ", stime=" + stime/10.0 +
                ", etime=" + etime/10.0;
    }

    public Procedure(String procedure, Integer mid, int ctime, int stime, int etime) {
        this.procedure = procedure;
        this.mid = mid;
        this.ctime = ctime;
        this.stime = stime;
        this.etime = etime;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public int getCtime() {
        return ctime;
    }

    public void setCtime(int ctime) {
        this.ctime = ctime;
    }

    public int getStime() {
        return stime;
    }

    public void setStime(int stime) {
        this.stime = stime;
    }

    public int getEtime() {
        return etime;
    }

    public void setEtime(int etime) {
        this.etime = etime;
    }
}

