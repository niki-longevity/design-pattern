package org.example.decorator;

// 抽象装饰器：短信装饰器基类
public abstract class SmsDecorator implements SmsSender{
    // 持有被装饰的构件对象
    protected final SmsSender sender;
    public SmsDecorator(SmsSender sender) {
        this.sender = sender;
    }

    @Override
    public void send(String phone, String message) {
        // 默认直接转发请求给被装饰对象
        sender.send(phone, message);
    }
}
