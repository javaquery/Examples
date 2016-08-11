/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.array;

/**
 * @author javaQuery
 * @Github: https://github.com/javaquery/Examples
 */
public class InitializeDoubleArrayExample {
    public static void main(String[] args) {
        /* Declare and Initialize double Array */
        double[] doubleArray1 = {10.1D, 20.2D, 30.3D};
        
        System.out.println("Print value of double[]");
        /* Print value of array */
        for (double d : doubleArray1) {
            System.out.println(d);
        }
        
        /**
         * Declare and Initialize Double Array.
         * Double can hold `null` values.
         */
        Double doubleArray2[] = {10.1D, 20.2D, null};
        
        System.out.println("Print value of Double[]");
        /* Print value of array */
        for (Double d : doubleArray2) {
            System.out.println(d);
        }
    }
}
