package com.javaquery.designpattern.abstractfactory;

import com.javaquery.designpattern.factory.Car;
import com.javaquery.designpattern.factory.Truck;
import com.javaquery.designpattern.factory.Vehicle;

/**
 * @author javaquery
 * @since 2021-10-31
 * @github https://github.com/javaquery/Examples
 */
public class TruckFactory extends VehicleAbstractFactory{

    private final String color;
    private final int tyres;
    private final int seatingCapacity;

    public TruckFactory(String color, int tyres, int seatingCapacity) {
        this.color = color;
        this.tyres = tyres;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public Vehicle createVehicle() {
        return new Truck(color, tyres, seatingCapacity);
    }
}
