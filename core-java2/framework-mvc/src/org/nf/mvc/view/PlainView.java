package org.nf.mvc.view;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author 天文学
 */
public class PlainView extends View {
    private String content;

    public PlainView() {
    }

    public PlainView(String content) {
        this.content = content;
    }

    @Override
    public void response() throws IOException, ServletException {
        response.setContentType("text/plain;charset=utf-8");
        response.getWriter().println(content);
    }
}
