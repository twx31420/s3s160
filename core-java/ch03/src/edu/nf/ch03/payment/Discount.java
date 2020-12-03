package edu.nf.ch03.payment;

import java.util.Scanner;

/**
 * @author 天文学
 */
public class Discount extends Charge {

    private double dis;
    public Discount(double dis){
        this.dis=dis;
    }

    @Override
    public double charge(double money, Product p) {
        check(money,p.getPrice());
        return money-p.getPrice()*dis;
    }
}
