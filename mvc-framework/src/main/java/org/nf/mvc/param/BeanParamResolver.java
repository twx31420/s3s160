package org.nf.mvc.param;

import org.nf.mvc.util.ConvertUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

/**
 * @author wangl
 * @date 2020/10/19
 * 实体对象参数解析器
 */
public class BeanParamResolver extends AbstractParamResolver {

    @Override
    public Object process(Parameter param) {
        try {
            //获取参数类型
            Class<?> paramType = param.getType();
            //创建当前参数对象的实例
            Object obj = paramType.newInstance();
            //获取参数的所有私有字段
            Field[] fields = paramType.getDeclaredFields();
            for(Field field : fields){
                //打开访问开关
                field.setAccessible(true);
                //获取字段的类型
                Class<?> fieldType = field.getType();
                //字段名
                String fieldName = field.getName();
                //根据字段名与请求参数的name匹配,获取请求参数的值
                String requestParam = request.getParameter(fieldName);
                if(requestParam != null && !"".equals(requestParam)){
                    //进行转换
                    Object value = ConvertUtils.convert(requestParam, fieldType);
                    //将value赋值给字段
                    field.set(obj, value);
                }
            }
            //返回实例
            return obj;
        } catch (Exception e) {
            return null;
        }
    }
}
