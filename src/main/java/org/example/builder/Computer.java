package org.example.builder;

// 产品类：电脑(复杂对象)
public class Computer {
    private String cpu;         // cpu
    private String memory;      // 内存
    private String hardDisk;    // 硬盘
    private String graphicsCard;// 显卡
    private String powerSupply; // 电源
    // 构造函数包权限，避免外部类创建对象
    public Computer(){}

    // 仅提供 setter 给建造者使用，对外只暴露 getter，保证构建后不变
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "电脑配置：" +
                "\ncpu：" + cpu +
                "\n内存：" + memory +
                "\n硬盘：" + hardDisk +
                "\n显卡：" + graphicsCard +
                "\n电源：" + powerSupply;
    }
}
