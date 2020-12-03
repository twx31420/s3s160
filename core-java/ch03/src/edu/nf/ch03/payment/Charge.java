package edu.nf.ch03.payment;

import java.util.Scanner;

/**
 * @author 天文学
 */
public abstract class Charge {


    /**
     * 计算
     * @param money
     * @param p
     * @return
     */
    public abstract  double charge(double money,Product p);

    public void check(double f,double price){
        if(f<price){
            System.out.println("余额不足！");
            System.exit(0);
        }
    }
    /**
     * 找零
     * @param b
     */
    public void find(double b){
        System.out.println("找回："+b);
    }

}
