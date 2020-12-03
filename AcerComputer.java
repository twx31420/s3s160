package edu.nf.ch01;

public class AcerComputer {
    //属性
    private  String size;
    private  String color;
    private  String cpu;
    private  String memory;

    //行为方法
    public void play(){
        System.out.println("playing……");
    }
    public void  work(){
        System.out.println("working……");
    }
    //main方法是一个特殊的行为方法，表示程序的入口方法
    public static void main(String[] args) throws Exception{
        //方式一：创建类的对象,
//        AcerComputer acer1=new AcerComputer();
//        AcerComputer acer2=new AcerComputer();
        //方式二：手动加载class 来创建实例
        //Class.forName()方法使用与类加载
        //newInstance方法用于创建该class的实例对象
        //返回的是一个Object对象
        Object o1=Class.forName("edu.nf.ch01.AcerComputer").newInstance();
        //进行强制转换
        AcerComputer acer1=(AcerComputer)o1;
        AcerComputer acer2=(AcerComputer)o1;
        acer1.play();
        acer2.work();
    }
}
