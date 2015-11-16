/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.array;

public class InitializeLongArrayExample {
    public static void main(String[] args) {
        /* Declare and Initialize long Array */
        long longArray1[] = {10L, 20L, 30L};
        
        System.out.println("Print value of long[]");
        /* Print value of array */
        for (long l : longArray1) {
            System.out.println(l);
        }
        
        /**
         * Declare and Initialize Long Array.
         * Long can hold `null` values.
         */
        Long longArray2[] = {10L, 20L, null};
        
        System.out.println("Print value of Long[]");
        /* Print value of array */
        for (Long l : longArray2) {
            System.out.println(l);
        }
    }
}
