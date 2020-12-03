package edu.nf.demo3.impl;

import edu.nf.demo3.ServiceInf;

public class StuServiceImpl implements ServiceInf {
    @Override
    public void add() {
        System.out.println("添加学生信息");
        //记录日志
//        System.out.println("记录操作日志");
    }

    @Override
    public void update() {
        System.out.println("修改学生信息");
    }

    @Override
    public void get() {
        System.out.println("查询学生信息");
    }
}
