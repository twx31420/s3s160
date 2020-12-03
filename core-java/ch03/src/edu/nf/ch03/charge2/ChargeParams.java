package edu.nf.ch03.charge2;

/**
 * @author 天文学
 */
public class ChargeParams {
    //用户支付金额
    private Double money;
    //折扣率
    private Double discount;
    //满多少
    private Double moneyCondition;
    //返多少
    private Double moneyReturn;
    private Product product;

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(Double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public Double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(Double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
