package edu.nf.demo;

/**
 * @author 天文学
 * 赖
 */
public class Student {
    private static Student instance;
    private static String key="key";
    private Student(){

    }

    /**
     * 懒汉的
     * @return
     */
    public static Student getInstance(){
        if(instance==null){
            synchronized (key){
                if(instance==null){
                    instance=new Student();
                }
            }

        }
        return instance;
    }
    public void say(){
        System.out.println("say");
    }

}
