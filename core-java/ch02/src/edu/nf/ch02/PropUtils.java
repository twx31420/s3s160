package edu.nf.ch02;

import java.io.IOException;
import java.util.Properties;

public class PropUtils {

    public static  String getProperty(String key){
       
        Properties prop=new Properties();
        //加载properties资源文件
        try {
            prop.load(Main.class.getClassLoader().getResourceAsStream(key));
            //根据key取出value
            String className = prop.getProperty("name");
            return className;
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("解析异常",e);
        }
    }
}
