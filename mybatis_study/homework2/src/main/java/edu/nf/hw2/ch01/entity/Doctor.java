package edu.nf.hw2.ch01.entity;

public class Doctor extends Person{
    @Override
    public void work() {
        System.out.println("医生工作");
    }
}
