package edu.nf.demo;

/**
 * @author 天文学
 */
public class Main {
    public static void main(String[] args) {
        //创建主题
        SubjectA subject = new SubjectA();
        //创建多个观察者
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        //将观察者注册（添加）到具体的主题上
        subject.addObserver(observerA);
        subject.addObserver(observerB);
        //发布消息
        subject.publish("hello world");
    }
}
