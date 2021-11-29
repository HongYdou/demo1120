package com.example.demo1120.designPattern.FactoryPattern;

import com.example.demo1120.designPattern.FactoryPattern.service.Food;
import com.example.demo1120.designPattern.FactoryPattern.service.impl.AmericanFoodA;
import com.example.demo1120.designPattern.FactoryPattern.service.impl.AmericanFoodB;

public class AmericanFoodFactory implements FoodFactory{
    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        }
        if (name.equals("B")) {
            return new AmericanFoodB();
        }
        return null;
    }
}
