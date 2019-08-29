package com.pattern.V1factory.simple;

import com.pattern.V1factory.Car;
import com.pattern.V1factory.AlvevlCar;
import com.pattern.V1factory.BlevelCar;
import com.pattern.V1factory.SUVclassCar;

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
