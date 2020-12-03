package edu.nf.test.controller;

import edu.nf.test.entity.Student;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.View;
import org.nf.mvc.view.impl.ForwordView;
import org.nf.mvc.view.impl.JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 天文学
 */

public class UserService {
    @WebRequest("/get")
    public View get(Student student)throws Exception{
//        return new ForwordView("/add");
//        return new RedirectView("/del");
        return new JsonView(student);
    }
    @WebRequest("/add")
    public View add(Student student){
        System.out.println("add");
        System.out.println("name:"+student.getName()+"\nsex:"+student.getSex()+"\nage:"+student.getAge());
        return new ForwordView("success.html");
    }
    @WebRequest("/del")
    public void del(HttpServletRequest request, HttpServletResponse response){
        System.out.println("del");
    }

}
