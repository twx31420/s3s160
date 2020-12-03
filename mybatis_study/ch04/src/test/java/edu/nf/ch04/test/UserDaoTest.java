package edu.nf.ch04.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import edu.nf.ch04.dao.UserDao;
import edu.nf.ch04.dao.impl.UserDaoImpl;
import edu.nf.ch04.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void testGetUserById(){
        UserDao dao=new UserDaoImpl();
        Users user=dao.getUserById(2);
        System.out.println(user.getUid()+" ; "+user.getUserName());
    }
    @Test
    public void testListUser(){
        UserDao dao=new UserDaoImpl();
        List<Users> list =dao.listUser();
        list.forEach(users -> System.out.println(users.getUid()+" ; "+users.getUserName()));
        list.forEach(System.out::println);
    }
    @Test
    public void testCount(){
        UserDao dao=new UserDaoImpl();
        System.out.println(dao.count());
    }
    @Test
    public void testlike(){
        UserDao dao=new UserDaoImpl();
        List<Users> list =dao.like("w");
        list.forEach(users -> System.out.println(users.getUserName()));

    }

}
