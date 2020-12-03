package edu.nf.demo5;

import edu.nf.demo4.UserService;
import org.evergreen.aop.core.ProxyBuilder;

import javax.swing.*;

/**
 * @author 天文学
 */
public class Main {
    public static void main(String[] args) {

        //创建一个代理生成器
        ProxyBuilder builder=new ProxyBuilder(UserService.class);
        //创建代理实例
        StuService proxy=builder.createProxy();
        proxy.add();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        proxy.update();
    }
}
