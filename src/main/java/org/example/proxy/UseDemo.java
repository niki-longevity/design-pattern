package org.example.proxy;

import org.example.proxy.impl.UserServiceImpl;
import org.example.proxy.proxy.CglibLogProxy;
import org.example.proxy.proxy.JdkLogProxy;
import org.example.proxy.proxy.UserServiceStaticProxy;

public class UseDemo {
    public static void main(String[] args) {
        // 创建真实对象
        UserService userService = new UserServiceImpl();

        // 静态代理
        UserService proxy = new UserServiceStaticProxy(userService);    // 包装为代理对象
        String user = proxy.getUserById(1001);                          // 通过代理对象调用方法

        // 动态代理
        // JDK 动态代理（基于接口）
        // 创建代理对象
        JdkLogProxy proxyHandler = new JdkLogProxy(userService);
        UserService proxy1 = proxyHandler.getProxy();
        // 调用方法
        String user1 = proxy1.getUserById(1001);

        // CGLIB 动态代理（基于继承）
        // 创建代理对象
        CglibLogProxy cglibLogProxy = new CglibLogProxy(userService);
        UserService proxy2 = (UserService) cglibLogProxy.getProxy();
        // 调用方法
        String user2 = proxy2.getUserById(1001);
    }
}
