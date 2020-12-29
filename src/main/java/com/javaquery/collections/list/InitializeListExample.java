/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Initialize List in its declaration.
 * @author javaQuery
 * @date 29th October, 2015 
 * @Github: https://github.com/javaquery/Examples
 */
public class InitializeListExample {

    public static void main(String[] args) {
        /* Declare and Initialize List of Integer */
        List<Integer> listIntegers = new ArrayList<Integer>(Arrays.asList(10, 20, 30));

        System.out.println("Print value of List<Integer>");
        /* Print value of List */
        for (Integer integer : listIntegers) {
            System.out.println(integer);
        }

        /* Declare and Initialize List of String */
        List<String> listStrings = new ArrayList<String>(Arrays.asList("Chirag", "Yogita", "Vicky", "Heer"));

        System.out.println("Print value of List<String>");
        /* Print value of List */
        for (String string : listStrings) {
            System.out.println(string);
        }
    }
}
