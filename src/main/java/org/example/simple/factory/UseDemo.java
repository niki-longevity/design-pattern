package org.example.simple.factory;

public class UseDemo {
    public static void main(String[] args) {
        NotificationRequest request = new NotificationRequest("13800138000", "您的订单已发货");

        // 1. 发送短信：通过工厂获取短信通知实例
        Notification smsNotification = NotificationFactory.createNotification(NotificationTypeEnum.SMS);
        smsNotification.send(request);

        // 2. 发送邮件：仅切换类型即可获取邮件通知实例
        Notification emailNotification = NotificationFactory.createNotification(NotificationTypeEnum.EMAIL);
        emailNotification.send(request);
    }
}
