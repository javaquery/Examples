package com.javaquery.core.exception;

/**
 * Example of StackOverflowError in java.
 * @author javaQuery
 * @date 2021-09-07
 * @Github: https://github.com/javaquery/Examples
 */
public class StackOverflowErrorExample {
    private static void recursion(int i){
        if(i == 0){
            System.out.println("Not reachable code");
        }else{
            recursion(i++);
        }
    }

    public static void main(String[] args) {
        recursion(10);
    }
}
