/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example: Assign same value to multiple variable.
 *
 * @author javaQuery
 * @date 2nd January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class AssignSameValue {

    public static void main(String[] args) {
        int red = 0, green = 0, blue = 0;

        String color = "white"; // args[0]

        if ("white".equalsIgnoreCase(color)) {
            /* assign same value to red, green, blue */
            red = green = blue = 255;
        } else if ("black".equalsIgnoreCase(color)) {
            /* assign same value to red, green, blue */
            red = green = blue = 0;
        } else {
            /* other else if...else for more color combinations */
        }

        System.out.println("Color code:");
        System.out.println("red = " + red + ", green = " + green + ", blue = " + blue);
    }
}
