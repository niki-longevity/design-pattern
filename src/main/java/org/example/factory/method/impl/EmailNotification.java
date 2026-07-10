package org.example.factory.method.impl;

import org.example.factory.method.Notification;

// 具体产品：邮件通知
public class EmailNotification implements Notification {
    @Override
    public void send(String receiver, String message) {
        System.out.println("发送邮件：" + receiver + " " + message);
    }
}
