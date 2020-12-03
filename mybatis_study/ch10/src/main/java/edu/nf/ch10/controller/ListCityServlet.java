package edu.nf.ch10.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import edu.nf.ch10.entity.City;
import edu.nf.ch10.service.CityService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 天文学
 */

public class ListCityServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNum=Integer.valueOf(req.getParameter("pageNum"));
        Integer pageSize=Integer.valueOf(req.getParameter("pageSize"));
        System.out.println(pageNum);
        //创建业务层对象
        CityService service=new CityService();
        //查询并返回pageInfo对象
        PageInfo<City> pageInfo=service.listCity(pageNum,pageSize);
        //将pageInfo对象序列化为json字符串
        String json =new Gson().toJson(pageInfo);
        //将json响应客户端
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
