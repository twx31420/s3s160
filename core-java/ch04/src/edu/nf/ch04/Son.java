package edu.nf.ch04;

/**
 * @author 天文学
 * 对象的初始化流程
 * 初始化父类的静态成员--->子类的静态成员--->初始化父类的实例变量
 * --->执行父类实例代码块--->执行父类的构造方法--->初始化子类的实例变量
 * --->执行子类的实例代码块--->执行子类的构造方法
 *
 *
 */
public class Son extends Father {
    private String sname="son";
    private static  String sex="男";

    static {
        System.out.println(sex);
    }
    {
        System.out.println(sname);
    }
    public Son(){
        //任何构造方法的第一行代码都是一个隐式的super（），
        //表示调用父类的构造方法，因为这样能正确的先初始化父类
        //一直到object
        super();
        System.out.println("This is son");
    }

    public static void main(String[] args) {
        Son s=new Son();

    }

}
