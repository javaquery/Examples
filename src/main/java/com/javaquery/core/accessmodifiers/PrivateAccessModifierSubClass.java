package com.javaquery.core.accessmodifiers;

/**
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class PrivateAccessModifierSubClass extends PrivateAccessModifier {
    private void displayFromSubClass(){
        /* You can not access `a` from super class `PrivateAccessModifier`  */
        // System.out.println("PrivateAccessModifierSubClass#display: [ a = "+ a + " ]");
    }

    public static void main(String[] args) {
        PrivateAccessModifierSubClass privateSubClass = new PrivateAccessModifierSubClass();
        privateSubClass.displayFromSubClass();

        /* You can not access `sum` from super class `PrivateAccessModifier`  */
       // privateSubClass.sum(10, 30);

        /* You can not access `PrivateInnerClass` from super class `PrivateAccessModifier`  */
        // PrivateInnerClass privateInnerClass = new PrivateAccessModifier().new PrivateInnerClass();
    }
}
