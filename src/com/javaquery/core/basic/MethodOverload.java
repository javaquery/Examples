/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example of method overloading
 *
 * @author javaQuery
 * @date 5th October, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class MethodOverload {

    public int x = 0;

    /**
     * Method overloading - Same method name(getAndIncrement) with no parameter.
     * Increment x by 1.
     *
     * @return
     */
    public int getAndIncrement() {
        x = x + 1; // you can also use like x = getAndIncrement(1);
        return x;
    }

    /**
     * Method overloading - Same method name(getAndIncrement) with parameter.
     * Increment x by given count(value).
     *
     * @param add
     * @return
     */
    public int getAndIncrement(int add) {
        x = x + add;
        return x;
    }

    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();
        System.out.println("calling 'getAndIncrement()': " + methodOverload.getAndIncrement());
        System.out.println("calling 'getAndIncrement(int add)': " + methodOverload.getAndIncrement(2));
    }
}
