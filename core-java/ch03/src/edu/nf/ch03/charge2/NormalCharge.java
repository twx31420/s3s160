package edu.nf.ch03.charge2;

/**
 * @author 天文学
 */
public class NormalCharge implements Charge {
    @Override
    public double charge(ChargeParams params) {
        System.out.println("应收："+(params.getProduct().getPrice()));
        System.out.println("实收："+params.getMoney());
        return params.getMoney()-params.getProduct().getPrice();
    }
}
