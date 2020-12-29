/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.list;

import com.javaquery.bean.Item;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Summation of element in List using Stream api in java 8.
 *
 * @author javaQuery
 * @date 17th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ListStreamSum {

    public static void main(String[] args) {
        /* Summation of Integers in List */
        List<Integer> integers = new ArrayList<>(Arrays.asList(10, 20, 30));

        Integer integerSum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("summation: " + integerSum);

        /* Summation when you have list of beans */
        Item motoG = new Item("MotoG", 100.12);
        Item iPhone = new Item("iPhone", 200.12);

        List<Item> listBeans = new ArrayList<>(Arrays.asList(motoG, iPhone));

        Double doubleSum = listBeans.stream().mapToDouble(Item::getPrice).sum();
        System.out.println("summation: " + doubleSum);
    }
}
