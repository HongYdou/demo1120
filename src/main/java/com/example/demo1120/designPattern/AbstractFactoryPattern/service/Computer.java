package com.example.demo1120.designPattern.AbstractFactoryPattern.service;

public class Computer {

    private CPU cpu;

    private MainBoard mainBoard;

    private HardDisk hardDisk;

    public Computer() {
    }

    public Computer(CPU cpu, MainBoard mainBoard, HardDisk hardDisk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.hardDisk = hardDisk;
    }
}
