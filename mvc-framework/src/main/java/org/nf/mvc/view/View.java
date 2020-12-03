package org.nf.mvc.view;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangl
 * @date 2020/10/20
 * 抽象视图
 * 对应的子类实现可能有转发视图、重定向视图
 * 或者是JSON字符串
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

    public abstract void response() throws ServletException, IOException;
}
