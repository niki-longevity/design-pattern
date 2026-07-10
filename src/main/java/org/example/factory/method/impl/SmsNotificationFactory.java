package org.example.factory.method.impl;

import org.example.factory.method.Notification;
import org.example.factory.method.NotificationFactory;

// 具体工厂：短信通知工厂
public class SmsNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        // 封装创建细节：比如初始化配置、参数校验、依赖注入等
        return new SmsNotification();
    }
}
