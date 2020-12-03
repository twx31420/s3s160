package edu.nf.ch02;

public class PhpTeacher extends Teacher{
    @Override //重写  覆盖
    public void say(){//返回类型相同或更宽
        System.out.println(" Hello PhpTeacher");
    }
}
