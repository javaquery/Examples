package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class PrivateAccessModifier {

    /**
     * Variable and Method
     * ----------------------------------
     * - can be accessed in current class.
     * - can be accessed from inner class PrivateInnerClass.
     */
    private int a = 10;

    private int sum(int x, int y){
        return x + y;
    }

    private class PrivateInnerClass{
        public void display(){
            System.out.println("PrivateInnerClass#display: [ a = "+ a + " ]");
        }
    }

    public static void main(String[] args) {
        PrivateAccessModifier privateAccessModifier = new PrivateAccessModifier();
        System.out.println("a = " + privateAccessModifier.a);
        System.out.println("a = " + privateAccessModifier.sum(10, 20));

        PrivateAccessModifier.PrivateInnerClass privateInnerClass = new PrivateAccessModifier().new PrivateInnerClass();
        privateInnerClass.display();
    }
}
