package edu.nf.ch08.factorybean;

import edu.nf.ch08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 天文学
 * @date 2020/12/2
 * 通过自定义FactoryBean来创建mybatis的mapper接口的代理对象
 * 这里的T表示任意dao接口的类型
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
    /**
     * 由于jdk动态代理对象时需要传入一个接口
     * 而这个接口可以通过set方法注入进来
     */
    private Class<T> daoInterface;

    /**
     * 提供一个set方法注入一个dao的接口的class对象
     * @param daoInterface
     */
    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    /**
     * 当Ioc容器调用getObject方法是，返回的是sqlsession的getMapper的
     * 代理对象。这个代理对象就可以纳入容器中管理
     * @return
     * @throws Exception
     */
    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        //daoInterface就是某个dao接口的class对象
        T mapperProxy=sqlSession.getMapper(daoInterface);
        return mapperProxy;
    }

    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
