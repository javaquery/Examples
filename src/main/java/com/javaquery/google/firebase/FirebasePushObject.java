/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.google.firebase;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.javaquery.bean.Item;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;

/**
 * Example of Firebase push.
 *
 * @author javaQuery
 * @date 22nd September, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class FirebasePushObject {
    
    public static void main(String[] args) {
        Item item = new Item();
        item.setId(1L);
        item.setName("MotoG");
        item.setPrice(100.12);
        
        // You can use List<Item> also.
        new FirebasePushObject().saveUsingPush(item);
    }
    
    private FirebaseDatabase firebaseDatabase;

    /**
     * initialize firebase.
     */
    private void initFirebase() {
        try {
            // .setDatabaseUrl("https://fir-66f50.firebaseio.com") - Firebase project url.
            // .setServiceAccount(new FileInputStream(new File("filepath"))) - Firebase private key file path.
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://fir-66f50.firebaseio.com")
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\Vicky\\Documents\\NetBeansProjects\\Examples\\src\\com\\javaquery\\google\\firebase\\Firebase-30f95674f4d5.json")))
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDatabase = FirebaseDatabase.getInstance();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Save item object in Firebase.
     * @param item 
     */
    private void saveUsingPush(Item item) {
        if (item != null) {
            initFirebase();
            
            /* Get database root reference */
            DatabaseReference databaseReference = firebaseDatabase.getReference("/");
            
            /* Get existing child or will be created new child. */
            DatabaseReference childReference = databaseReference.child("items");

            /**
             * The Firebase Java client uses daemon threads, meaning it will not prevent a process from exiting.
             * So we'll wait(countDownLatch.await()) until firebase saves record. Then decrement `countDownLatch` value
             * using `countDownLatch.countDown()` and application will continues its execution.
             */
            CountDownLatch countDownLatch = new CountDownLatch(1);
            
            /**
             * push()
             * Add to a list of data in the database. Every time you push a new node onto a list, 
             * your database generates a unique key, like items/unique-item-id/data
             */
            childReference.push().setValue(item, new DatabaseReference.CompletionListener() {

                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {
                    System.out.println("Record saved!");
                    // decrement countDownLatch value and application will be continues its execution.
                    countDownLatch.countDown();
                }
            });
            try {
                //wait for firebase to saves record.
                countDownLatch.await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
