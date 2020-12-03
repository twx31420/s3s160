package edu.nf.demo2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author 天文学
 * 消息中心，（消息队列）
 */
public class MessageBroker {
    /**
     * 阻塞队列，相当于消息中心
     */
    private BlockingQueue<String> broker = new LinkedBlockingDeque<>();

    /**
     * 发布消息（给发布方法调用）
     *
     * @param message
     */
    public void publish(String message) {

        try {
            broker.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 订阅消息（给订阅方法调用）
     *
     * @return
     */
    public String subscribe() {
        try {
            return broker.take();
        } catch (InterruptedException e) {
            throw new RuntimeException("订阅失败", e);
        }
    }

}
