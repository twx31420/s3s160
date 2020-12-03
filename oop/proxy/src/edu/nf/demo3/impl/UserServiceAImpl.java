package edu.nf.demo3.impl;

import edu.nf.demo3.ServiceInf;

public class UserServiceAImpl implements ServiceInf {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void get() {
        System.out.println("查询用户");
    }
}
