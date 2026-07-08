package org.example.strategy.impl;

import org.example.strategy.DiscountStrategy;

// 百分比折扣
public class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - percentage);
    }
}
