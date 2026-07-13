package org.example.builder;

import org.example.builder.impl.GamingComputerBuilder;
import org.example.builder.impl.OfficeComputerBuilder;

public class UseDemo {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        // 组装游戏主机
        Computer gamingPc = director.buildComputer(new GamingComputerBuilder());
        System.out.println("游戏主机：" + gamingPc);
        System.out.println("==========");

        // 组装办公主机
        Computer officePc = director.buildComputer(new OfficeComputerBuilder());
        System.out.println("办公主机：" + officePc);
    }
}
