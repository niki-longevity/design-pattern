package org.example.proxy.impl;

import org.example.proxy.UserService;

// 真实主题：用户服务实现
public class UserServiceImpl implements UserService {
    @Override
    public String getUserById(Integer id) {
        System.out.println("查询用户 ID：" + id);
        return "用户" +  id + "：张三";
    }
}
