package com.hyfly.milet.shop.demo.service;

import com.hyfly.milet.shop.demo.service.model.UserModel;
import com.hyfly.milet.shop.demo.error.BusinessException;


public interface UserService {
    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;

    /*
    telphone:用户注册手机
    password:用户加密后的密码
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
