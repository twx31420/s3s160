package edu.nf.ch08.test;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.service.UserService;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //此时从容器获取的Bean就是一个mapper代理对象，它已经实现了useDao
        //
        UserService service=context.getBean(UserService.class);
        service.listUser().forEach(users -> System.out.println(users.getUserName()));
    }
}
