package edu.nf.test;

import edu.nf.hw08.dao.StuDao;
import edu.nf.hw08.dao.SubDao;
import edu.nf.hw08.dao.impl.StuDaoImpl;
import edu.nf.hw08.dao.impl.SubDaoImpl;
import org.junit.Test;

public class StuDaoTest {
    @Test
    public void testGetAll(){
        StuDao dao=new StuDaoImpl();
        dao.getAll().forEach(s -> System.out.println(s.getIdCard().getCardNum()));
    }
    @Test
    public void testStudent(){
        SubDao dao=new SubDaoImpl();
        dao.getStudentById(1).getSubjects().forEach(subject -> System.out.println());
    }
}
