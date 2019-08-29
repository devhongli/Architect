package com.pattern.V1factory.func;

import com.pattern.V1factory.Car;
import com.pattern.V1factory.SUVclassCar;

public class SUVclassCarFactory implements Factory {

    @Override
    public Car getCar() {
        return new SUVclassCar();
    }
}
