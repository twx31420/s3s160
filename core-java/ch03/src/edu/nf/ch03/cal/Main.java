package edu.nf.ch03.cal;

public class Main {
    public static void main(String[] args) {
        Calc c=new Take();
        Object e=c.result();
        System.out.println("结果为："+e);
    }
}
