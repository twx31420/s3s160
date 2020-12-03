package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;

/**
 * @author 天文学
 * @date 2020/12/1
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(Users users) {
        System.out.println("insert into user_info ");
    }
}
