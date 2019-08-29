package com.factory.func;

import com.factory.Car;
import com.factory.SUVclassCar;

public class SUVclassCarFactory implements Factory {

    @Override
    public Car getCar() {
        return new SUVclassCar();
    }
}
