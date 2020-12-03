package edu.nf.ch03.payment;

import java.util.Scanner;

/**
 * @author 天文学
 */
public class Rebate extends Charge{

    private double moneyfanli;
    private double moneyreturn;
    public Rebate(double moneyfanli,double moneyreturn){
        this.moneyfanli=moneyfanli;
        this.moneyreturn=moneyreturn;
    }
    @Override
    public double charge(double money, Product p) {
        check(money,p.getPrice());
        if(p.getPrice()>moneyfanli){
            return money-p.getPrice()+moneyreturn;
        }else{
            return money-p.getPrice() ;
        }
    }


}
