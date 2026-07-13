package org.example.observer.impl;

import org.example.observer.OrderObserver;

// 具体观察者：短信通知观察者
public class SmsObserver implements OrderObserver {
    @Override
    public void onPaySuccess(String orderId, Long userId, Long amount) {
        System.out.println("[短信服务] 订单 " + orderId
                + " 支付成功，用户 " + userId + " 购买了 " + amount + " 件商品");
    }
}
