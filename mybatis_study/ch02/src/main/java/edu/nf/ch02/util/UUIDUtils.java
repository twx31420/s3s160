package edu.nf.ch02.util;

import java.util.UUID;

/**
 * @author 天文学
 *  UUIDUtils工具类
 */
public class UUIDUtils {

    public static String crateUUID(){
        String uuid= UUID.randomUUID().toString();
        uuid=uuid.replace("-","");
        return uuid;
    }
}
