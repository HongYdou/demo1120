package com.example.demo1120.designPattern.AbstractFactoryPattern.factoryImpl;

import com.example.demo1120.designPattern.AbstractFactoryPattern.ComputerFactory;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.CPU;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Computer;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.HardDisk;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.MainBoard;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.intel.IntelCPU;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.intel.IntelHardDisk;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.intel.IntelMainBoard;

public class InterFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new IntelHardDisk();
    }

    @Override
    public Computer makeComputer(CPU cpu,MainBoard mainBoard,HardDisk hardDisk) {
        return new Computer(makeCPU(),makeMainBoard(),makeHardDisk());
    }
}
