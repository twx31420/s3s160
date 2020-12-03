package edu.nf.hw08.controller;

import edu.nf.hw08.service.CenterService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 天文学
 */
public class CenterServlet {
    @WebRequest("/page/list")
    public View getlist(){
        return new JsonView(new CenterService().getAll());
    }

    @WebRequest("/page/del")
    public void dels(HttpServletRequest req){
        String [] id=req.getParameterValues("ids");
        int [] ids=new int[id.length];
        for (int i=0;i<id.length;i++){
            ids[i]=Integer.parseInt(id[i]);
        }
        System.out.println(ids);
        new CenterService().dels(ids);
    }
    @WebRequest("/page/get")
    public View getStudent(){
        return new JsonView(new CenterService().getStudent(1));
    }
    @WebRequest("/page/get2")
    public View getStudent2(HttpServletRequest req){
        int uid=Integer.parseInt(req.getParameter("uid"));
        return new JsonView(new CenterService().getStudent2(uid));
    }

}
