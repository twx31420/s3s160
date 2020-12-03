package edu.nf.demo;

public class PhpTeacher extends Teacher{
    @Override
    public void lesson() {
        System.out.println("上php课程");
    }

    @Override
    public void homework() {
        System.out.println("布置php作业");
    }
}
