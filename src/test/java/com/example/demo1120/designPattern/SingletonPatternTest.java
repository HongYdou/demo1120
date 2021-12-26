package com.example.demo1120.designPattern.SingletonPattern;

import org.junit.jupiter.api.Test;

public class SingletonPatternTest {

    @Test
    void testSingletonHungry(){
        SingletonHungry instance = SingletonHungry.getInstance();
        instance.print();
    }
    @Test
    void testSingletonLazy(){
        SingletonLazy instance = SingletonLazy.getInstance();
        instance.print();
    }
    @Test
    void testSingletonDCL(){
        SingletonDCL instance = SingletonDCL.getInstance();
        instance.print();
    }
    @Test
    void testSingletonStatic(){
        SingletonStatic instance = SingletonStatic.getInstance();
        instance.print();
    }
}