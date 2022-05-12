package com.javaquery.designpattern.abstractfactory;

import com.javaquery.designpattern.factory.Vehicle;

/**
 * @author javaquery
 * @since 2021-10-31
 * @github https://github.com/javaquery/Examples
 */
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.create(new CarFactory("white", 4,5));
        System.out.println(car);

        Vehicle miniTruck = VehicleFactory.create(new TruckFactory("red", 4,3));
        System.out.println(miniTruck);

        Vehicle bigTruck = VehicleFactory.create(new TruckFactory("white", 6,3));
        System.out.println(bigTruck);
    }
}
