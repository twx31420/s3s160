package edu.nf.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 天文学
 */
public class ComparableTest {
    public static void main(String[] args) {
        Student s1=new Student("user1",23);
        Student s2=new Student("user2",26);
        Student s3=new Student("user3",20);
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);
        list.forEach(s->{
            System.out.println(s.getAge());
        });

    }
}
