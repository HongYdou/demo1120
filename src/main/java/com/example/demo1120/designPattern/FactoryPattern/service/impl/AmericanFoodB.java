package com.example.demo1120.designPattern.FactoryPattern.service.impl;

import com.example.demo1120.designPattern.FactoryPattern.service.Food;

public class AmericanFoodB implements Food {
    @Override
    public void printName() {
        System.out.println("AmericanFoodB");
    }
}
