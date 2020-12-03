package edu.nf.demo;

/**
 * @author 天文学
 * 抽象的观察者
 */
public interface Observer {
    /**
     * 当主题对象有变化是会通知观察者，
     * 观察者就会执行此方法
     *
     * @param message
     */
    void doSomething(String message);
}
