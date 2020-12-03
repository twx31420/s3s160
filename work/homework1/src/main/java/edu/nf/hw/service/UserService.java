package edu.nf.hw.service;

import edu.nf.hw.dao.UsersDao;
import edu.nf.hw.entity.User;

import java.util.List;

/**
 * @author 天文学
 */
public class UserService {
    public List<User> getList(){
        UsersDao dao=new UsersDao();
        return dao.getList();
    }
}
