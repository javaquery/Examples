/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set to List example.
 *
 * @author javaQuery
 * @date 7th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class SetToList {

    public static void main(String[] args) {
        /* Create set of string */
        Set<String> strings = new HashSet<String>();
        strings.add("A");
        strings.add("B");

        /**
         * new ArrayList(Collection<? extends E> c) We created List of String so
         * we can initialize ArrayList using any collection that extends String.
         */
        List<String> list = new ArrayList<>(strings);
        for (String string : list) {
            System.out.println(string);
        }
    }
}
