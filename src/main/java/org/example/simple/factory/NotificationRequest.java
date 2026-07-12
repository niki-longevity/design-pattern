package org.example.simple.factory;

// 请求参数
public class NotificationRequest {
    private String receiver;    // 接收人
    private String message;     // 消息内容

    public NotificationRequest(String receiver, String message) {
        this.receiver = receiver;
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }
    public String getMessage() {
        return message;
    }
}
