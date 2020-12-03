package edu.nf.demo;

public class JavaTeacher extends Teacher{
    @Override
    public void lesson() {
        System.out.println("上java课程");
    }

    @Override
    public void homework() {
        System.out.println("布置java作业");
    }
}
