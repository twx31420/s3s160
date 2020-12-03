package edu.nf.ch06.test;

import edu.nf.ch06.dao.UserDao;
import edu.nf.ch06.dao.impl.UserDaoImpl;
import edu.nf.ch06.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void testListUser(){
        //创建Users实例，分装页面提交的参数
        Users users=new Users();
        users.setAge(21);
        users.setUserName("user1");
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listUser(users);
        list.forEach(u -> System.out.println(u.getUserName()));
    }
    @Test
    public void testListUser2(){
        //创建Users实例，分装页面提交的参数
        Users users=new Users();
        users.setAge(21);
        users.setUserName("user1");
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listUser(users);
        list.forEach(u -> System.out.println(u.getUserName()));
    }
    @Test
    public void testListUser3(){
        //创建Users实例，分装页面提交的参数
        Integer [] uids={1,2,3};
        UserDao dao=new UserDaoImpl();
        List<Users> list=dao.listUser3(uids);
        list.forEach(u -> System.out.println(u.getUserName()));
    }
    @Test
    public void testUpdate(){
        Users user=new Users();
        user.setUid(1);
        user.setAge(21);
        user.setTel("123456778");
        UserDao dao=new UserDaoImpl();
        dao.update(user);
    }
}
