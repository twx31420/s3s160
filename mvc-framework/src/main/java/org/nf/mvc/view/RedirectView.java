package org.nf.mvc.view;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author wangl
 * @date 2020/10/20
 * 重定向视图
 */
public class RedirectView extends View {

    private String url;

    public RedirectView(String url) {
        this.url = url;
    }

    @Override
    public void response() throws ServletException, IOException {
        response.sendRedirect(url);
    }
}
