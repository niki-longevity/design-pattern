package org.example.builder.impl;

import org.example.builder.Computer;
import org.example.builder.ComputerBuilder;

// 具体建造者：办公电脑建造者
public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("Intel i5-13600K");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16G");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("1T");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA GeForce RTX 3080");
    }

    @Override
    public void buildPowerSupply() {
        computer.setPowerSupply("500W");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
