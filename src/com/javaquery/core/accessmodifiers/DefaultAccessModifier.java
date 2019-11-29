package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
class DefaultAccessModifier {

    /**
     * Variable and Method
     * ----------------------------------
     * - can be accessed by creating new object of current class.
     * - accessed from inner class PublicInnerClass.
     * - accessed from child class which extends this class.
     */
    int a = 10;

    int sum(int x, int y){
        return x + y;
    }

    class DefaultInnerClass{
        public void display(){
            System.out.println("PublicInnerClass#display: [ a = "+ a + " ]");
        }
    }

    public static void main(String[] args) {
        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        System.out.println("a = " + defaultAccessModifier.a);
        System.out.println("a = " + defaultAccessModifier.sum(10, 20));

        DefaultAccessModifier.DefaultInnerClass defaultInnerClass = new DefaultAccessModifier().new DefaultInnerClass();
        defaultInnerClass.display();
    }
}
