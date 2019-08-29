package com.factory.func;

import com.factory.simple.SimpleFactory;

public class FactoryTest {

    public static void main(String[] args) {
        //原始做法
        //System.out.println(new BlevelCar().getName());

        //简单工厂
        //System.out.println(new SimpleFactory().getCar("B"));

        //工厂模型
        Factory factory = new AlevelCarFactory();
        System.out.println(factory.getCar());
    }
}
