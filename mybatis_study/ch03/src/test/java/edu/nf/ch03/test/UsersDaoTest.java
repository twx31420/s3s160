package edu.nf.ch03.test;

import edu.nf.ch03.dao.UserDao;
import edu.nf.ch03.dao.impl.UserDaoImpl;
import edu.nf.ch03.entity.Users;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class UsersDaoTest {
    @Test
    public void testGetUserById(){
        UserDao dao=new UserDaoImpl();
        Users user= dao.getUserByid(2);
        System.out.println(user.getUid()+user.getUserName());
    }
    @Test
    public void testGetUserById2(){
        UserDao dao=new UserDaoImpl();
        Map<String,Object> map= dao.getUserById2(2);
        map.forEach((k,v) -> System.out.println(k+" : "+v));
    }
    @Test
    public void testListUser(){
        UserDao dao=new UserDaoImpl();
        List<Users> list= dao.listUser();
        list.forEach(user -> System.out.println(user.getUid()+" : "+user.getUserName()));
    }
    @Test
    public void testListUser2(){
        UserDao dao=new UserDaoImpl();
        List<Map<String,Object>> list= dao.listUser2();
        list.forEach(map -> map.forEach((k,v)-> System.out.println(k+" : " +v)));
    }
    @Test
    public void testCount(){
        UserDao dao=new UserDaoImpl();
        int  count= dao.count();
        System.out.println(count);
    }
}
