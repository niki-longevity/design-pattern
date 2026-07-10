package org.example.factory.method;

import org.example.factory.method.impl.EmailNotificationFactory;
import org.example.factory.method.impl.SmsNotificationFactory;

public class UseDemo {
    public static void main(String[] args) {
        // 使用短信通知：只需指定具体工厂，业务逻辑完全通用
        NotificationFactory factory = new SmsNotificationFactory();
        Notification notification = factory.createNotification();
        notification.send("12345678901", "订单已发货");

        // 切换为邮件通知：仅修改工厂实例化这一行
        factory = new EmailNotificationFactory();
        notification = factory.createNotification();
        notification.send("admin@example.com", "服务器CPU使用率过高");
    }
}
