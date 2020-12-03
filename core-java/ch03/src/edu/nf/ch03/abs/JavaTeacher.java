package edu.nf.ch03.abs;

public class JavaTeacher extends Teacher{

    @Override
    public void lesson(){
        System.out.println("开始上Java课程");
    }

    @Override
    public void homework(){
        System.out.println("布置Java作业");
    }
}
