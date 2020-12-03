package edu.nf.ch03.change;

import edu.nf.ch03.payment.Product;

/**
 * @author 天文学
 */
public abstract class Change {
    /**
     * 计算
     * @param money
     * @param p
     * @return
     */
    public abstract  double charge(double money, Product p);
}
