/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.polymorphism;

/**
 * Example demonstrate Runtime Polymorphism.
 * 
 * @author javaQuery
 * @date 7th November, 2017
 * @Github: https://github.com/javaquery/Examples
 */
public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // super-class
        Animal animal = new Animal();
        animal.run();
        
        /***********************************************/
        /* sub-class `Dog` */
        /***********************************************/
        Dog dog = new Dog();
        dog.run();
        
        animal = dog;
        /**
         * animal.run()
         * It will call referenced object's `run()` method.
         * In this case, object of `Dog` class is referred.
         */
        animal.run(); // runtime polymorphism
        
        
        /***********************************************/
        /* sub-class `Cat` */
        /***********************************************/
        animal = new Cat();
        
         /**
         * animal.run()
         * It will call referenced object's `run()` method.
         * In this case, object of `Cat` class is referred.
         */
        animal.run(); // runtime polymorphism
        
        
        /***********************************************/
        /* sub-class `Horse` */
        /***********************************************/
        animal = new Horse();
        
         /**
         * animal.run()
         * It will call referenced object's `run()` method.
         * However in this case, object of `Horse` doesn't contain implementation of `run()` so method
         * from the super-class `Animal#run` will be called.
         */
        animal.run(); // runtime polymorphism
    }
}
