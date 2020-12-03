package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 天文学
 * @date 2020/12/3
 */
//@Component("service")
@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //注入userdao
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("执行userServiceimpl");
        userDao.save();
    }
}
