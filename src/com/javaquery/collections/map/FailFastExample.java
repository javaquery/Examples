/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Example of Fail Fast using Map.
 * @author javaQuery
 * @date 4th August, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class FailFastExample {
    public static void main(String[] args) {
        Map<String, Double> carPrice = new HashMap<String, Double>();
        carPrice.put("Porsche", 100000D);
        carPrice.put("Ferrari", 200000D);

        /* Iterate over Map */
        for(Map.Entry<String, Double> car : carPrice.entrySet()){
            System.out.println("Car: " + car.getKey());
            System.out.println("Price: " + car.getValue());
            
            /* Will cause java.util.ConcurrentModificationException */
            carPrice.put("Lamborghini", 300000D);
        }
    }
}
