package edu.nf.containerfactory;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContainerFactory {


   //定义一个容器
   private static Map<String,Object> container=new HashMap<>();

   public ContainerFactory() {
      //执行类扫描
      Set<String> className=ScanUtils.scanPackage();
      //执行类解析，将带有注解的Class进行初始化
      resolveClass(className);
   }

   /**
    * 解析Class,找到@Bean 注解的类。并创建实例化保存到map集合
    * @param classesName
    */
   private void resolveClass(Set<String> classesName){
      classesName.forEach(className ->{
         try {
            //类加载
            Class<?> clazz=Class.forName(className);
            //解析注解
            if (clazz.isAnnotationPresent(Bean.class)){
               //获取注解的value属性的值，也就是别名
               String value=clazz.getAnnotation(Bean.class).value();
               //将别名作为key，class创建出来的实例作为value保存到map中
               container.put(value,clazz.newInstance());
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
      });
   }

   /**
    * 挺赶一个从容器中获取baen对象的方法
    * @param name 对应容器的key
    * @param <T>
    * @return
    */
   public <T> T getBean(String name){
      return (T)container.get(name);
   }
}
