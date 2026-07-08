package org.example.decorator;

import org.example.decorator.impl.BaseSmsSender;
import org.example.decorator.impl.LogSmsDecorator;
import org.example.decorator.impl.RetrySmsDecorator;
import org.example.decorator.impl.SignatureSmsDecorator;

public class UseDemo {
    public static void main(String[] args){
        // 1.基础发送器
        SmsSender smsSender = new BaseSmsSender();
        smsSender.send("18888888888", "Hello World");

        // 2.叠加日志功能
        smsSender = new LogSmsDecorator(smsSender);

        // 3.叠加签名功能
        smsSender = new SignatureSmsDecorator(smsSender, "【签名】");

        // 4.叠加失败重试功能（最多重试 3 次）
        smsSender = new RetrySmsDecorator(smsSender, 3);

        // 客户端无感知，和调用原始对象完全一样
        smsSender.send("18888888888", "Hello World");
    }
}
