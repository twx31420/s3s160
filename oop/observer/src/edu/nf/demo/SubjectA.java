package edu.nf.demo;

/**
 * @author 天文学
 * 具体的主题，可以在这个类中发布消息（发布事件）
 */
public class SubjectA extends Subject {
    /**
     * 发布消息
     *
     * @param message
     */
    public void publish(String message) {
        System.out.println("SubjectA发布了新的消息：" + message);
        //通知所有的观察者去做相应的处理
        notifyObservers(message);
    }

}
