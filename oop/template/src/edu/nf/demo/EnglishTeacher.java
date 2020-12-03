package edu.nf.demo;

/**
 * @author 天文学
 */
public class EnglishTeacher extends Teacher{
    @Override
    public void lesson() {
        System.out.println("上英语课程");
    }

    @Override
    public void homework() {
        System.out.println("布置英语作业");
    }

    /**
     * 重写hock方法，将返回false
     * @return
     */
    @Override
    public boolean hock() {
        return false;
    }
}
