package edu.nf.ch03.teacher;

/**
 * @author 天文学
 */
public class JavaTeacher  implements Coding {
    @Override
    public void lesson() {
        System.out.println("上Java课");
    }

    @Override
    public void homework() {
        System.out.println("布置Java作业");
    }

    @Override
    public void code() {
        System.out.println("开发Java项目");
    }
}
