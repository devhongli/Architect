package com.factory.func;

import com.factory.BlevelCar;
import com.factory.Car;

public class BlevelCarFactory implements Factory {

    @Override
    public Car getCar() {
        return new BlevelCar();
    }
}
