package edu.nf.ch04;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 天文学
 * @date 2020/12/1
 */
public class Users implements InitializingBean, DisposableBean {

    public Users() {
        System.out.println("执行构造方法");
    }

    public void init(){
        System.out.println("执行init方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet方法");
    }
    public void mydestroy(){
        System.out.println("执行mydestroy方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行destroy方法");
    }
}
