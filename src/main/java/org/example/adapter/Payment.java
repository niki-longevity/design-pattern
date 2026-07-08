package org.example.adapter;

// 目标接口：系统内部统一支付接口
public interface Payment {
    // 统一支付
    String unifiedPay(String orderId, long amount);

    // 统一查询订单状态
    boolean queryStatus(String orderId);
}
