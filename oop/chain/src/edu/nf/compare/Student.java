package edu.nf.compare;

public class Student implements  Comparable{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 实现排序的比较逻辑
     * >返回1 ，==返回0 <返回-1
     * @param o 用于比较对象，也就是当前类的一个实例
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student s=(Student)o;
            //编写比较规则
            /*if(age>s.getAge()){
                return -1;
            }else if(age<s.getAge()){
                return 1;
            }else {
                return 0;
            }*/
            //由于integer已经实现了comparable接口
            //因此可以直接直接调interger的用comparato
            return age.compareTo(s.getAge());
        }else{
            //抛出一个类型转换异常
            throw new ClassCastException("类型转换失败");
        }
    }
}
