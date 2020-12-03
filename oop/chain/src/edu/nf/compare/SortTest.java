package edu.nf.compare;

import edu.nf.demo2.Filter;
import edu.nf.demo2.FilterA;
import edu.nf.demo2.FilterB;
import edu.nf.demo2.FilterC;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(6);
        list.forEach(i->{
            System.out.println(i);
        });
        System.out.println("________________________________");
        Collections.sort(list);
        list.forEach(i->{
            System.out.println(i);
        });
        System.out.println("+++++++++++++++++++++++++++++++");
        List<Filter>filters=new ArrayList<>();
        filters.add(new FilterB());
        filters.add(new FilterA());
        filters.add(new FilterC());
        Collections.sort(list);
        filters.forEach(f->{
            System.out.println(f);
        });
    }
}
