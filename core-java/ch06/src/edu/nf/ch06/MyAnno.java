package edu.nf.ch06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 天文学
 * 自定义注解
 * 1、指定这个自定义的注解可以标识在什么地方，比如类上，方法上
 * @Target元注解用于指定自定义的注解可以标识在什么位置
 * 通过ElementType属性来指定，FIELD,METHOD,TYPE等等
 *
 * 2、@Retention元注解用于指定这个自定义注解的有效范围，包括三个范围
 * 1）SOURCE:源代码中有效，编译后丢弃
 * 2）CLASS:在编译时有效（会保存到class字节码文件中），运行时丢弃
 * 3）RUNTIME:一直到运行时都保留这个注解
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE,ElementType.PARAMETER,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    /**
     * 在使用注解时，如果只是使用一个value属性时，这个value属性名可以省略，
     * 但如果同时指定了其他属性名，着必须指定value
     * @return
     */
    String value();
    /**
     * 给注解添加一些属性,default 用于指定默认值,
     * 这样当使用注解的时候，如果没有指定name属性
     * 那么name就会有一个默认值为MyAnno.
     * 如果不指定默认值，那么在使用注解值时就必须指定name属性
     * 如果既定了默认值，又配置了name属性，那么name的值就会覆盖
     * @return
     */
    String name() default "MyAnno";

}
