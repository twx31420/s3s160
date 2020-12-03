package edu.nf.ch03.charge2;

/**
 * @author 天文学
 */
public class RebateCharge implements Charge{
    @Override
    public double charge(ChargeParams params) {
        System.out.println("实收："+(params.getProduct().getPrice()));
        return params.getProduct().getPrice()>=params.getMoneyCondition()?params.
                getMoney()-params.getProduct().getPrice():
                params.getMoney()-(params.getProduct().getPrice()-params.getMoneyReturn());
    }
}
