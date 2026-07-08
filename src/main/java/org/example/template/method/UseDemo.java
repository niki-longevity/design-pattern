package org.example.template.method;

public class UseDemo {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("制作茶：");
        tea.makeBeverage();

        System.out.println("==========");

        Beverage coffee = new Coffee();
        System.out.println("制作咖啡：");
        coffee.makeBeverage();
    }
}
