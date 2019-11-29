package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class DefaultAccessModifierSubClass extends DefaultAccessModifier{

    void displayFromSubClass(){
        /* You can access `a` from super class `DefaultAccessModifier`  */
        System.out.println("DefaultAccessModifierSubClass#display: [ a = "+ a + " ]");
    }

    public static void main(String[] args) {
        DefaultAccessModifierSubClass defaultSubClass = new DefaultAccessModifierSubClass();
        defaultSubClass.displayFromSubClass();

        /* You can access `sum` from super class `DefaultAccessModifier`  */
        System.out.println(defaultSubClass.sum(10, 30));

        /* You can access `DefaultInnerClass` from super class `DefaultAccessModifier`  */
        DefaultAccessModifier.DefaultInnerClass defaultInnerClass = new DefaultAccessModifier().new DefaultInnerClass();
        defaultInnerClass.display();
    }
}
