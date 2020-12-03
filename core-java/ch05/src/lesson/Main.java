package lesson;

/**
 * @author 天文学
 */
public class Main {
    public static void main(String[] args)throws Exception {
        Class<?> c1=Student.class;
        Class<?>c2=Class.forName("lesson.Student");
        Student s=new Student();
        Class<?>c3=s.getClass();
        System.out.println(c1==c2);
    }
}
