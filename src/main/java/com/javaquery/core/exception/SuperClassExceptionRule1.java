package com.javaquery.core.exception;

/**
 * Example of SuperClassExceptionRule1 in java.
 * @author javaQuery
 * @date 2021-09-07
 * @Github: https://github.com/javaquery/Examples
 */
public class SuperClassExceptionRule1 {

    public void methodWithoutException(){
        System.out.println("methodWithoutException");
    }

    public static void main(String[] args) {
        System.out.printf("SuperClassExceptionRule1");
    }

    public class ChildClassExceptionRule1 extends SuperClassExceptionRule1{

//        Compile time error when tried to throw checked exception
//        @Override
//        public void methodWithoutException() throws Exception{
//            super.methodWithoutException();
//        }

        // Allowed to throw unchecked exception (i.e Any RuntimeException)
        @Override
        public void methodWithoutException() throws RuntimeException{
            super.methodWithoutException();
        }
    }
}
