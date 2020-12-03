package edu.nf.compare;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompatorTest {
    public static void main(String[] args) {
        Users u1=new Users("user1",23);
        Users u2=new Users("uesr2",20);
        Users u3=new Users("user3",28);
        List<Users> list=new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //排序
        //匿名实现Comparator接口
        Collections.sort(list, new Comparator<Users>(){
            @Override
            public int compare(Users o1, Users o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        //使用lambda表达式
        Collections.sort(list,(o1,o2)-> o1.getAge().compareTo(o2.getAge()));
        list.forEach(u->{
            System.out.println(u.getAge());
        });

    }
}
