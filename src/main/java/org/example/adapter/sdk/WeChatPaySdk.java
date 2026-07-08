package org.example.adapter.sdk;

// 适配者2：微信支付SDK（原有接口，不可修改）
public class WeChatPaySdk {
    // 接口风格和支付宝完全不同

    // 创建支付订单
    public void wxUnifiedOrder(String mchOrderNo, long fee, WxPayCallback callback) {
        System.out.println("微信支付：发起下单 " + mchOrderNo + "，金额 " + fee + "分");
        String wxTradeNo = "WX_" + mchOrderNo + "_" + System.currentTimeMillis();
        callback.onSuccess(wxTradeNo);
    }

    // 查询支付订单
    public String wxOrderQuery(String transactionId) {
        System.out.println("微信支付：查询订单 " + transactionId + " 状态");
        return "SUCCESS"; // 微信用字符串表示状态
    }

    // 回调方式返回结果
    public interface WxPayCallback {
        void onSuccess(String tradeNo);
        void onFail(String errorMsg);
    }
}
