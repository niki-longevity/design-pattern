package org.example.adapter;

import org.example.adapter.adapter.AliPayAdapter;
import org.example.adapter.adapter.WeChatPayAdapter;
import org.example.adapter.sdk.AliPaySdk;
import org.example.adapter.sdk.WeChatPaySdk;

public class UseDemo {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        System.out.println("===== 支付宝支付 =====");
        orderService.setPayment(new AliPayAdapter(new AliPaySdk()));
        orderService.payOrder("ORDER_001", 8888);

        System.out.println("\n===== 微信支付 =====");
        orderService.setPayment(new WeChatPayAdapter(new WeChatPaySdk()));
        orderService.payOrder("ORDER_002", 9999);
    }
}
