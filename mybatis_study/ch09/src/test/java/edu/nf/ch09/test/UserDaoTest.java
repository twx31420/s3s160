package edu.nf.ch09.test;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.dao.impl.UserDaoImpl;
import edu.nf.ch09.entity.Users;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testGetUserById(){
        UserDao dao =new UserDaoImpl();
        Users user =dao.getUserById(1);
        System.out.println(user.getUid());
    }
    @Test
    public void testGetUserById2(){
        UserDao dao =new UserDaoImpl();
        Users user =dao.getUserById2(1);
        System.out.println(user.getUid());
        System.out.println(user.getUserName());
        System.out.println(user.getAge());
    }
    @Test
    public void testGetUserById3(){
        UserDao dao =new UserDaoImpl();
        Users user =dao.getUserById3(1);
        System.out.println(user.getUid());
        System.out.println(user.getUserName());
        System.out.println(user.getAge());
        System.out.println(user.getTel());
    }

    @Test
    public void testSave(){
        Users user=new Users();
        user.setUserName("user7");
        user.setAge(21);
        user.setTel("1587436374");
        UserDao dao =new UserDaoImpl();
        dao.update(user);
    }

    @Test
    public void testUpdate(){
        Users user=new Users();
        user.setUid(13);
        user.setUserName("user8");
        user.setAge(22);
        user.setTel("1587436374");
        UserDao dao =new UserDaoImpl();
        dao.update(user);
    }

    @Test
    public void testDelete(){

        UserDao dao =new UserDaoImpl();
        dao.delete(13);
    }

}
