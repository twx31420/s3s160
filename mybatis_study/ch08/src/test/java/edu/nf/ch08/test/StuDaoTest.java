package edu.nf.ch08.test;

import edu.nf.ch08.dao.StuDao;
import edu.nf.ch08.dao.impl.StuDaoImpl;
import edu.nf.ch08.entity.Student;
import org.junit.Test;

public class StuDaoTest {
    @Test
    public void testGetStudentById(){
        StuDao dao=new StuDaoImpl();
        Student s=dao.getStudentById(1);
        System.out.println(s.getStuName());
        System.out.println(s.getStuAge());
        System.out.println(s.getIdCard().getCardNum());
        System.out.println(s.getClassInfo().getClassName());
    }
    @Test
    public void testGetStudentById2(){
        StuDao dao=new StuDaoImpl();
        Student s=dao.getStudentById2(1);
        System.out.println(s.getStuName());
        s.getSubjects().forEach(sub -> System.out.println(sub.getSubName()));
    }
}
