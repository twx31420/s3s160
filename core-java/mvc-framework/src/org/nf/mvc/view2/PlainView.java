package org.nf.mvc.view2;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author 天文学
 * 文本视图，原样输出
 */
public class PlainView extends View{
    private String content;

    public PlainView(String content) {
        this.content = content;
    }

    @Override
    public void response() throws ServletException, IOException {
        response.setContentType("text/plain;charset=utf-8");
        response.getWriter().println(content);
    }
}
