package com.pattern.V1factory.abstr;

import com.pattern.V1factory.Car;

/**
 * 抽象工厂
 * @author Administrator
 */
public abstract class AbstractFactory {
    /**
     * 其他公共逻辑实现
     */


    public abstract Car getAlevelCar();

    public abstract Car getBlevelCar();

    public abstract Car getSUVclassCar();
}
