package edu.nf.ch07.test;

import edu.nf.ch07.demo1.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/12/2
 */
public class SpringTest {
    @Test
    public void testFactoryBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        UserService service1=context.getBean("userService",UserService.class);
        UserService service2=context.getBean("userService",UserService.class);
        System.out.println(service1);
        System.out.println(service2);

    }
}
