package org.nf.mvc.view.impl;

import org.nf.mvc.view.View;

import java.io.IOException;

/**
 * @author 天文学
 */
public class RedirectView extends View {
    private String uri;

    /**
     *
     */
    public RedirectView(String uri) {
        this.uri=uri;
    }

    @Override
    public void response() {
        try {
            response.sendRedirect(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
