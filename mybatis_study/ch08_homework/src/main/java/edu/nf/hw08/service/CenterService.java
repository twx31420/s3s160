package edu.nf.hw08.service;

import edu.nf.hw08.dao.StuSubDao;
import edu.nf.hw08.dao.impl.CardDaoImpl;
import edu.nf.hw08.dao.impl.StuDaoImpl;
import edu.nf.hw08.dao.impl.StuSubDaoImpl;
import edu.nf.hw08.dao.impl.SubDaoImpl;
import edu.nf.hw08.entity.Student;
import edu.nf.hw08.entity.Subject;

import java.util.List;

/**
 * @author 天文学
 */
public class CenterService {

    public List<Student> getAll(){
        return new StuDaoImpl().getAll();
    }
    public void dels(int[] ids){
        new StuSubDaoImpl().dels(ids);
        new CardDaoImpl().dels(ids);
        new StuDaoImpl().dels(ids);
    }

    public Student getStudent(int uid){
        return new SubDaoImpl().getStudentById(uid);
    }


    public List<Subject> getStudent2(int uid){
        return new SubDaoImpl().getStudentById2(uid);
    }
}
