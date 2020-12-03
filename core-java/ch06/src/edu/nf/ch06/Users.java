package edu.nf.ch06;

/**
 * @author 天文学
 */
@MyAnno("abc")
public class Users {
    @MyAnno("构造方法")
    public Users(){

    }

    public Users(String name){
        System.out.println(name);
    }

    @MyAnno("name")
    private String name;
    @MyAnno("")
    public void say(@MyAnno("param")String name){
        System.out.println("Hello world");
    }

}
