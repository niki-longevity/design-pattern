package org.example.proxy.proxy;

import org.example.proxy.UserService;

// 静态代理：用户服务代理类
public class UserServiceStaticProxy implements UserService {
    // 持有真实业务对象
    private final UserService userService;
    public UserServiceStaticProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getUserById(Integer id) {
        // 前置增强：权限校验
        System.out.println("====== 权限校验 ======");

        // 调用真实业务方法
        String result = userService.getUserById(id);

        // 后置增强：日志记录
        System.out.println("====== 日志记录 ======");
        return result;
    }
}
