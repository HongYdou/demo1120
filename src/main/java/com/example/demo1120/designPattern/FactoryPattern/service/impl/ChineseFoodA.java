package com.example.demo1120.designPattern.FactoryPattern.service.impl;

import com.example.demo1120.designPattern.FactoryPattern.service.Food;

public class ChineseFoodA implements Food {
    @Override
    public void printName() {
        System.out.println("ChineseFoodA");
    }
}
