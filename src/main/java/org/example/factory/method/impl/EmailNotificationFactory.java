package org.example.factory.method.impl;

import org.example.factory.method.Notification;
import org.example.factory.method.NotificationFactory;

// 具体工厂：邮件通知工厂
public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
