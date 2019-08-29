package com.pattern.V1factory.func;

import com.pattern.V1factory.BlevelCar;
import com.pattern.V1factory.Car;

public class BlevelCarFactory implements Factory {

    @Override
    public Car getCar() {
        return new BlevelCar();
    }
}
