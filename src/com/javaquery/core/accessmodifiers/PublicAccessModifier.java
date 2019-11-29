package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class PublicAccessModifier {

    /**
     * Variable and Method
     * ----------------------------------
     * Can be accessed globally
     * - by creating new object of current class.
     * - accessed from inner class PublicInnerClass.
     * - accessed from child class which extends this class.
     */
    public int a = 10;

    public int sum(int x, int y){
        return x + y;
    }

    public class PublicInnerClass{
        public void display(){
            System.out.println("PublicInnerClass#display: [ a = "+ a + " ]");
        }
    }

    public static void main(String[] args) {
        PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
        System.out.println("a = " + publicAccessModifier.a);
        System.out.println("a = " + publicAccessModifier.sum(10, 20));

        PublicInnerClass publicInnerClass = new PublicAccessModifier().new PublicInnerClass();
        publicInnerClass.display();
    }
}
