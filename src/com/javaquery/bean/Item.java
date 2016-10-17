/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.bean;

import java.util.Comparator;

public class Item {

    private Long id;
    private String name;
    private Double price;

    public Item() {
    }
    
    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Comparator<Item> orderByNameASC(){
        return new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if(o1 != null && o1.getName() != null
                        && o2 != null && o2.getName() != null){
                    return o1.getName().compareTo(o2.getName());
                }
                return -1;
            }
        };
    }
    
    public Comparator<Item> orderByNameDESC(){
        return new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if(o1 != null && o1.getName() != null
                        && o2 != null && o2.getName() != null){
                    return o2.getName().compareTo(o1.getName());
                }
                return -1;
            }
        };
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + '}';
    }
}
