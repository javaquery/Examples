/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.java.util;

import java.util.Scanner;

/**
 * Example of scanner in Java.
 * @author javaQuery
 * @date 27th December, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        System.out.println("Enter random number(Read interger from console):");
        int number = scanner.nextInt();
        
        System.out.println("[Username:" + username + ", Password: " + password + ", Number: " + number + "]");
    }
}
