package com.factory.simple;

import com.factory.BlevelCar;
import com.factory.Car;

public class FactoryTest {

    public static void main(String[] args) {
        //原始做法
        //System.out.println(new BlevelCar().getName());

        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getCar("A"));
    }
}
