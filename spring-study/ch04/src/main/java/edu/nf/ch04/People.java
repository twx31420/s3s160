package edu.nf.ch04;

/**
 * @author 天文学
 * @date 2020/12/1
 */
public class People {

    public People() {
        System.out.println("执行了构造方法");
    }

    /**
     * spring调用
     * bean 的初始化方法，注意：是在对象创建之后执行
     */
    public void init(){
        System.out.println("执行bean的init方法");
    }

    /**
     * spring调用
     * bean的销毁方法，注意：是在销毁bean之前执行
     */
    public void destroy(){
        System.out.println("执行bean的destroy方法");
    }

    public void say(){
        System.out.println("hello world");
    }
}
