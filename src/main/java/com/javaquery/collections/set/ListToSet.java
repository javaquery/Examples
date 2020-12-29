/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * List to Set example.
 *
 * @author javaQuery
 * @date 7th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ListToSet {

    public static void main(String[] args) {
        /* Create list of string */
        List<String> strings = new ArrayList<String>();
        strings.add("A");
        strings.add("B");

        /**
         * new HashSet(Collection<? extends E> c) We created Set of String so we
         * can initialize HashSet using any collection that extends String.
         */
        Set<String> stringSet = new HashSet<String>(strings);
        for (String string : stringSet) {
            System.out.println(string);
        }
    }
}
