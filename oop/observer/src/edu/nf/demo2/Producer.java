package edu.nf.demo2;

/**
 * @author 天文学
 * 消息的发布方
 */
public class Producer {

    /**
     * 消息队列
     */
    private MessageBroker broker;

    public Producer(MessageBroker broker) {
        this.broker = broker;
    }

    /**
     * 发布方法
     *
     * @param message
     */
    public void publish(String message) {
        System.out.println("发布消息" + message);
        //发布消息
        broker.publish(message);

    }

}
