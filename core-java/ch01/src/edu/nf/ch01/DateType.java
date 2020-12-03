package edu.nf.ch01;

public class DateType {
    public static void main(String[] args) {
        //基本数据类型
        byte b=1;//对应的包装类型是Byte
        short s=10;//对应的包装类型是Short
        int i=100;//对应的包装类型是Integer
        long l=100L;//对应的包装类型是Long
        float f=3.14f;//对应的包装类型是Float
        double d=3.1415926;//对应的包装类型是Double
        char c='a';//对应的包装类型是Character
        boolean bl=true;//对应的包装类型是Boolean
        //引用数据类型
        String str=new String("");
        String str2="abc";
        //包装类型（也属于引用数据类型）
        Byte b2=new Byte((byte) 10);
        Byte b3=new Byte("10");
        Byte b1=10;
        Byte by=Byte.valueOf("10");
        Byte by2=Byte.parseByte("10");

        Object o=null;
        String ss="aaa";
        //自然装换（子类类型直接赋值给父类）
        o=ss;
        //强制转换（父类类型赋值个子类）
        String sss=(String)o;
        //在没有继承前提下的转换，不能进行强转，
        //必须通过相关的API方法进行转换
        int aa=Integer.parseInt("10");

    }
}
