/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.java.util;

import com.javaquery.bean.ComparableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Example of Comparable.
 * @author javaQuery
 * @date 11th August, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ComparableExample {

    public static void main(String[] args) {
        ComparableItem samsung = new ComparableItem();
        samsung.setName("samsung");

        ComparableItem iphone = new ComparableItem();
        iphone.setName("iphone");

        List<ComparableItem> comparableItems = new ArrayList<ComparableItem>(2);
        comparableItems.add(samsung);
        comparableItems.add(iphone);
        
        new ComparableExample().performSort(comparableItems);
    }

    /**
     * Print list to console
     *
     * @param items
     */
    private void printListData(List<ComparableItem> items) {
        for (ComparableItem item : items) {
            System.out.println(item);
        }
    }
    
    /**
     * Perform sort on give List
     * @param comparableItems 
     */
    private void performSort(List<ComparableItem> comparableItems){
        System.out.println("Before sort:");
        printListData(comparableItems);
        System.out.println("===============================================");
        Collections.sort(comparableItems);
        System.out.println("After sort(orderByNameASC):");
        printListData(comparableItems);
    }
}
