package org.example.singleton;

// 线程安全的懒汉式：方法锁，影响获取效率
public class SafeThreadLazySingleton {
    private static SafeThreadLazySingleton instance;
    private SafeThreadLazySingleton() {}
    public static synchronized SafeThreadLazySingleton getInstance() {
        if (instance == null) {
            instance = new SafeThreadLazySingleton();
        }
        return instance;
    }
}
