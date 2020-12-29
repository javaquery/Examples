/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.basic;

/**
 * Example: Singleton by Bill Pugh.
 *
 * @author javaQuery
 * @date 24th July, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class SingletonBillPugh {

    /* private constructor */
    private SingletonBillPugh() {
    }

    /* static inner class */
    private static class LazyHolder{
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }
    
    /* get instance of SingletonBillPugh */
    public static SingletonBillPugh getInstance(){
        return LazyHolder.INSTANCE;
    }
}
