package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class ProtectedAccessModifier {
    /**
     * Variable and Method
     * ----------------------------------
     * - can be accessed by creating new object of current class in same package.
     * - can be accessed from inner class ProtectedInnerClass.
     * - can be accessed from child class which extends this class.
     */
    protected int a = 10;

    protected int sum(int x, int y){
        return x + y;
    }

    protected ProtectedAccessModifier(int a){
        this.a = a;
    }

    public ProtectedAccessModifier(){}

    protected class ProtectedInnerClass{
        public void display(){
            System.out.println("ProtectedInnerClass#display: [ a = "+ a + " ]");
        }
    }

    public static void main(String[] args) {
        ProtectedAccessModifier publicAccessModifier = new ProtectedAccessModifier();
        System.out.println("a = " + publicAccessModifier.a);
        System.out.println("a = " + publicAccessModifier.sum(10, 20));

        ProtectedAccessModifier.ProtectedInnerClass publicInnerClass = new ProtectedAccessModifier().new ProtectedInnerClass();
        publicInnerClass.display();
    }
}
