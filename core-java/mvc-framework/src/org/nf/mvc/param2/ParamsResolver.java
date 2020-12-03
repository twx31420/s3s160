package org.nf.mvc.param2;

import java.lang.reflect.Parameter;

/**
 * @author 天文学
 * 参数解析器，由于请求处理方法的参数
 * 是各种不同的数据类型，因此声明一个抽象的
 * 解析器接口，由不同的实现类解析器来完成不同类型
 * 的数据装换
 */
public interface ParamsResolver {
    /**
     * 参数解析接口
     * @param param
     * @return
     */
    Object process(Parameter param);
}
