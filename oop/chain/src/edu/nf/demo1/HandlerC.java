package edu.nf.demo1;

import javax.swing.*;

/**
 * @author 天文学
 * CEO ，审批限额为10000元
 */
public class HandlerC extends AbstractHandler {
    @Override
    public void execute(int money) {
        if(money<=10000){
            System.out.println("CEO审核通过");
        }else {
            System.out.println("驳回");
        }
    }
}
