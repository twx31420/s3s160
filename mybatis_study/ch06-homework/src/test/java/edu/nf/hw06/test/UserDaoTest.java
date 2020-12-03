package edu.nf.hw06.test;

import edu.nf.hw06.dao.UserDao;
import edu.nf.hw06.dao.impl.UserDaoImpl;
import edu.nf.hw06.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void testListUser(){
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listuser(new Users());
        list.forEach(users -> System.out.println(users.getUserName()));
    }
}
