package edu.nf.ch07;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author 天文学
 */
public class TestCollection {
    /**
     * Arraylist是基于数组的结构实现的
     */
    public  void TestArrayList(){
        ArrayList<String> list=new ArrayList<>();
        //添加元素,允许重复的元素
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("python");
        list.add("hello");
        //根据下标取出指定元素
        String str=list.get(1);
        System.out.println("__________");
        //遍历集合
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("______________________________");
        //替换指定下标的元素
        list.set(4,"wowo");
        System.out.println(list.get(4));
        System.out.println("__________________________________");
        //删除元素
        list.remove(4);
        System.out.println("集合大小："+list.size());
        //判断某个元素是否存在集合中
        boolean bl=list.contains("hello");
        System.out.println("____________________________");
        //获取元素的小标值
        int index =list.indexOf("hello");
        System.out.println("元素小标："+index);
        list.forEach(s -> System.out.println(s));
    }

    /**
     * LinkedList集合是基于链表的数据结构实现的
     */
    public void testLinkedList(){
        LinkedList<String> list=new LinkedList<>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("php");
        //根据下标获取元素
        list.get(0);
        list.set(0,"good");
        list.remove(0);
        //...与Arraylist类似，有实现list接口中的方法

        //linkedlist独有的api方法。可以在集合的头尾来操作元素
        //从头部添加元素
        list.addFirst("hello");
        //从尾部添加元素
        list.addLast("python");
        list.removeFirst();
        list.removeLast();
        //判断集合是否为空
        list.isEmpty();
    }

    /**
     * Hashset是基于散列的数据结构
     * Hashset是无下标，无序，不可重复的一种集合
     */
    public void testHashSet(){
        HashSet<String> set=new HashSet<>();
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("php");
        set.add("hello");
        //遍历循环
        set.forEach(s -> System.out.println(s));
        System.out.println("______________");
        //判断集合是否为空
        System.out.println(set.isEmpty());
        //判断set集合是否包含元素
        System.out.println(set.contains("hello"));
    }

    public void testHashset2(){
        HashSet<Users> set =new HashSet<>();
        Users u1=new Users("李四",21);
        Users u2=new Users("李四",21);
        set.add(u1);
        set.add(u2);
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        TestCollection test=new TestCollection();
        //test.TestArrayList();
        //test.testHashSet();
        test.testHashset2();
    }
}
