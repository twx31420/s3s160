package org.nf.mvc.param;

import org.nf.mvc.util.ConvertUtils;

import java.lang.reflect.Parameter;

/**
 * @author wangl
 * @date 2020/10/19
 * 基础类型转换解析器
 */
public class BasicParamResolver extends AbstractParamResolver {

    /**
     *
     * @param param 请求处理方法的参数，
     *              用于获取参数类型和参数名
     * @return
     */
    @Override
    public Object process(Parameter param) {
        //参数类型
        Class<?> paramType = param.getType();
        //参数名
        String paramName = param.getName();
        //获取请求的字符串数据
        String requestParam = request.getParameter(paramName);
        //进行类型转换
        try {
            Object value = ConvertUtils.convert(requestParam, paramType);
            //返回转换后的值
            return value;
        } catch (Exception e) {
            //如果是不支持的类型，则会引发异常
            //返回空，让下一个转换器继续处理
            return null;
        }
    }
}
