/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.bean;

/**
 * Comparable item.
 * @author javaQuery
 * @date 11th August, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ComparableItem implements Comparable<ComparableItem>{

    private String name;
    private Double price;

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
    
    @Override
    public int compareTo(ComparableItem item) {
        if(item != null && item.getName() != null){
            return this.getName().compareTo(item.getName());
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ComparableItem{" + "name=" + name + ", price=" + price + '}';
    }
}
