package org.example.builder.impl;


import org.example.builder.Computer;
import org.example.builder.ComputerBuilder;

// 具体建造者：游戏主机建造者
public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("游戏主机CPU");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("游戏主机内存");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("游戏主机硬盘");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("游戏主机显卡");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("游戏主机电源");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
