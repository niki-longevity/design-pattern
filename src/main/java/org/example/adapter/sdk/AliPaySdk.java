package org.example.adapter.sdk;

// 适配者1：支付宝SDK（原有接口，不可修改）
public class AliPaySdk {
    // 方法名、参数名和内部标准都不一样

    // 创建支付订单
    public String alipayTradeCreate(String outTradeNo, long totalAmount){
        System.out.println("支付宝：创建支付订单" + outTradeNo + "，金额" + totalAmount + "元");
        return "ALI_"+outTradeNo + "_" + System.currentTimeMillis();
    }
    // 查询支付订单
    public boolean alipayTradeQuery(String outTradeNo){
        System.out.println("支付宝：查询支付订单" + outTradeNo);
        return true;
    }
}
