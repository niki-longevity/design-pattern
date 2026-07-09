package org.example.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// JDK 动态代理
public class JdkLogProxy implements InvocationHandler {
    // 持有真实目标对象
    private final Object target;
    public JdkLogProxy(Object target) {
        this.target = target;
    }

    /*
    *  所有代理方法的调用都会进入此方法
    *  proxy：生成的代理对象
    *  method：被代理的方法
    *  args：方法参数
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 前置增强：日志记录
        System.out.println("====== 日志记录 ======");
        System.out.println("方法执行：" + method.getName());
        long start = System.currentTimeMillis();

        // 调用真实业务方法
        Object result = method.invoke(target, args);

        // 后置增强：日志记录
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start));
        return result;
    }

    //生成代理对象的工具方法
    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) java.lang.reflect.Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 类加载器
                target.getClass().getInterfaces(),  // 目标对象实现的所有接口
                this                                // 代理对象逻辑(调用处理器)
        );
    }
}
