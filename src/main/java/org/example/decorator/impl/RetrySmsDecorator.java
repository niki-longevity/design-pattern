package org.example.decorator.impl;

import org.example.decorator.SmsDecorator;
import org.example.decorator.SmsSender;

// 具体装饰器：失败自动重试
public class RetrySmsDecorator extends SmsDecorator {
    private final int maxRetryCount;
    public RetrySmsDecorator(SmsSender sender, int maxRetryCount) {
        super(sender);
        this.maxRetryCount = maxRetryCount;
    }

    @Override
    public void send(String phone, String message) {
        int retryCount = 0;
        while (retryCount <= maxRetryCount) {
            try {
                super.send(phone, message);
                return;
            } catch (Exception e) {
                retryCount++;
                System.out.println("重试第 " + retryCount + " 次");
                if(retryCount > maxRetryCount){
                    throw new RuntimeException("重试次数超过限制");
                }
            }
        }
    }
}
