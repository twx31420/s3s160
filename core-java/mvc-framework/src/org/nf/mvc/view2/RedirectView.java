package org.nf.mvc.view2;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author 天文学
 * 重定向视图
 */
public class RedirectView extends View{
    private String url;

    public RedirectView(String url) {
        this.url = url;
    }

    @Override
    public void response() throws ServletException, IOException {
        response.sendRedirect(url);
    }
}
