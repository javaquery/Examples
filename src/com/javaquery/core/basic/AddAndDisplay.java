/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example of method overriding.
 *
 * @author javaQuery
 * @date 6th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class AddAndDisplay extends Addition {

    /**
     * Method override of class Addition.
     * We're overriding 'add' method because we want to print
     * values of 'x' and 'y' to console along with the 'result'.
     * @param x
     * @param y
     * @return
     */
    @Override
    public int add(int x, int y) {
        int result = x + y;
        System.out.println("(x:" + x + ",y:" + y + ")");
        System.out.println("result: " + result);
        return result;
    }
}
