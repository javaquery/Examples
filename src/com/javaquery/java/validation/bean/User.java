/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.java.validation.bean;

import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author javaQuery
 * @since 2018-02-24
 * @github: https://github.com/javaquery/Examples
 */
public class User {

    @NotEmpty(message = "firstName can not be empty")
    @Size(min = 2, max = 20, message = "firstName length must be between 2 and 20")
    private String firstName;

    @NotEmpty(message = "lastName can not be empty")
    @Size(min = 2, max = 20, message = "lastName length must be between 2 and 20")
    private String lastName;

    @NotEmpty(message = "nickNames can not be empty")
    private List<@Size(min = 2, message = "nickName length must be greater than 2") String> nickNames;
    
    @Email
    private String email;

    @NotEmpty(message = "password can not be empty")
    @Size(min = 6, message = "password length must be at least 6 character")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(List<String> nickNames) {
        this.nickNames = nickNames;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
