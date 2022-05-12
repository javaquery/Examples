package com.javaquery.designpattern.factory;

/**
 * @author javaquery
 * @since 2021-10-31
 * @github https://github.com/javaquery/Examples
 */
public class VehicleFactory {

    public static Vehicle create(String type, String color, int tyres, int seatingCapacity){
        if("car".equalsIgnoreCase(type)){
            return new Car(color, tyres, seatingCapacity);
        }else if("truck".equalsIgnoreCase(type)){
            return new Truck(color, tyres, seatingCapacity);
        }
        return null;
    }
}
