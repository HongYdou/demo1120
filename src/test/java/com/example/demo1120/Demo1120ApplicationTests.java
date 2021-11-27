package com.example.demo1120;

import com.example.demo1120.designPattern.simpleFactoryPattern.FoodFactory;
import com.example.demo1120.designPattern.simpleFactoryPattern.service.Food;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class Demo1120ApplicationTests {

    @Test
    void testSimpleFactoryPattern() {
        String foodName_noodle="noodle";
        Food food_noodle = FoodFactory.getFood(foodName_noodle);
        food_noodle.printName();

        String foodName_chicken="chicken";
        Food food_chicken = FoodFactory.getFood(foodName_chicken);
        food_chicken.printName();

    }

}
