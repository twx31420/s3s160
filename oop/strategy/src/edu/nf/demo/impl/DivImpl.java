package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class DivImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        return numA.divide(numB);
    }
}
