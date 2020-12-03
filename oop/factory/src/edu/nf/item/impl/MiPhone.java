package edu.nf.item.impl;

import edu.nf.item.Phone;

public class MiPhone extends Phone {
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void message() {
        System.out.println("小米手机发短信");
    }
}
