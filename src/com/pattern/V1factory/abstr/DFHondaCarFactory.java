package com.pattern.V1factory.abstr;

import com.pattern.V1factory.AlvevlCar;
import com.pattern.V1factory.BlevelCar;
import com.pattern.V1factory.Car;
import com.pattern.V1factory.SUVclassCar;

/**
 * 每个子工厂生产自己的产品
 */
public class DFHondaCarFactory extends AbstractFactory {

    @Override
    public Car getAlevelCar() {
        return new AlvevlCar();
    }

    @Override
    public Car getBlevelCar() {
        return new BlevelCar();
    }

    @Override
    public Car getSUVclassCar() {
        return new SUVclassCar();
    }
}
