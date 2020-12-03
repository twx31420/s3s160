package edu.nf.hw06.service;

import edu.nf.hw06.dao.UserDao;
import edu.nf.hw06.dao.impl.UserDaoImpl;
import edu.nf.hw06.entity.Users;

import java.util.List;

/**
 * @author 天文学
 */
public class UserService {
    public List<Users> usersList(Users users){
        UserDao dao=new UserDaoImpl();
        return dao.listuser(users);
    }
}
