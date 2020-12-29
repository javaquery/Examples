/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example: continue in Java loop
 *
 * @author javaQuery
 * @date 11th December, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class ContinueExample {

    public static void main(String[] args) {
        System.out.println("continue in for loop");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                /* Loop will skip current iteration when i == 2 */
                continue;
            }
            System.out.println("for-loop: " + i);
        }

        System.out.println("------------------------------------------");
        System.out.println("continue in for-each loop");

        int[] numbers = {0, 1, 2, 3, 4};
        for (int number : numbers) {
            if (number == 3) {
                /* Loop will skip current iteration when number == 3 */
                continue;
            }
            System.out.println("for-each loop: " + number);
        }

        System.out.println("------------------------------------------");
        System.out.println("continue in while loop");

        int i = 5;
        while (i > 0) {
            if (i == 1) {
                i--;
                /* Loop will skip current iteration when i == 1 */
                continue;
            }
            System.out.println("while loop: " + i);
            i--;
        }

        System.out.println("------------------------------------------");
        System.out.println("continue in do-while loop");

        int j = 5;
        do {
            if (j == 2) {
                j--;
                /* Loop will skip current iteration when j == 2 */
                continue;
            }
            System.out.println("do-while loop: " + j);
            j--;
        } while (j > 0);
    }
}
