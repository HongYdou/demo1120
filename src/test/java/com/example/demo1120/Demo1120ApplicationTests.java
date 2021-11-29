package com.example.demo1120;

import com.example.demo1120.designPattern.AbstractFactoryPattern.factoryImpl.AmdFactory;
import com.example.demo1120.designPattern.AbstractFactoryPattern.ComputerFactory;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.CPU;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.Computer;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.HardDisk;
import com.example.demo1120.designPattern.AbstractFactoryPattern.service.MainBoard;
import com.example.demo1120.designPattern.simpleFactoryPattern.FoodFactory;
import com.example.demo1120.designPattern.simpleFactoryPattern.service.Food;
import org.junit.jupiter.api.Test;

//@SpringBootTest
class Demo1120ApplicationTests {

    @Test
    void testSimpleFactoryPattern() {
        String foodName_noodle = "noodle";
        Food food_noodle = FoodFactory.getFood(foodName_noodle);
        food_noodle.printName();

        String foodName_chicken = "chicken";
        Food food_chicken = FoodFactory.getFood(foodName_chicken);
        food_chicken.printName();

    }

    @Test
    void TestAbstractFactoryPattern() {
        //1、选择电脑工厂
        ComputerFactory factory = new AmdFactory();
        //2、制造cpu
        CPU cpu = factory.makeCPU();
        //3、制造主板
        MainBoard mainBoard = factory.makeMainBoard();
        //4、制造硬盘
        HardDisk hardDisk = factory.makeHardDisk();
        //5、组装电脑
        Computer computer = factory.makeComputer(cpu,mainBoard,hardDisk);
    }

}
