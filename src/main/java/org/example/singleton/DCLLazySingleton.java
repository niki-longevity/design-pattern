package org.example.singleton;

// 线程安全的懒汉式：高性能，volatile 防止指令重排序，确保对象初始化完全
public class DCLLazySingleton {
    private static volatile DCLLazySingleton instance;
    private DCLLazySingleton() {}
    public static DCLLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DCLLazySingleton.class) {
                if (instance == null) {
                    instance = new DCLLazySingleton();
                }
            }
        }
        return instance;
    }
}
