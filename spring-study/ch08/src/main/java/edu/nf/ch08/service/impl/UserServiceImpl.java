package edu.nf.ch08.service.impl;

import edu.nf.ch08.dao.UserDao;
import edu.nf.ch08.entity.Users;
import edu.nf.ch08.service.UserService;

import java.util.List;

/**
 * @author 天文学
 * @date 2020/12/2
 */
public class UserServiceImpl implements UserService {


    private UserDao daoproxy;

    //通过set方法注入usedao的实现类
    //注意：此时注入的就是mapperProxy代理对象
    public UserServiceImpl(UserDao daoproxy) {
        this.daoproxy = daoproxy;
    }

    @Override
     public List<Users> listUser() {
        return daoproxy.listUser();
    }
}
