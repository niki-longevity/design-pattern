package org.example.template.method;

// 泡茶（具体模板类）
public class Tea extends Beverage{
    // 具体方法：冲泡
    @Override
    protected void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    // 具体方法：加调料
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬片");
    }

    // 重写钩子方法：清茶不加调料
    @Override
    protected boolean isAddCondiments() {
        return false;
    }
}
