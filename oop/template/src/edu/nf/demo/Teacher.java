package edu.nf.demo;

/**
 * @author 天文学
 */
public abstract class Teacher {

    public void call(){
        System.out.println("上课点名");
    }

    public void otherWork(){
        System.out.println("其他工作");
    }

    /**
     * 钩子方法，可以让子类重写类剔除不需要的步骤
     */
    public boolean hock(){
        return true;
    }

    public abstract void lesson();

    public abstract void homework();

    /**
     * 声明一个模板方法，将步骤的细节封装
     */
    public void doWork(){
        call();
        lesson();
        homework();
        //当钩子方法返回true的时候才会调用
        if(hock()){
            otherWork();
        }
    }
}
