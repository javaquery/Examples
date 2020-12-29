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
public class InitializeBooleanArrayExample {
    public static void main(String[] args) {
        /* Declare and Initialize boolean Array */
        boolean[] booleanArray1 = {true, false};
        
        System.out.println("Print value of boolean[]");
        /* Print value of array */
        for (boolean b : booleanArray1) {
            System.out.println(b);
        }
        
        /**
         * Declare and Initialize Boolean Array.
         * Boolean can hold `null` values.
         */
        Boolean booleanArray2[] = {true, false, null};
        
        System.out.println("Print value of Boolean[]");
        /* Print value of array */
        for (Boolean b : booleanArray2) {
            System.out.println(b);
        }
    }
}
