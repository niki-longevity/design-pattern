package org.example.adapter.adapter;

import org.example.adapter.Payment;
import org.example.adapter.sdk.WeChatPaySdk;

// 适配器2：微信支付适配器
// 微信的接口是回调式、状态是字符串，适配器要把它转换成统一接口
public class WeChatPayAdapter implements Payment {
    private final WeChatPaySdk wxPaySdk;
    public WeChatPayAdapter(WeChatPaySdk wxPaySdk) {
        this.wxPaySdk = wxPaySdk;
    }
    @Override
    public String unifiedPay(String orderId, long amount) {
        // 用数组接收回调结果（Java lambda 访问外部变量要求 final，用数组绕开）
        final String[] tradeNoHolder = new String[1];

        wxPaySdk.wxUnifiedOrder(orderId, amount, new WeChatPaySdk.WxPayCallback() {
            @Override
            public void onSuccess(String tradeNo) {
                tradeNoHolder[0] = tradeNo;
            }
            @Override
            public void onFail(String errorMsg) {
                throw new RuntimeException("微信支付失败："+errorMsg);
            }
        });
        return tradeNoHolder[0];
    }
    @Override
    public boolean queryStatus(String orderId) {
        String status = wxPaySdk.wxOrderQuery(orderId);
        return "SUCCESS".equals(status);
    }
}
