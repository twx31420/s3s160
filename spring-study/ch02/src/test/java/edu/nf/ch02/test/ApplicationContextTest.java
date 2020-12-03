package edu.nf.ch02.test;

import edu.nf.ch02.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/11/30
 */
public class ApplicationContextTest {
    @Test
    public void testBean(){
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       People people=context.getBean("people",People.class);
       People people1=context.getBean("people",People.class);

        System.out.println(people);
        System.out.println(context.getBean("people",People.class));

        System.out.println(people1);
        //people.say();
    }
}
