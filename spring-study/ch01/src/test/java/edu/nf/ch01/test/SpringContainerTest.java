package edu.nf.ch01.test;

import edu.nf.ch01.People;
import edu.nf.ch01.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/11/30
 *
 * 在spring的框架中工厂分类两种
 * 一种是beanfactory，另一种是applicationfactoryContext
 * 简单来说，beanfactory是spring的最基础的bean工厂，
 * 而applicationfactoryContext针对beanfactory做了很多的功能的扩展和增强
 * 官方也推荐我们使用applicationfactoryContext这个接口来操作spring容器
 */
public class SpringContainerTest {



    @Test
    public void testGetBean(){
        //初始化spring容器（也就是一个容器工厂）
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean对象
//        Users user=(Users)context.getBean("user");
        //使用泛型来获取
        Users user=context.getBean("user",Users.class);
        user.say();
        People peo=(People)context.getBean("people");
        peo.run();
    }
    @Test
    public void testFactoryBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Users users =context.getBean("user1",Users.class);
        users.say();
    }
}
