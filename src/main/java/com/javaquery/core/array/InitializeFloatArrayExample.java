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
public class InitializeFloatArrayExample {
    public static void main(String[] args) {
        /* Declare and Initialize float Array */
        float[] floatArray1 = {10.1f, 20.2f, 30.3f};
        
        System.out.println("Print value of float[]");
        /* Print value of array */
        for (float f : floatArray1) {
            System.out.println(f);
        }
        
        /**
         * Declare and Initialize Float Array.
         * Float can hold `null` values.
         */
        Float floatArray2[] = {10.1f, 20.2f, null};
        
        System.out.println("Print value of Float[]");
        /* Print value of array */
        for (Float f : floatArray2) {
            System.out.println(f);
        }
    }
}
