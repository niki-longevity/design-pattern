package org.example.decorator.impl;

import org.example.decorator.SmsDecorator;
import org.example.decorator.SmsSender;

// 具体装饰器：日志埋点增强
public class LogSmsDecorator extends SmsDecorator {
    public LogSmsDecorator(SmsSender sender) {
        super(sender);
    }

    @Override
    public void send(String phone, String message) {
        System.out.println("[日志] 发送短信：" + phone + " " + message);
        super.send(phone, message);
        System.out.println("[日志] 发送完成");
    }
}
