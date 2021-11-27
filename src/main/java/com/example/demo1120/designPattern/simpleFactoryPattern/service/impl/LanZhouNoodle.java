package com.example.demo1120.designPattern.simpleFactoryPattern.service.impl;

import com.example.demo1120.designPattern.simpleFactoryPattern.service.Food;

public class LanZhouNoodle implements Food {

    private String name="LanZhouNoodle";

    @Override
    public void printName() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
