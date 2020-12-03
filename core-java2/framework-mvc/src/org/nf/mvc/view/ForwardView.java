package org.nf.mvc.view;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author 天文学
 */
public class ForwardView extends View {
    private String url;
    public ForwardView() {
    }

    public ForwardView(String url) {
        this.url = url;
    }

    @Override
    public void response() throws IOException, ServletException {
        request.getRequestDispatcher(url).forward(request,response);
    }
}
