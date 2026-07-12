package org.example.simple.factory.impl;

import org.example.simple.factory.Notification;
import org.example.simple.factory.NotificationRequest;

// 具体产品：短信通知
public class SmsNotification implements Notification {
    @Override
    public void send(NotificationRequest request) {
        // 真实场景：对接运营商短信SDK、签名校验、模板渲染等逻辑
        System.out.printf("[短信通知] 发送成功，接收人：%s，内容：%s%n",
                request.getReceiver(), request.getMessage());
    }
}
