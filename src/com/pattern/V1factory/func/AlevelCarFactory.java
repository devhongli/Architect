package com.pattern.V1factory.func;

import com.pattern.V1factory.AlvevlCar;
import com.pattern.V1factory.Car;

/**
 * @author Administrator
 */
public class AlevelCarFactory implements Factory {
    @Override
    public Car getCar() {
        return new AlvevlCar();
    }
}
