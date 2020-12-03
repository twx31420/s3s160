package edu.nf.ch03.teacher;

/**
 * @author 天文学
 *
 * JDK1.8之后接口可以定义默认方法
 * 默认方法就是在接口中国的一种默认实现
 * 实现类可以针对自身的业务需要重写
 * 这些默认方法
 */
public interface Coding {
    /**
     * 定义默认方法，是有方法体的
     */
    default void call(){
        System.out.println("上课点名");
    }

    /**
     * 开发
     */
    default void code(){};
    public static void say(){

    }

    /**
     *
     */
    public void lesson();

    public void homework();
}
