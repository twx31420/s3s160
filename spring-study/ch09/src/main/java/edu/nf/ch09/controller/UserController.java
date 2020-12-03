package edu.nf.ch09.controller;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author 天文学
 * @date 2020/12/3
 */
//使用主句标识类，表示为容器受管的类
    //value属性用于指定bean的id，如果不指定，默认就是类名
    //将首字母表为小写作为id
//@Component("controller")
//从3.0开始，每个成员都有对应的注解来标识，作用和
//Component注解时一样的，这样标识起来更加的明确
@Controller("controller")
//@Scope注解用于指定bean的作用域，作用和xml中的一致
@Scope
public class UserController {

//    //字段注入
//    @Autowired
//    //通过@Qualifier指定bean的id
//    @Qualifier("userService")
    //也可以使用@Resource注解来注入，它是javax包下提供的注解
    //spring可以支持此注解，name指定哟啊注入的bean的id
    //但这个注解只能标注在字段以及set方法上，不能标注在构造方法上
    @Resource(name = "stuService")
    private UserService service;

   /* public UserController() {
    }*/

    //构造方法注入
//    @Autowired
//    public UserController(UserService service) {
//        this.service = service;
//    }

    //注入service对象
    //@Autowired注解用于王朝注解配置，
    //可以可以标识在set方法上，构造方法上，字段上
    //注意：当注入的实现类只有一个的时候，spring
    //会自动找到它并直接注入进来
    //如果有多个实现类的时候，就必须结合
    // @Qualifier注解一起使用，注入注解的作用是
    //指定要注入哪一个实现类
//    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }


    public void add(){
        service.add();
    }
    //@PostConstruct注解标识自定义初始化方法
    @PostConstruct
    public void init(){
        System.out.println("执行自定义的init方法");
    }

    //@PreDestroy注解标识之只能给自定义的销毁方法
    @PreDestroy
    public void destory(){
        System.out.println("执行自定义的destroy方法");
    }
}
