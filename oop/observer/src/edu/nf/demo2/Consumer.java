package edu.nf.demo2;

/**
 * @author 天文学
 * 消息消费方（订阅方）
 */
public class Consumer {
    /**
     * 消息队列
     */
    private MessageBroker broker;

    public Consumer(MessageBroker broker) {
        this.broker = broker;
    }

    /**
     * 订阅方法
     */
    public void subscribe() {
        String message = broker.subscribe();
        System.out.println("订阅者处理消息：" + message);
    }

}
