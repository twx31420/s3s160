package edu.nf.demo;

/**
 * @author 天文学
 */
public class ObserverA implements Observer{
    @Override
    public void doSomething(String message) {
        System.out.println("ObserverA 处理消息："+message);
    }
}
