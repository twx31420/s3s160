package edu.nf.demo5;

import org.evergreen.aop.annotation.Interceptors;
//标注在类上会代理所有的方法
@Interceptors(StuInterceptor.class)
public class StuService {
    //标注在方法上之会代理当前的方法
    @Interceptors(StuInterceptor.class)
    public void add(){
        System.out.println("添加学生");
    }
    public void update(){
        System.out.println("更新学生");
    }
}
