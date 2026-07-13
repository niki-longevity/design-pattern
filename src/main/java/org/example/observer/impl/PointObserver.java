package org.example.observer.impl;

import org.example.observer.OrderObserver;

// 具体观察者：积分观察者
public class PointObserver implements OrderObserver {
    @Override
    public void onPaySuccess(String orderId, Long userId, Long amount) {
        System.out.println("[积分服务] 订单 " + orderId
                + " 支付成功，用户 " + userId + " 获得 " + amount + " 积分");
    }
}
