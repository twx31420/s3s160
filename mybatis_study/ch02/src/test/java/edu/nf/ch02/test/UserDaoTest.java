package edu.nf.ch02.test;

import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.dao.impl.UserDaoImpl;
import edu.nf.ch02.entity.Users;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testSave(){
        Users user=new Users();
        user.setUserName("lisi");
        UserDao dao=new UserDaoImpl();
        dao.save(user);
        System.out.println(user.getUid());
        System.out.println(user.getUserName());
    }
}
