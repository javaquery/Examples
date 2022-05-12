package com.javaquery.designpattern.factory;

/**
 * @author javaquery
 * @since 2021-10-31
 * @github https://github.com/javaquery/Examples
 */
public class Car extends Vehicle{

    private final String color;
    private final int tyres;
    private final int seatingCapacity;

    public Car(String color, int tyres, int seatingCapacity) {
        this.color = color;
        this.tyres = tyres;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String color() {return this.color;}

    @Override
    public int tyres() {
        return this.tyres;
    }

    @Override
    public int seatingCapacity() {return this.seatingCapacity;}
}
