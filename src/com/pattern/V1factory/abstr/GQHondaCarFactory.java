package com.pattern.V1factory.abstr;

import com.pattern.V1factory.Car;
import com.pattern.V1factory.AlvevlCar;
import com.pattern.V1factory.BlevelCar;
import com.pattern.V1factory.SUVclassCar;

/**
 * 一个集团工厂，不同的子工厂生产产品 ，每个子工厂生产自己的产品
 * @author Administrator
 */
public class GQHondaCarFactory extends AbstractFactory{
    
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
