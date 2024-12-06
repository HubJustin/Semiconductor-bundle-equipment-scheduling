package cn.competition.demo;

public class Ordering_Amachine {
    private String finalPosition0;
    private String finalPosition1;
    private String finalPosition2;
    private String finalPosition3;

    @Override
    public String toString() {
        return "new Ordering_Amachine(" +
                "\"" + finalPosition0 + "\"" +
                ", \"" + finalPosition1 + "\"" +
                ", \"" + finalPosition2 + "\"" +
                ", \"" + finalPosition3 + "\"" +
                ')';
    }

    public Ordering_Amachine(String finalPosition0, String finalPosition1, String finalPosition2, String finalPosition3) {
        this.finalPosition0 = finalPosition0;
        this.finalPosition1 = finalPosition1;
        this.finalPosition2 = finalPosition2;
        this.finalPosition3 = finalPosition3;
    }

    public String getFinalPosition0() {
        return finalPosition0;
    }

    public void setFinalPosition0(String finalPosition0) {
        this.finalPosition0 = finalPosition0;
    }

    public String getFinalPosition1() {
        return finalPosition1;
    }

    public void setFinalPosition1(String finalPosition1) {
        this.finalPosition1 = finalPosition1;
    }

    public String getFinalPosition2() {
        return finalPosition2;
    }

    public void setFinalPosition2(String finalPosition2) {
        this.finalPosition2 = finalPosition2;
    }

    public String getFinalPosition3() {
        return finalPosition3;
    }

    public void setFinalPosition3(String finalPosition3) {
        this.finalPosition3 = finalPosition3;
    }
}
