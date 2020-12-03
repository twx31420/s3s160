package edu.nf.demo1;

/**
 * @author 天文学
 * 抽象的任务处理器
 */
public abstract class AbstractHandler {
    /**
     * 按一个任务处理着
     * 由客户端进行装配
     */
    private AbstractHandler handler;


    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    public AbstractHandler getHandler() {
        return handler;
    }

    /**
     * 抽象的任务处理方法，由不同的子类去调用
     */
    public abstract void execute(int money);
}
