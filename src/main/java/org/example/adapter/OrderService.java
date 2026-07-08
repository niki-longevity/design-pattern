package org.example.adapter;

// 客户端：业务代码只依赖统一的支付接口
public class OrderService {
    private Payment payment;

    // 注入不同的适配器，即可切换支付渠道
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void payOrder(String orderId, long amount) {
        String tradeNo = payment.unifiedPay(orderId, amount);
        System.out.println("业务层：支付成功，支付流水号为 " + tradeNo);

        boolean status = payment.queryStatus(tradeNo);
        System.out.println("业务层：支付结果为 " + (status ? "成功" : "失败"));
    }
}
