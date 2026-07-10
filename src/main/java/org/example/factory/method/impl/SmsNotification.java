package org.example.factory.method.impl;

import org.example.factory.method.Notification;

// 具体产品：短信通知
public class SmsNotification implements Notification {
    @Override
    public void send(String receiver, String message) {
        System.out.println("发送短信：" + receiver + " " + message);
    }
}
