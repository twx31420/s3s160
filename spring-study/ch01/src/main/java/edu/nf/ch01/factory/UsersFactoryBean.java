package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

import javax.print.attribute.standard.PresentationDirection;

/**
 * @author 天文学
 * @date 2020/11/30
 * 自定义一个工厂给spring，spring就会使用这个工厂
 * 来创建bean对象，这个自定义工厂本身也会纳入spring容器中管理，
 * 因此命名是通常都是XxxFactoryBean
 */
public class UsersFactoryBean {

    public Users build(){
        return new Users();
    }
}
