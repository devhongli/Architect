package com.factory.simple;

import com.factory.AlvevlCar;
import com.factory.BlevelCar;
import com.factory.Car;
import com.factory.SUVclassCar;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public Car getCar(String name){
        if ("A".equals(name)){
            return new AlvevlCar();
        } else if("B".equals(name)){
            return new BlevelCar();
        }else if("SUV".equals(name)){
            return new SUVclassCar();
        }
        return null;
    }
}
