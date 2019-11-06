package com.baizhi.DAO;

import com.baizhi.Entity.User;

public class UserDaoImpl implements UserDao {
    @Override
    public void register(User user) {
        System.out.println("我是UserDao实现类中的方法");
    }
}
