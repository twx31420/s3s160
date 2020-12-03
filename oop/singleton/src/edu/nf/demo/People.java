package edu.nf.demo;

/**
 * @author 天文学
 * 饿式
 */
public class People {
    /**
     * 创建一个自身的实例
     */
    private static People instance=new People();
    /**
     * 将构造方法私有化
     */

    public static People  getInstance(){
        return instance;
    }
   private People(){

   }

public void say(){
    System.out.println("hello word");
}
}
