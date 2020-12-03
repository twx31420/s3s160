package edu.nf.ch01.test;

import edu.nf.ch01.dao.UserDao;
import edu.nf.ch01.dao.impl.UserDaoImpl;
import edu.nf.ch01.entity.Users;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void testSave(){
        Users users=new Users();
        users.setUserName("张三");
        UserDao dao=new UserDaoImpl();
        dao.save(users);
    }
    @Test
    public void testUpdate(){
        Users user=new Users();
        user.setUid(2);
        user.setUserName("wangl");
        UserDao dao=new UserDaoImpl();
        dao.update(user);
    }
    @Test
    public void testDelete(){
        UserDao dao=new UserDaoImpl();
        dao.delete(1);
    }
    @Test
    public void testUpdate2(){
        UserDao dao=new UserDaoImpl();
        dao.update2("user",2);
    }
    @Test
    public void testSave2(){
        Map<String,Object> map=new HashMap<>();
        //key对应映射配置文件中的#{uname}
        map.put("uname","zhangsan");
        UserDao dao=new UserDaoImpl();
        dao.save2(map);
    }
}
