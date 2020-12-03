package org.nf.mvc.param;

import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public interface ParamsResolver {
    /**
     *
     */
    Object process(Parameter param);
}
