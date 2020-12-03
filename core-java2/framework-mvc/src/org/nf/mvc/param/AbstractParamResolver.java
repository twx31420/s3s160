package org.nf.mvc.param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 天文学
 */
public abstract class AbstractParamResolver implements ParamsResolver {
    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }


    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }
}
