package org.nf.mvc.view;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @author 天文学
 */
public class RedirctView extends View {
    private String url;
    public RedirctView() {
    }

    public RedirctView(String url) {
        this.url = url;
    }

    @Override
    public void response() throws IOException, ServletException {
        response.sendRedirect(url);
    }
}
