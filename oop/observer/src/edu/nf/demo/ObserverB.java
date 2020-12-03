package edu.nf.demo;

/**
 * @author 天文学
 */
public class ObserverB implements Observer {
    @Override
    public void doSomething(String message) {
        System.out.println("ObserverB处理消息：" + message);
    }
}
