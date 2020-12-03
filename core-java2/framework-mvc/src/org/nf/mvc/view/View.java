package org.nf.mvc.view;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 天文学
 */
public abstract class View {
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public abstract void response()throws IOException, ServletException;
}
