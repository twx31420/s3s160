package edu.nf.ch03.teacher;

/**
 * @author 天文学
 */
public abstract class Teacher {
    public  void call(){
        System.out.println("上课点名");
    }

    /**
     * 抽象的上课方法，不同的老师哟不同授课内容
     * 因此不同的字类实现
     */
    public abstract void lesson();

    /**
     * 布置作业，不同老师布置不同的作业
     */
    public abstract void homework();
}
