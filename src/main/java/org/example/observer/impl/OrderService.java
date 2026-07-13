package org.example.observer.impl;

import org.example.observer.OrderObserver;
import org.example.observer.OrderSubject;

import java.util.ArrayList;
import java.util.List;

// 具体主题：订单服务
public class OrderService implements OrderSubject {
    // 维护所有注册的观察者
    private final List<OrderObserver> observers = new ArrayList<>();
    @Override
    public void registerObserver(OrderObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String orderId, Long userId, Long amount) {
        // 遍历所有观察者，逐个通知
        for (OrderObserver observer : observers) {
            observer.onPaySuccess(orderId, userId, amount);
        }
    }

    // 核心业务：订单支付成功后的回调方法
    public void paySuccess(String orderId, Long userId, Long amount) {
        System.out.println("[订单服务] 订单 " + orderId
                + " 支付成功，用户 " + userId + " 购买了 " + amount + " 件商品");
        // 状态更新后，通知所有观察者
        notifyObservers(orderId, userId, amount);
    }
}
