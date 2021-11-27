package com.example.demo1120;

import com.example.demo1120.designPattern.simpleFactoryPattern.FoodFactory;
import com.example.demo1120.designPattern.simpleFactoryPattern.service.Food;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class Demo1120ApplicationTests {

    @Test
    void testSimpleFactoryPattern() {
        String foodName="chicken";
        Food food = FoodFactory.getFood(foodName);
        food.printName();
    }

}
