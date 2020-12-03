package edu.nf.supperfactory;

public class ObjectFactory {

    public static <T> T build(String className){
        Object instance=null;
        try {
            Class<?> clazz= Class.forName(className);
            instance=clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)instance;
    }
}
