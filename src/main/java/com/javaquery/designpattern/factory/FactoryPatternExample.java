package com.javaquery.designpattern.factory;

/**
 * @author javaquery
 * @since 2021-10-31
 * @github https://github.com/javaquery/Examples
 */
public class FactoryPatternExample {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.create("car", "white", 4, 5);
        System.out.println(car);

        Vehicle miniTruck = VehicleFactory.create("truck", "red", 4, 3);
        System.out.println(miniTruck);

        Vehicle bigTruck = VehicleFactory.create("truck", "red", 6, 3);
        System.out.println(bigTruck);
    }
}
