package com.javaquery.designpattern.abstractfactory;

import com.javaquery.designpattern.factory.Vehicle;

/**
 * @author javaquery
 * @since 2021-10-31
 * @github https://github.com/javaquery/Examples
 */
public class VehicleFactory {
    public static Vehicle create(VehicleAbstractFactory vehicleAbstractFactory){
        return vehicleAbstractFactory.createVehicle();
    }
}
