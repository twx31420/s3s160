package edu.nf.dip;

import edu.nf.dip.impl.UserDaoImpl;

public class UserService {
    private UserDao userDao;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        userDao.save();
    }
}
