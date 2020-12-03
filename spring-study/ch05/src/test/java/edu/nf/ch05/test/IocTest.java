package edu.nf.ch05.test;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/12/1
 */
public class IocTest {
    @Test
    public void testContainer(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserService service=context.getBean("userService", UserService.class);
        service.add(new Users());
    }
}
