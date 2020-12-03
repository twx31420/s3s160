package edu.nf.ch03.charge2;

/**
 * @author 天文学
 * 接口中只能定义常量和抽象方
 * 一个类是可以同时实现多个接口，
 * 接口也可以继承接口,但只能继承一个
 */
public interface  Charge extends MyInf{
    /**
     * 接口中只能定义常量，注意规范，常量名必须全大写
     * 并且final和static是不需要加上的，编译器在编译时会自动补全
     */
    public static final String CLASS_NAME="";
    /**
     * 接口中定义的抽象不需要加abstract关键字，编译器在编译时会自动补全
     * @param params
     * @return
     */
    public  double charge(ChargeParams params);
}
