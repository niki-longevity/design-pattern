package org.example.simple.factory;

import org.example.simple.factory.impl.EmailNotification;
import org.example.simple.factory.impl.SmsNotification;

// 简单工厂：通知工厂
public class NotificationFactory {
    // 静态创建方法：根据渠道类型返回对应的通知实例
    public static Notification createNotification(NotificationTypeEnum type) {
        if (type == null) {
            throw new IllegalArgumentException("通知渠道类型不能为空");
        }
        return switch (type) {
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
            default -> throw new IllegalArgumentException("不支持的通知渠道：" + type);
        };
    }
}
