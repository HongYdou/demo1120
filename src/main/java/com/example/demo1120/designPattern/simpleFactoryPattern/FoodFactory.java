package com.example.demo1120.designPattern.simpleFactoryPattern;

import com.example.demo1120.designPattern.simpleFactoryPattern.service.Food;
import com.example.demo1120.designPattern.simpleFactoryPattern.service.impl.HuangMenChicken;
import com.example.demo1120.designPattern.simpleFactoryPattern.service.impl.LanZhouNoodle;

public class FoodFactory {
    public static Food getFood(String fondName){
        if (fondName.equals("noodle")) {
            return new LanZhouNoodle();
        }
        if (fondName.equals("chicken")) {
            return new HuangMenChicken();
        }
        return null;
    }
}
