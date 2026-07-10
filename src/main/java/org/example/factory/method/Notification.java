package org.example.factory.method;

// 抽象产品：消息通知接口
public interface Notification {
    // 发送消息
    void send(String receiver, String message);
}
