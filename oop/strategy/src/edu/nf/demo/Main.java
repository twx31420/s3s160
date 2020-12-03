package edu.nf.demo;

import edu.nf.demo.impl.AddImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        Calculator c =new AddImpl();
//        BigDecimal numA=new BigDecimal("3.5");
//        BigDecimal numB=new BigDecimal("2.746345");
//        BigDecimal result=c.cal(numA,numB);

        BigDecimal numA=new BigDecimal("3.5");
        BigDecimal numB=new BigDecimal("2.746345");

        CalculatorContext context=new CalculatorContext("add");
        BigDecimal result=context.cal(numA,numB);
        System.out.println(result.doubleValue());
        //可以将BigDecimal转换为其他的基本数据类型，列如：double类型
        System.out.println(result.longValue());
    }
}
