/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example: Break loop in Java
 *
 * @author javaQuery
 * @date 11th December, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class BreakLoopExample {

    public static void main(String[] args) {
        System.out.println("break(stop) for loop");
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                /* Loop will be terminated when i == 2 */
                break;
            }
            System.out.println("for-loop: " + i);
        }

        System.out.println("------------------------------------------");
        System.out.println("break(stop) for-each loop");

        int[] numbers = {0, 1, 2, 3, 4};
        for (int number : numbers) {
            if (number == 2) {
                /* Loop will be terminated when i == 2 */
                break;
            }
            System.out.println("for-each loop: " + number);
        }

        System.out.println("------------------------------------------");
        System.out.println("break(stop) while loop");

        int i = 10;
        while (i > 0) {
            if (i == 8) {
                /* Loop will be terminated when i == 8 */
                break;
            }
            System.out.println("while loop: " + i);
            i--;
        }

        System.out.println("------------------------------------------");
        System.out.println("break(stop) do-while loop");

        int j = 10;
        do {
            if (j == 8) {
                /* Loop will be terminated when j == 8 */
                break;
            }
            System.out.println("do-while loop: " + j);
            j--;
        } while (j > 0);
    }
}
