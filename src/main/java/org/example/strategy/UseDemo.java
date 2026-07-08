package org.example.strategy;

import org.example.strategy.impl.FixedDiscount;
import org.example.strategy.impl.NoDiscount;
import org.example.strategy.impl.PercentageDiscount;

//演示
public class UseDemo {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        double originalPrice = 200.0;

        // 无折扣
        cart.setDiscountStrategy(new NoDiscount());
        System.out.println("无折扣价格：" + cart.checkout(originalPrice));

        // 固定折扣
        cart.setDiscountStrategy(new FixedDiscount(30));
        System.out.println("固定折扣价格：" + cart.checkout(originalPrice));

        // 百分比折扣
        cart.setDiscountStrategy(new PercentageDiscount(0.2));
        System.out.println("百分比折扣价格：" + cart.checkout(originalPrice));

        // 新业务使用策略工厂
        double p = cart.checkout(originalPrice, "diamond");
        System.out.println("钻石会员价：" + p);
    }
}
