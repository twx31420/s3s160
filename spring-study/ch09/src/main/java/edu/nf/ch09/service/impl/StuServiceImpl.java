package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author 天文学
 * @date 2020/12/3
 */
@Service("stuService")
//@Primary注解标识在类上，表示优先注入的bean
//@Primary
public class StuServiceImpl implements UserService {
    //注入userdao
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("执行stuServiceImpl");
        userDao.save();
    }
}
