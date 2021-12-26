package com.example.demo1120;


import com.example.demo1120.designPattern.FactoryPattern.ChineseFoodFactory;
import com.example.demo1120.designPattern.FactoryPattern.FoodFactory;
import com.example.demo1120.designPattern.FactoryPattern.service.Food;
import org.junit.jupiter.api.Test;

public class FactoryPatternDemoTest {

    @Test
    void testFactoryPattern(){
        // 先选择一个具体的工厂
        FoodFactory foodFactory = new ChineseFoodFactory();
        // 由第一步的工厂产生具体的对象，不同的工厂造出不一样的对象
        Food food = foodFactory.makeFood("A");
        food.printName();

    }
}
