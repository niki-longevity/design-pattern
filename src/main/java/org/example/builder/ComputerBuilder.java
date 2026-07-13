package org.example.builder;

// 抽象建造者：定义电脑部件的构建步骤
public interface ComputerBuilder {
    void buildCpu();        // 构建CPU
    void buildMemory();     // 构建内存
    void buildHardDisk();   // 构建硬盘
    void buildGraphicsCard();// 构建显卡
    void buildPowerSupply();// 构建电源
    Computer getComputer(); // 获取电脑
}
