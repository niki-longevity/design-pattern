package org.example.observer;

import org.example.observer.impl.OrderService;
import org.example.observer.impl.PointObserver;
import org.example.observer.impl.SmsObserver;
import org.example.observer.impl.StockObserver;

public class UseDemo {
    public static void main(String[] args) {
        // 1.创建主题(订单服务)
        OrderService orderService = new OrderService();

        // 2.注册观察者：可动态增删
        orderService.registerObserver(new StockObserver());
        orderService.registerObserver(new PointObserver());
        orderService.registerObserver(new SmsObserver());

        // 3.通知观察者，触发监听器(支付成功事件，自动联动所有下游)
        orderService.paySuccess("20230000000001", 1001L, 100L);
    }
}
