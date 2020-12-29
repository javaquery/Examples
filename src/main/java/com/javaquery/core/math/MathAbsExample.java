package com.javaquery.core.math;

/**
 * Example: Math.abs
 * @author javaQuery
 * @date 31st December, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class MathAbsExample {

    public static void main(String[] args) {
        int x = 1, y = -2;

        System.out.println("Before:");
        System.out.println("x = " + x + ", y = " + y);

        /**
         * Math.abs(int a)
         * Returns the absolute value of an int value. 
         *  - If the argument is not negative, the argument is returned. 
         *  - If the argument is negative, the negation of the argument is returned.
         * 
         * Math.abs(int a) => return 'int'
         * Math.abs(long a) => return 'long'
         * Math.abs(float a) => return 'float'
         * Math.abs(double a) => return 'double'
         */
        x = Math.abs(x);
        y = Math.abs(y);
        
        System.out.println("After:");
        System.out.println("x = " + x + ", y = " + y);
    }
}
