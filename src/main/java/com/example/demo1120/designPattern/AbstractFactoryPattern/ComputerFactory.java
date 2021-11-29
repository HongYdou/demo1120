package com.example.demo1120.designPattern.AbstractFactoryPattern;

import com.example.demo1120.designPattern.AbstractFactoryPattern.service.CPU;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Computer;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.HardDisk;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.MainBoard;

public interface ComputerFactory {

    CPU makeCPU();

    MainBoard makeMainBoard();

    HardDisk makeHardDisk();

    Computer makeComputer(CPU cpu,MainBoard mainBoard,HardDisk hardDisk);
}
