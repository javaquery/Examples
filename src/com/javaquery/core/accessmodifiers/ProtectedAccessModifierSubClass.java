package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class ProtectedAccessModifierSubClass extends ProtectedAccessModifier{

    protected void displayFromSubClass(){
        /* You can access `a` from super class `ProtectedAccessModifier`  */
        System.out.println("ProtectedAccessModifierSubClass#display: [ a = "+ a + " ]");
    }

    public static void main(String[] args) {
        ProtectedAccessModifierSubClass protectedSubClass = new ProtectedAccessModifierSubClass();
        protectedSubClass.displayFromSubClass();

        /* You can access `sum` from super class `ProtectedAccessModifier`  */
        System.out.println(protectedSubClass.sum(10, 30));

        /* You can access `ProtectedInnerClass` from super class `ProtectedAccessModifier`  */
        ProtectedInnerClass protectedInnerClass = new ProtectedAccessModifier().new ProtectedInnerClass();
        protectedInnerClass.display();

        ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier(60);
    }
}
