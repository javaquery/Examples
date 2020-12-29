/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example: continue with label in Java loop
 *
 * @author javaQuery
 * @date 11th December, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class ContinueWithLabel {

    public static void main(String[] args) {
        System.out.println("continue in loop using label");

        /* Label used to continue loop */
        rootForLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 2) {
                    System.out.println(">>>> skipped");
                    /* Loop will skip current iteration when i == 1 and j == 2 */
                    continue rootForLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("------------------------------------------");

        /* Label used to continue loop */
        parentForLoop:
        for (int l = 0; l < 2; l++) {

            childForLoop:
            for (int m = 0; m < 3; m++) {
                int n = 1;

                rootWhileLoop:
                while (n <= 2) {
                    if (l == 0 && m == 2) {
                        System.out.println(">>>> skipped");
                        /* Loop will skip current iteration when l == 0 && m == 2 */
                        continue childForLoop;
                    }
                    System.out.println("l = " + l + ", m = " + m + ", n = " + n);
                    n++;
                }
            }
        }
    }
}
