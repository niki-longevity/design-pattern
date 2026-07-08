package org.example.decorator.impl;

import org.example.decorator.SmsDecorator;
import org.example.decorator.SmsSender;

// 具体装饰器：短信签名增强
public class SignatureSmsDecorator extends SmsDecorator {
    private final String signName;

    public SignatureSmsDecorator(SmsSender sender, String signName) {
        super(sender);
        this.signName = signName;
    }

    @Override
    public void send(String phone, String message) {
        // 增强逻辑：给短信内容拼接官方签名
        String signedMessage = message + "【" + signName + "】";
        super.send(phone, signedMessage);
    }
}
