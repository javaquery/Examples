/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.map;

import com.javaquery.bean.Item;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Summation of element in Map using Stream api in java 8.
 *
 * @author javaQuery
 * @date 17th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class MapStreamSum {

    public static void main(String[] args) {
        /* Summation of Integers in Map */
        Map<String, Integer> integers = new HashMap<>();
        integers.put("A", 10);
        integers.put("B", 20);
        integers.put("C", 30);

        Integer integerSum = integers.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("summation: " + integerSum);

        /* Summation when you have List/Set in Map */
        Map<String, List<Integer>> listInMap = new HashMap<>();
        listInMap.put("even_numbers", new ArrayList<>(Arrays.asList(2, 4, 6)));

        integerSum = listInMap.values().stream()
                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                .sum();
        System.out.println("summation: " + integerSum);

        /* Summation when you have List/Set of beans in Map */
        Item motoG = new Item("MotoG", 100.12);
        Item iPhone = new Item("iPhone", 200.12);

        List<Item> items = new ArrayList<>(Arrays.asList(motoG, iPhone));

        Map<String, List<Item>> itemMap = new HashMap<>();
        itemMap.put("items", items);

        Double doubleSum = itemMap.values().stream()
                .flatMapToDouble(list -> list.stream().mapToDouble(Item::getPrice))
                .sum();
        System.out.println("summation: " + doubleSum);
    }
}
