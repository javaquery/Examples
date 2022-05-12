package com.javaquery.designpattern.factory;

/**
 * @author javaquery
 * @github https://github.com/javaquery/Examples
 * @since 2021-10-31
 */
public abstract class Vehicle {
    public abstract String color();

    public abstract int tyres();

    public abstract int seatingCapacity();

    @Override
    public String toString() {
        return "Vehicle{color: " + this.color() + "; tyres: " + tyres() + "; seatingCapacity: " + seatingCapacity() + "}";
    }
}
