package edu.nf.hw06.controller;

import edu.nf.hw06.entity.Users;
import edu.nf.hw06.service.UserService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.View;

import java.util.List;

/**
 * @author 天文学
 */
public class UserServlet {

    @WebRequest("/list")
    public View userList(Users user){
        return new JsonView(new UserService().usersList(user));
    }

}
