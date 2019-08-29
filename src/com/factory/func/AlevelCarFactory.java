package com.factory.func;

import com.factory.AlvevlCar;
import com.factory.Car;

/**
 * @author Administrator
 */
public class AlevelCarFactory implements Factory {
    @Override
    public Car getCar() {
        return new AlvevlCar();
    }
}
