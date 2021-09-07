package com.javaquery.core.exception;

/**
 * Example of ArithmeticException in java.
 * @author javaQuery
 * @date 2021-09-07
 * @Github: https://github.com/javaquery/Examples
 */
public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        int x = 10;
        int y = getY();
        System.out.println(x / y);
    }

    /**
     * This is example of getting value from some method call.
     * There is possibilities of getting value `0`.
     *
     * Java compiler can't identify such errors
     */
    public static int getY(){
        return 2-2;
    }
}
