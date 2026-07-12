package org.example.simple.factory.impl;

import org.example.simple.factory.Notification;
import org.example.simple.factory.NotificationRequest;

// 具体产品：邮件通知
public class EmailNotification implements Notification {
    @Override
    public void send(NotificationRequest request) {
        // 真实场景：SMTP配置、附件处理、富文本渲染等逻辑
        System.out.printf("[邮件通知] 发送成功，接收人：%s，内容：%s%n",
                request.getReceiver(), request.getMessage());
    }
}
