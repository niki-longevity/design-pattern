package org.example.strategy.impl;

import org.example.strategy.DiscountStrategy;

// 无优惠
public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice;
    }
}
