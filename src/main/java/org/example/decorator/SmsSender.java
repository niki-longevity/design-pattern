package org.example.decorator;

// 抽象构件：短信发送标准接口
public interface SmsSender {
    void send(String phone, String message);
}
