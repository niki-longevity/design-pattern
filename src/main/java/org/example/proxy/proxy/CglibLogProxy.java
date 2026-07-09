package org.example.proxy.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// Cglib 动态代理
public class CglibLogProxy implements MethodInterceptor {
    // 持有真实业务对象
    private final Object target;
    public CglibLogProxy(Object target) {
        this.target = target;
    }

    /*
     *  所有代理方法的调用都会进入此方法
     *  proxy：生成的代理对象
     *  method：被代理的方法
     *  args：方法参数
     * */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        // 前置增强：日志记录
        System.out.println("====== 日志记录 ======");
        System.out.println("方法执行：" + method.getName());
        long start = System.currentTimeMillis();

        // 调用真实业务方法
        Object result = proxy.invokeSuper(obj, args);

        // 后置增强：日志记录
        System.out.println("方法耗时：" + (System.currentTimeMillis() - start));
        return result;
    }

    // 生成代理对象的工具方法
    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());  // 设置父类为目标类
        enhancer.setCallback(this);                 // 设置方法拦截器（回调）
        return (T) enhancer.create();               // 创建并返回代理对象
    }
}
