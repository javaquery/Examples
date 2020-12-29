/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.google.gson;

import com.google.gson.Gson;
import com.javaquery.bean.Item;
import java.util.Arrays;
import java.util.List;

/**
 * Convert Java object to json using gson.
 * @author javaQuery
 * @date 24th March, 2017
 * @Github: https://github.com/javaquery/Examples
 */
public class ObjectToJSON {
    public static void main(String[] args) {
        /* Java object */
        Item iPhone = new Item("iPhone 7", 100.12);
        Item blackBerry = new Item("Black Berry", 50.12);
        List<Item> items = Arrays.asList(iPhone, blackBerry);
        
        Gson gson = new Gson();
        
        /* Convert single Object to JSON */
        String jsonObjectString = gson.toJson(iPhone);
        System.out.println(jsonObjectString);
        
        /* Convert List of Object to JSON */
        String jsonArrayString = gson.toJson(items);
        System.out.println(jsonArrayString);
    }
}
