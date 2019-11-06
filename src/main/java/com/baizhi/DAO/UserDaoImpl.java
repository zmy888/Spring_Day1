package com.baizhi.DAO;

import com.baizhi.Entity.User;

public class UserDaoImpl implements UserDao {
    
    //注册业务 参数为一个对象
    @Override
    public void register(User user) {
        System.out.println("我是UserDao实现类中的方法");
    }
}
