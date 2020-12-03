package edu.nf.ch05.service.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UserDaoImpl;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 天文学
 * @date 2020/12/1
 */
public class UserServiceImpl implements UserService {

    private UserDao dao;

    /**
     * 构造方法
     */
    public UserServiceImpl() {
    }

    /**
     * 构造方法注入
     * @param dao
     */
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    /**
     * 提供一个set方法个spring容器，这个方法就是注入的入口方法，
     * 那么spring就会调用这个方法，从容器中将一个userDao的实现类
     * 给注入进来，赋值给上面的接口
     *
     * @param dao
     */
    public void setDao(UserDao dao) { this.dao = dao;
    }

    @Override
    public void add(Users users) {
//        //初始化容器
//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        //从容器中找到对应的userDao实现类对象
//        UserDao dao =context.getBean("userDao",UserDao.class);
        dao.save(users);
    }
}
