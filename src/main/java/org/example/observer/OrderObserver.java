package org.example.observer;

// 抽象观察者：订单事件监听器
public interface OrderObserver {
    /*
    * 订单支付成功后的回调方法
    * */
    void onPaySuccess(String orderId, Long userId, Long amount);
}
