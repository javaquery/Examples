/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Example of SQL injection.
 * @author javaQuery
 * @date 8th November, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class PreparedStatementExample {
    public static void main(String[] args) {
        new PreparedStatementExample().getUser("12");
    }
    
    /**
     * Get user from database.
     * @param id
     * @return 
     */
    public List<Object> getUser(String id) {
        List<Object> result = new ArrayList<Object>();

        String sql = "SELECT * FROM users where id = ?;";

        /* prepare connection and execute query */
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vickythakor", "root", "root");
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1,Integer.parseInt(id)); // index of ? is '1', perform null/number check for 'id'
            //execute prepared statement
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return result;
    } 
}
