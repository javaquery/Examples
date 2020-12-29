/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.set;

import com.javaquery.bean.Item;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Summation of element in Set using Stream api in java 8.
 *
 * @author javaQuery
 * @date 17th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class SetStreamSum {

    public static void main(String[] args) {
        /* Summation of Integers in Set */
        Set<Integer> integers = new HashSet<>(Arrays.asList(10, 20, 30));

        Integer integerSum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("summation: " + integerSum);

        /* Summation when you have set of beans */
        Item motoG = new Item("MotoG", 100.12);
        Item iPhone = new Item("iPhone", 200.12);

        Set<Item> listBeans = new HashSet<>(Arrays.asList(motoG, iPhone));

        Double doubleSum = listBeans.stream().mapToDouble(Item::getPrice).sum();
        System.out.println("summation: " + doubleSum);
    }
}
