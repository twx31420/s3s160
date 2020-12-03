package edu.nf.ch03.teacher;

/**
 * @author 天文学
 */
public class EnglishTeacher extends Teacher{
    @Override
    public void lesson() {
        System.out.println("上英语");
    }

    @Override
    public void homework() {
        System.out.println("");
    }
}
