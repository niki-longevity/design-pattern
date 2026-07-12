package org.example.simple.factory;

// 抽象产品接口：统一的通知接口
public interface Notification {
    // 统一的消息发送方法
    void send(NotificationRequest request);
}
