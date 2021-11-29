package com.example.demo1120.designPattern.FactoryPattern;

import com.example.demo1120.designPattern.FactoryPattern.service.Food;
import com.example.demo1120.designPattern.FactoryPattern.service.impl.ChineseFoodA;
import com.example.demo1120.designPattern.FactoryPattern.service.impl.ChineseFoodB;

public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        }
        if (name.equals("B")) {
            return new ChineseFoodB();
        }
        return null;
    }
}
