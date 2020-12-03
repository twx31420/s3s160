package edu.nf.demo1;

public class Main {
    public static void main(String[] args) {
        //创建所有的任务处理者
        AbstractHandler handlerA=new HandlerA();
        AbstractHandler handlerB=new HandlerB();
        AbstractHandler handlerC=new HandlerC();

        //转配执行链
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        //执行任务链，从链中的是一个任务处理者开始
        handlerA.execute(100000);

    }
}
