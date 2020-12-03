package edu.nf.ch03.payment;

/**
 *
 * @author 天文学
 */
public class NormalCharge extends Charge{


    @Override
    public double charge(double money, Product p) {
        check(money,p.getPrice());
        return money-p.getPrice();
    }
}
