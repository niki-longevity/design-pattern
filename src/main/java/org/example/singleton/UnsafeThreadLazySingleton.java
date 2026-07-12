package org.example.singleton;

// 线程不安全的懒汉式
public class UnsafeThreadLazySingleton {
    private static UnsafeThreadLazySingleton instance;
    private UnsafeThreadLazySingleton() {}
    public static UnsafeThreadLazySingleton getInstance() {
        if (instance == null) {
            // 实例化时机：第一个线程获取时加载
            instance = new UnsafeThreadLazySingleton();
        }
        return instance;
    }
}
