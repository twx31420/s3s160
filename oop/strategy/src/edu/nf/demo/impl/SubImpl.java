package edu.nf.demo.impl;


import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class SubImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        //减法运算
        return numA.subtract(numB);
    }
}
