package org.nf.mvc.view.impl;

import org.nf.mvc.view.View;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 天文学
 */
public class ForwordView extends View {
    private String uri;

    /**
     * 构造方法
     * @param uri
     */
    public ForwordView(String uri) {
        this.uri=uri;
    }

    @Override
    public void response() {
        try {
            requst.getRequestDispatcher(uri).forward(requst,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
