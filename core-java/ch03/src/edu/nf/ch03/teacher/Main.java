package edu.nf.ch03.teacher;

/**
 * @author 天文学
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher=new JavaTeacher();
        teacher.call();
        teacher.lesson();
        teacher.homework();
    }
}
