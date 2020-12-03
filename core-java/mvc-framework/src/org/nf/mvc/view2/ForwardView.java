package org.nf.mvc.view2;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author 天文学
 * 转发视图
 */
public class ForwardView extends View {
    private  String url;

    public ForwardView(String url) {
        this.url = url;
    }

    @Override
    public void response() throws ServletException, IOException {
        request.getRequestDispatcher(url).forward(request,response);
    }
}
