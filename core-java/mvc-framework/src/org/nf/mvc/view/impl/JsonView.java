package org.nf.mvc.view.impl;

import com.google.gson.Gson;
import org.nf.mvc.view.View;

import java.io.IOException;

/**
 * @author 天文学
 */
public class JsonView extends View {
    private Object bean;
    public JsonView(Object bean){
        this.bean=bean;
    }
    @Override
    public void response() {
        String json=new Gson().toJson(bean);
        response.setContentType("application/json;charset=utf-8");
        try {
            response.getWriter().println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
