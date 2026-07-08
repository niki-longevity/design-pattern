package org.example.strategy.impl;

import org.example.strategy.DiscountStrategy;

// 固定金额折扣
public class FixedDiscount implements DiscountStrategy {

    private double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return Math.max(0, originalPrice - discountAmount);
    }
}
