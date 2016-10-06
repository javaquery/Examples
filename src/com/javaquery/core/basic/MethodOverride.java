/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example of method overriding.
 *
 * @author javaQuery
 * @date 6th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class MethodOverride {
    public static void main(String[] args) {
        /* Add two number using super class Addition's add method */
        Addition addition1 = new Addition();
        int result = addition1.add(20, 30);
        System.out.println("calling Addition.add(int x, int y)");
        System.out.println("result: " + result);
        System.out.println("********************************************");
        
        System.out.println("calling AddAndDisplay.add(int x, int y)");
        Addition addition2 = new AddAndDisplay();
        /**
         * Notice: We created object of 'Addition' using 'AddAndDisplay'.
         * 
         * So when we call Addition.add(int x, int y) method it'll execute
         * AddAndDisplay.add(int x, int y) method because 'add' is 
         * overridden. 
         * 
         * It'll hide the superclass Addition's add method and execute
         * subclass AddAndDisplay's method.
         */
        addition2.add(10, 20);
    }
}
