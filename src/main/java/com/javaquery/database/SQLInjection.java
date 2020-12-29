package com.javaquery.database;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of SQL injection.
 * @author javaQuery
 * @date 8th November, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class SQLInjection {

    public static void main(String[] args) {
        /* You are getting parameter value from web page or other user input */
        String parameter = "12"; // normal condition
        new SQLInjection().getUser(parameter);

        /**
         * SQL injection using parameter value. 
         * - If user can change parameter in url, use some script, etc...
         */
        parameter = "12 or 1 = 1";
        new SQLInjection().getUser(parameter);
    }

    /**
     * Get user from database.
     * @param id
     * @return 
     */
    public List<Object> getUser(String id) {
        List<Object> result = new ArrayList<Object>();

        String sql = "SELECT * FROM users where id = " + id + ";";
        System.out.println("SQL Query: " + sql);

        /* prepare connection and execute query */
        return result;
    }
}
