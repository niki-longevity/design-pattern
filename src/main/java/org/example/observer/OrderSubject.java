package org.example.observer;

// 抽象主题：订单事件发布者
public interface OrderSubject {
    // 注册观察者
    void registerObserver(OrderObserver observer);

    // 移除观察者
    void removeObserver(OrderObserver observer);

    // 通知观察者
    void notifyObservers(String orderId, Long userId, Long amount);
}
