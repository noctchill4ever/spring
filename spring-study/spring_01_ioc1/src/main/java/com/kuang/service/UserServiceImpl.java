package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao=new UserDaoImpl();
    //使用set动态实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUser(){
        userDao.getUser();
    }
}
