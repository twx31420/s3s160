package edu.nf.ch03.calc;

public class Main {
    public static void main(String[] args) {
        Calc c=new Add();
        double result=c.cal(1,2);
        c.desplay(result);
    }
}
