/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.google.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.javaquery.bean.Item;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Convert json string to java object using gson.
 * @author javaQuery
 * @date 24th March, 2017
 * @Github: https://github.com/javaquery/Examples
 */
public class JSONToObject {
    public static void main(String[] args) {
        String jsonObjectString = "{\"name\":\"iPhone 7\",\"price\":100.12}";
        String jsonArrayString = "[{\"name\":\"iPhone 7\",\"price\":100.12},{\"name\":\"Black Berry\",\"price\":50.12}]";
        
        Gson gson = new Gson();
        
        /* Convert JSONObject String to Object */
        Item item = gson.fromJson(jsonObjectString, Item.class);
        System.out.println(item);
        
        /* Convert JSONArray String to Object */
        Type type = new TypeToken<List<Item>>(){}.getType();
        List<Item> items = gson.fromJson(jsonArrayString, type);
        System.out.println(items);
    }
}
