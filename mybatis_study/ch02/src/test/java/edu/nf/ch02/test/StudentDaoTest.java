package edu.nf.ch02.test;

import edu.nf.ch02.dao.StudentDao;
import edu.nf.ch02.dao.impl.StudentDaoImpl;
import edu.nf.ch02.entity.Student;
import edu.nf.ch02.util.UUIDUtils;
import org.junit.Test;

public class StudentDaoTest {
    @Test
    public void testSave(){
        Student stu=new Student();
        stu.setStuName("user1");
        StudentDao dao=new StudentDaoImpl();
        dao.save(stu);
    }
    @Test
    public void testSave2(){
        Student stu=new Student();
        //在程序中生成uuid
        stu.setStuId(UUIDUtils.crateUUID());
        stu.setStuName("user3");
        StudentDao dao=new StudentDaoImpl();
        dao.save2(stu);
    }

}
