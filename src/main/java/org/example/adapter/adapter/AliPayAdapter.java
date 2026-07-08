package org.example.adapter.adapter;

import org.example.adapter.Payment;
import org.example.adapter.sdk.AliPaySdk;

// 适配器1：支付宝适配器
public class AliPayAdapter implements Payment {
    private final AliPaySdk aliPaySdk;

    public AliPayAdapter(AliPaySdk aliPaySdk) {
        this.aliPaySdk = aliPaySdk;
    }
    // 统一支付
    @Override
    public String unifiedPay(String orderId, long amount) {
        // 内部转调支付宝的原生方法
        return aliPaySdk.alipayTradeCreate(orderId, amount);
    }
    // 统一查询订单状态
    @Override
    public boolean queryStatus(String orderId) {
        return aliPaySdk.alipayTradeQuery(orderId);
    }
}
