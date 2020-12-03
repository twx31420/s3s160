package edu.nf.ch03.test;

import edu.nf.ch03.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/11/30
 */
public class SpringTest {
    @Test
    public void testIdAndName(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //根据id来获取bean实例
        People people=context.getBean("people",People.class);
        System.out.println(people);
        //根据name来获取bean实例
        People p1=context.getBean("p1",People.class);
        People p2=context.getBean("p2",People.class);
        System.out.println(p1);
        System.out.println(p2);
    }
}
