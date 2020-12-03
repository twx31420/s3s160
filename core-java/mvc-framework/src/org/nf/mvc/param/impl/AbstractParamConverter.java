package org.nf.mvc.param.impl;


import org.nf.mvc.param.ParamConverter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 天文学
 */
public abstract class AbstractParamConverter implements ParamConverter {
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
}
