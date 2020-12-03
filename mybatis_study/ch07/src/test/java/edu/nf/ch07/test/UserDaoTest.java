package edu.nf.ch07.test;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.dao.impl.UserDaoImpl;
import edu.nf.ch07.entity.Users;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {
    @Test
    public void testAddBatch(){
        List<Users> list =new ArrayList<>();
        Users user1=new Users("user6",21,"1384353694");
        Users user2=new Users("user7",23,"1564324234");
        list.add(user1);
        list.add(user2);
        UserDao dao =new UserDaoImpl();
        dao.addBatch(list);
    }
    @Test
    public void testDelBatch(){
        int [] ids={9,10};
        UserDao dao =new UserDaoImpl();
        dao.delBatch(ids);
    }
}
