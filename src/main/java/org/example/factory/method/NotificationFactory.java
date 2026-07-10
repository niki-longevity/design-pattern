package org.example.factory.method;

// 抽象工厂：通知工厂接口
public interface NotificationFactory {
    // 创建通知对象
    Notification createNotification();
}
