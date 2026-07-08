package org.example.template.method;

// 饮品制作（抽象模板类）
public abstract class Beverage {
    /*
    *  模板方法：定义制作饮品的完整流程
    *  final 修饰，禁止子类重写，修改流程
    * */
    public final void makeBeverage() {
        boilWater();        //步骤一：烧水（通用）
        brew();             //步骤二：冲泡（差异化）
        pourInCup();        //步骤三：倒入杯中（通用）
        //钩子方法控制是否执行步骤四
        if (isAddCondiments()) {
            addCondiments();//步骤四：添加调料（差异化）
        }
    }

    // 具体方法：烧水，所有饮品都一样
    private void boilWater() {
        System.out.println("烧水");
    }

    // 具体方法：倒入杯子，所有饮品都一样
    private void pourInCup() {
        System.out.println("倒入杯中");
    }

    // 抽象方法：冲泡，由子类实现
    protected abstract void brew();

    // 抽象方法：加调料，由子类实现
    protected abstract void addCondiments();

    /*
    *  钩子方法：是否加调料，默认加
    *  子类可以重写该方法，改变流程走向
    * */
    protected boolean isAddCondiments() {
        return true;
    }
}
