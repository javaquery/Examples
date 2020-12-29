/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Get current working directory path.
 * @author javaQuery
 * @date 27th December, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class CurrentWorkingDirectory {

    public static void main(String[] args) {
        Path path = Paths.get("");
        String currentWorkingDirectory = path.toAbsolutePath().normalize().toString();
        System.out.println("Current working directory: " + currentWorkingDirectory);
    }
}
