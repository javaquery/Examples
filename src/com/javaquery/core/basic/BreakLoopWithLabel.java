/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example: Break loop using label in Java
 *
 * @author javaQuery
 * @date 11th December, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class BreakLoopWithLabel {

    public static void main(String[] args) {

        System.out.println("break multiple loop using label");

        /* Label used to break loop anytime */
        rootForLoop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 2) {
                    break rootForLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("------------------------------------------");

        /* Label used to break loop anytime */
        rootWhileLoop:
        while (true) {

            parentForLoop:
            for (int m = 0; m < 10; m++) {

                childForLoop:
                for (int n = 0; n < 3; n++) {
                    if (m == 0 && n == 2) {
                        break rootWhileLoop;
                    }
                    System.out.println("m = " + m + ", n = " + n);
                }
            }
        }
    }
}
