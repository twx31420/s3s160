package org.nf.mvc.util;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author 天文学
 */
public class DisReq {
    public  void convert(HttpServletRequest req)throws Exception{
       Map<String,String[]> map=req.getParameterMap();
       Field field=Object.class.getField("id");


    }
}
