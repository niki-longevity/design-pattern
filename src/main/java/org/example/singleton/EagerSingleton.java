package org.example.singleton;

// 饿汉式，线程安全，但占内存，没使用也会加载。一般用这个
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {}
    public static EagerSingleton getInstance() {
        return instance;
    }
}
