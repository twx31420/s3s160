package org.nf.mvc.core;

import java.lang.reflect.Method;

/**
 * @author 天文学
 */
public class ClassInfo {
    private Class<?> clazz;
    private Method method;

    public ClassInfo() {
    }

    public ClassInfo(Class<?> clazz, Method method) {
        this.clazz = clazz;
        this.method = method;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
