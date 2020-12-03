package edu.nf;

import edu.nf.abstractfactory.AbstractFactory;
import edu.nf.abstractfactory.impl.AppleFactory;
import edu.nf.containerfactory.ClassUtil;
import edu.nf.containerfactory.ContainerFactory;
import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.methodfactory.impl.ApplePhoneFactory;
import edu.nf.supperfactory.ObjectFactory;
//import edu.nf.methodfactory.AbstractFactory;
//import edu.nf.methodfactory.impl.ApplePhoneFactory;

public class Main {
    public static void main(String[] args) {
        //简单工厂 （可以创建任意多个对象），缺点在于当有新的对象加入时
        //必须修改原有的工厂
//        Phone phone= SimpleFactory.build("apple");
//        phone.call();
//        phone.message();

        //工厂方法（每一个工厂只负责创建一种对象），优点就是很好的解决的ocp
        //原则的为题，缺点则是当对象过多的时候，工厂类也会随之增长
        //从而变成类爆炸
//        AbstractFactory factory=new ApplePhoneFactory();
//        Phone phone=factory.build();
//        phone.call();
//        phone.message();

        //抽象工厂 （每一个工厂可以生产多种产品）解决了工厂方法单一的问题
        //导致工厂类众多，抽象工厂可以生产整个产品族
//        AbstractFactory factory=new AppleFactory();
//        Phone phone=factory.buildPhone();
//        Pad pad=factory.buildPad();
//        phone.call();
//        phone.message();

        //超级工厂 在简单工厂基础上结合反射
//        Phone phone=ObjectFactory.build("edu.nf.item.impl.ApplePhone");
//        phone.message();
//        phone.call();

        //容器工厂， 利用注解标识，在扫描是如果类上
        //带有自定义注解的类表示要纳入容器中管理
        //此时容器工厂就会预先将这些类的实例个初始化好
        //保存在容器 （map集合中）
        ContainerFactory factory=new ContainerFactory();
        Phone phone=factory.getBean("applePhone");
        phone.call();
        phone.message();
        Pad pad=factory.getBean("applePad");
        pad.read();
        pad.play();

        ClassUtil classUtil=new ClassUtil("edu.nf.methodfactory.impl");
        ApplePhoneFactory factory1=classUtil.getInstance("ApplePhoneFactory");
        Phone phone1=factory1.build();
        phone1.message();
        phone1.call();

    }
}
