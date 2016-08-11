/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.java.util;

import com.javaquery.bean.Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Example of Comparator.
 * @author javaQuery
 * @date 9th August, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ComparatorExample {

    public static void main(String[] args) {
        Item samsung = new Item();
        samsung.setName("samsung");

        Item iPhone = new Item();
        iPhone.setName("iphone");

        List<Item> items = new ArrayList<Item>(2);
        items.add(samsung);
        items.add(iPhone);

        List<Item> clonedItems = new ArrayList<Item>(items);
        new ComparatorExample().usingPredefinedComparator(clonedItems);
        new ComparatorExample().usingInLineExpression(clonedItems);
        new ComparatorExample().usingLambdaExpression(new ArrayList<Item>(items));
    }

    /**
     * Print list to console
     *
     * @param items
     */
    private void printListData(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    /**
     * Considering you've already created Comparators in your model.
     *
     * @param items
     */
    private void usingPredefinedComparator(List<Item> items) {
        System.out.println("Using Predefined Comparator (NAME#ASC)");
        System.out.println("===============================================");
        System.out.println("Before sort:");
        printListData(items);
        System.out.println("After sort(orderByNameASC):");
        Collections.sort(items, new Item().orderByNameASC());
        printListData(items);
    }
    
    /**
     * This is same as PredefinedComparator. 
     * Its only to show you how to use {@link Comparator} in-line.
     * @param items 
     */
    private void usingInLineExpression(List<Item> items){
        System.out.println("===============================================");
        System.out.println("Using Inline Expression (NAME#DESC)");
        System.out.println("===============================================");
        System.out.println("Before sort:");
        printListData(items);
        System.out.println("After sort(orderByNameDESC):");
        Collections.sort(items, new Comparator<Item>(){

            @Override
            public int compare(Item o1, Item o2) {
                if(o1 != null && o1.getName() != null
                        && o2 != null && o2.getName() != null){
                    return o2.getName().compareTo(o1.getName());
                }
                return -1;
            }
             
        });
        printListData(items);
    }
    
    /**
     * Using Lambda Expression in Java 1.8 or above.
     * @param items 
     */
    private void usingLambdaExpression(List<Item> items){
        System.out.println("===============================================");
        System.out.println("Using Lambda Expression (NAME#DESC)");
        System.out.println("===============================================");
        System.out.println("Before sort:");
        printListData(items);
        System.out.println("After sort(orderByNameASC):");
        Collections.sort(items, (Item o1, Item o2) -> {
            if(o1 != null && o1.getName() != null
                    && o2 != null && o2.getName() != null){
                return o1.getName().compareTo(o2.getName());
            }
            return -1;
        });
        printListData(items);
    }
}
