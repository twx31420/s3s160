package edu.nf.demo;

import edu.nf.win.MainFrame;

public class Main {
    public static void main(String[] args) {
        People p=People.getInstance();
        People p1=People.getInstance();
        System.out.println(p);
        System.out.println(p1);

        Student s1=Student.getInstance();
        Student s2=Student.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        new MainFrame();

    }
}
