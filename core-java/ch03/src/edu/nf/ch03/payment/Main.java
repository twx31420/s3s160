package edu.nf.ch03.payment;

/**
 *
 * @author 天文学
 */
public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        p.setName("oppo");
        p.setPrice(200.00);
        //Charge c=new Rebate();
        double d=c.charge(1000.00,p);
        c.find(d);
    }
}
