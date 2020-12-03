package org.nf.mvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 天文学
 */
public abstract class View {
    protected HttpServletRequest requst;
    protected HttpServletResponse response;

    public void setRequst(HttpServletRequest requst) {
        this.requst = requst;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    //响应抽象的方法
    public abstract void response();
}
