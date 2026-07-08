package org.example.decorator.impl;

import org.example.decorator.SmsSender;

// 具体构件：基础短信发送器
public class BaseSmsSender implements SmsSender {
    @Override
    public void send(String phone, String message) {
        System.out.println("发送短信：" + phone + " " + message);
        // 模拟 30% 概率发生失败，用于测试重试功能
        if (Math.random() < 0.3) {
            throw new RuntimeException("短信发送失败");
        }
    }
}
