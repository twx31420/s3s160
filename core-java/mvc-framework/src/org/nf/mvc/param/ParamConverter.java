package org.nf.mvc.param;

import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public interface ParamConverter {
    Object convert(Parameter param);
}
