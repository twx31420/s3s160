package edu.nf.demo;

import java.math.BigDecimal;

/**
 * @author 天文学
 */
public interface Calculator {
    /**
     * decimal
     * 抽象的计算方法
     * @param numA
     * @param numB
     * @return
     */
    BigDecimal cal(BigDecimal numA,BigDecimal numB);

}
