/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author javaQuery
 * @date 11th April, 2017
 * @Github: https://github.com/javaquery/Examples
 */
@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "country")
    private Capital capital;

    @OneToOne
    @JoinColumn(name = "primary_language_id", referencedColumnName = "id")
    private Language language;

    @OneToMany(mappedBy = "country" /*, fetch = FetchType.LAZY*/)
    Set<State> states = new HashSet<State>();
    
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

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Set<State> getStates() {
        return states;
    }

    public void setStates(Set<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", name=" + name + ", capital=" + capital + ", language=" + language + '}';
    }
}
