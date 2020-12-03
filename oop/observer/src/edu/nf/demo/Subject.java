package edu.nf.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 天文学
 * 抽象主题
 */
public abstract class Subject {
    /**
     * 观察者的列表（用于注册所有的观察者对象）
     * 当主题有变化是，会通知列表中的所有观察者
     */
    private List<Observer> list = new ArrayList<>();

    /**
     * 添加观察者（注册）
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知方法，一旦主题有变化或者更新的消息，就会通知
     * 所有的观察者
     *
     * @param message
     */
    protected void notifyObservers(String message) {
        list.forEach(observer -> {
            observer.doSomething(message);
        });
    }

}
