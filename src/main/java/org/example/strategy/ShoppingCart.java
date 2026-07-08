package org.example.strategy;

import org.example.strategy.impl.FixedDiscount;
import org.example.strategy.impl.NoDiscount;
import org.example.strategy.impl.PercentageDiscount;

import java.util.Map;

// 上下文：购物车
public class ShoppingCart {
    private DiscountStrategy discountStrategy;
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // 旧的重载方法，兼容老业务
    public double checkout(double totalPrice) {
        if (discountStrategy == null) {
            throw new IllegalStateException("请先设置折扣策略");
        }
        return discountStrategy.applyDiscount(totalPrice);
    }

    // 策略工厂
    private static final Map<String, DiscountStrategy> strategyFactory = Map.of(
        "normal", new NoDiscount(),
        "gold", new FixedDiscount(30),
        "diamond", new PercentageDiscount(0.3)
    );

    // 新的重载方法，使用策略工厂
    public double checkout(double totalPrice, String memberType) {
        DiscountStrategy strategy = strategyFactory.get(memberType);
        if (strategy == null) {
            throw new IllegalArgumentException("不支持的会员类型");
        }
        return strategy.applyDiscount(totalPrice);
    }
}
