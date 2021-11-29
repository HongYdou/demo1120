package com.example.demo1120.designPattern.AbstractFactoryPattern.factoryImpl;

import com.example.demo1120.designPattern.AbstractFactoryPattern.ComputerFactory;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Amd.AmdCPU;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Amd.AmdHardDisk;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Amd.AmdMainBoard;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.CPU;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Computer;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.HardDisk;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.MainBoard;

public class AmdFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new AmdHardDisk();
    }

    @Override
    public Computer makeComputer(CPU cpu,MainBoard mainBoard,HardDisk hardDisk) {
        return new Computer();
    }
}
