/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.core.Thread;

/**
 * Thread join example.
 * @author javaQuery
 * @date 29th August, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MessageThread());
        // start MessageThread.
        t.start();
        /**
         * Main Thread (ThreadJoinExample) will wait for 't' to finish 
         * its task in 5 seconds of it will leave.
         */
        t.join(5000);
        
        /**
         * Main Thread (ThreadJoinExample) will wait until 't' finish its task.
         */
        // t.join(); 
        System.out.println("Main Thread left(finish).");
    }
}
