package edu.nf.ch03.abs;

/**
 * 1、在一个抽象类中是可以没有任何抽象方法的，
 * 2、但是，如果一个类中只要包含一个抽象方法。这个类就必须是抽象类
 * 3、抽象类不能实例化的，只能用于继承
 * 4、抽象类可以有自己的构造方法和成员方法
 *
 *
 */
public abstract class Teacher {
    public Teacher(){

    }

    /**
     * 点名，被所有的子类继承
     */
    public  void call(){
        System.out.println("上课点名");
    }

    /**
     * 上课，这是一个抽象方法，因为不同的老师
     * 授课的内容和方式是不一样的，以此由子类
     * 去做不同的实现
     */
    public abstract void lesson();

    /**
     * 布置作业，这也是一个抽象方法
     * 由不同子类实现
     */
    public abstract void homework();

    /**
     * 添加一个工作的方法，去调用其他的方法
     */
    public void work(){
        this.call();
        this.lesson();
        this.homework();
    }
}
