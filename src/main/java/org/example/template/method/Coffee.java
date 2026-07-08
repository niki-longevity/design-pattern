package org.example.template.method;

// 泡咖啡（具体模板类）
public class Coffee extends Beverage{
    // 具体方法：冲泡咖啡
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡粉");
    }

    // 具体方法：加调料
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
