package edu.nf.ch03.teacher;

/**
 * @author 天文学
 */
public class PhpTeacher extends Teacher implements Coding {
    @Override
    public void lesson() {
        System.out.println("上Php课");
    }

    @Override
    public void homework() {
        System.out.println("布置Php作业");
    }
    @Override
    public void code() {
        System.out.println("开发Php项目");
    }
}
