package edu.nf.ch02;

/**
 * 继承is a 的思想
 * 方法的重写（覆盖）只能发生在父类和子类之间
 * 由子类重写父类的非私有的方法
 * 注意：静态方法不具备重写的特性，只看编译时类型
 *运行时多态，
 *
 *
 * 重载可以发生在本类中，也可以发生在父类和子类之间
 * 重载的要求是方法名相同，差数的个数和类型不同即可
 * 并且构造方法不能重写，能重载
 * 重载时编译时多态
 */

public class JavaTeacher extends Teacher{

    public JavaTeacher(){

    }
    public JavaTeacher(int e){

    }
    /**
     * 重写的目的是为了改变父类的默认行为，以满足当前的业务需求
     */
    @Override //重写  覆盖
    public void say(){//返回类型相同或更宽
        System.out.println(" Hello JavaTeacher");
    }
    public void hello(){
        System.out.println("Hello sir.");
    }
    public void hello(String name){
        System.out.println("Hello "+name);
    }
}
