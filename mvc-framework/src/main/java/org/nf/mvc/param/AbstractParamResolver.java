package org.nf.mvc.param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

/**
 * @author wangl
 * @date 2020/10/19
 * 抽象的参数解析器
 * 封装请求和响应对象，让子类继承
 * 并继承接口的抽象方法，让不同子类去实现
 */
public abstract class AbstractParamResolver {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public abstract Object process(Parameter param);

}
