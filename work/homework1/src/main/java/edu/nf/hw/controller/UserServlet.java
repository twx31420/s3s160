package edu.nf.hw.controller;

import com.google.gson.Gson;
import edu.nf.hw.entity.User;
import edu.nf.hw.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 天文学
 */
@WebServlet("/get")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service=new UserService();
        List<User>list=service.getList();
        resp.setContentType("application/json;charset=utf-8");
        String json=new Gson().toJson(list);
        resp.getWriter().println(json);
    }
}
