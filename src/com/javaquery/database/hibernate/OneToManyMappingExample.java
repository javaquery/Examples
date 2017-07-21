/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.database.hibernate;

import com.javaquery.bean.Country;
import com.javaquery.bean.State;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate one to many example.
 * 
 * @author javaQuery
 * @date 15th June, 2017
 * @Github: https://github.com/javaquery/Examples
 */
public class OneToManyMappingExample {

    public static void main(String[] args) {
        try {
            /* Create hibernate configuration. */
            Configuration configuration = new Configuration();
            configuration.configure("com\\javaquery\\database\\hibernate\\hibernate.cfg.xml");

            /* Open session and begin database transaction for database operation. */
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();

            Country country = session.load(Country.class, 1L);
            if(!country.getStates().isEmpty()){
                for (State state: country.getStates()) {
                    System.out.println(state.getName());
                }
            }else{
                System.out.println("No states found!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
