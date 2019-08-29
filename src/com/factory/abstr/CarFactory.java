package com.factory.abstr;

import com.factory.AlvevlCar;
import com.factory.BlevelCar;
import com.factory.Car;
import com.factory.SUVclassCar;

/**
 * 一个工厂，不同的流水线产品
 * @author Administrator
 */
public class CarFactory extends AbstractFactory{
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
