package com.example.demo1120.designPattern.FactoryPattern;

import com.example.demo1120.designPattern.FactoryPattern.service.Food;

public interface FoodFactory {

    Food makeFood(String name);
}
