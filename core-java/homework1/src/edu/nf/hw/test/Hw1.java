package edu.nf.hw.test;

import edu.nf.hw.entity.Student;

/**
 * @author 天文学
 */
public class Hw1 {
    public static void main(String[] args) {

        int j=0;
        int n=1;
        for (int i=0;i<20;i++){
            System.out.println(j);
            int tem=n+j;
            j=n;
            n=tem;
        }
    }
    public static class Hw2{
        public static void main(String[] args) {
            Student student=new Student("张三",21,"男","广东珠海");
            System.out.println(student);
        }
    }
}

