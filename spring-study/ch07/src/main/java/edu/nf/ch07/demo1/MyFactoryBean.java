package edu.nf.ch07.demo1;

import edu.nf.ch07.demo1.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 天文学
 * @date 2020/12/2
 * 自定义factoryBean ,用于创建自定义对象
 * 当spring容器会调用FactoryBean的getObject方法，将返回的对象
 * 自动纳入IOC容器中
 */
public class MyFactoryBean implements FactoryBean<UserService> {
    /**
     * 返回的是具体的某个实现类的bean
     * @return
     * @throws Exception
     */
    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }

    /**
     * 返回的是bean的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return UserServiceImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
