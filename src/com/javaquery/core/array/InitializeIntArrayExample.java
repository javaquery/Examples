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
public class InitializeIntArrayExample {
    public static void main(String[] args) {
        /* Declare and Initialize int Array */
        int intArray[] = {10, 20, 30};
        
        System.out.println("Print value of int[]");
        /* Print value of array */
        for (int i : intArray) {
            System.out.println(i);
        }
        
        /**
         * Declare and Initialize Integer Array.
         * Integer can hold `null` values.
         */
        Integer integerArray[] = {10, 20, null};
        
        System.out.println("Print value of Integer[]");
        /* Print value of array */
        for (Integer i : integerArray) {
            System.out.println(i);
        }
    }
}
