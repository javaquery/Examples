/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author javaQuery
 * @date 1th April, 2017
 * @Github: https://github.com/javaquery/Examples
 */
@Entity
@Table(name = "languages")
public class Language implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "language")
    private String language;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Language{" + "id=" + id + ", language=" + language + '}';
    }
}
