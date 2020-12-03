package edu.nf.ch05.homework;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 天文学
 */
public class Test {
    public static void main(String[] args)throws Exception{
        Map<String,Object> map=new HashMap<>();
        map.put("id",1001);
        map.put("stuName","user1");
        map.put("age",23);

        //编写一个BeanUtils的工具类，将map集合数据自动转换成实体类型
        Students stu=(Students)BeanUtils.convert(map,Students.class);
        System.out.println(stu.getId());
        System.out.println(stu.getStuName());
        System.out.println(stu.getAge());
        Map<String,Object> map2=BeanUtils.convertMap(stu);
        System.out.println(map2.get("id"));

        //
        System.out.println("______________________________________________");
        Students stu2=new Students();
        stu2=(Students) BeanUtils.copy1(stu2,stu);
        System.out.println(stu2.getId());
        System.out.println(stu2.getStuName());
        System.out.println(stu2.getAge());
    }
}
