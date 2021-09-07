package com.javaquery.core.exception;

/**
 * Example of SuperClassExceptionRule2 in java.
 * @author javaQuery
 * @date 2021-09-07
 * @Github: https://github.com/javaquery/Examples
 */
public class SuperClassExceptionRule2 {

    public void methodWithException() throws IllegalArgumentException{
        System.out.println("methodWithException");
    }

    public static void main(String[] args) {
        System.out.printf("SuperClassExceptionRule2");
    }

    public class ChildClassExceptionRule2 extends SuperClassExceptionRule2 {

//        Compile time error when tried to throw parent exception
//        @Override
//        public void methodWithException() throws Exception{
//            super.methodWithException();
//        }

        // Allowed to throw original exception (IllegalArgumentException)
        // or child exception of IllegalArgumentException
        @Override
        public void methodWithException() throws NumberFormatException{
            super.methodWithException();
        }
    }

    public class ChildClassExceptionRule22 extends SuperClassExceptionRule2 {

        // Allowed not to throw any exception
        @Override
        public void methodWithException(){
            super.methodWithException();
        }
    }
}
