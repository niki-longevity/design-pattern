package org.example.builder;

// 指挥者：定义组装流程，控制构建顺序
public class ComputerDirector {
    public Computer buildComputer(ComputerBuilder computerBuilder) {
        // 固定组装顺序：CPU > 内存 > 硬盘 > 显卡 > 电源
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildHardDisk();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildPowerSupply();
        return computerBuilder.getComputer();
    }
}
