package edu.nf.ch03.calc;

/**
 * 抽象的计算器，包含一个抽象的计算方法
 */
public abstract class Calc {
    /**
     * 计算方法有不同的实现
     * @return
     */
    public abstract double cal(double a,double b);

    /**
     * 公共的显示输出方法，将计算结果显示到控制台
     */
    public void desplay(double c){
        System.out.println(c);
    }
}
