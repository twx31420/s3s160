package edu.nf.ch01.factory;

import edu.nf.ch01.Users;

/**
 * @author 天文学
 * @date 2020/11/30
 *
 *
 * 使用工厂的静态方法来创建bean实例
 *
 *
 */
public class UsersFactory {

    public static Users create(){
        return new Users();
    }

}
