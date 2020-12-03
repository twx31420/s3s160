package edu.nf.ch09.test;

import edu.nf.ch09.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/12/3
 */
public class SpringTest {
    @Test
    public void testIoc(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserController controller=context.getBean("controller", UserController.class);
        controller.add();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
