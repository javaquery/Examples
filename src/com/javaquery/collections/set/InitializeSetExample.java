/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author javaQuery
 * @date 29th October, 2015
 * Initialize Set in its declaration.
 */
public class InitializeSetExample {
    public static void main(String[] args) {
        /* Declare and Initialize Set of Integer */
        Set<Integer> setIntegers = new HashSet<Integer>(Arrays.asList(10, 20, 30));
        
        System.out.println("Print value of Set<Integer>");
        /* Print value of Set */
        for (Integer integer : setIntegers) {
            System.out.println(integer);
        }
        
        /* Declare and Initialize Set of String */
        Set<String> setStrings = new HashSet<>(Arrays.asList("Chirag", "Yogita", "Vicky", "Heer"));
        
        System.out.println("Print value of Set<String>");
        /* Print value of Set */
        for (String string : setStrings) {
            System.out.println(string);
        }
    }
}
