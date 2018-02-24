/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.java.validation;

import com.javaquery.java.validation.bean.User;
import java.util.Arrays;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author javaQuery
 * @since 2018-02-24
 * @github: https://github.com/javaquery/Examples
 */
public class ValidatorFactoryExample {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Vicky");
        user.setNickNames(Arrays.asList("vicks", "v"));
        user.setEmail("not-an-email");
        user.setPassword("1234567");
        
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        
        for (ConstraintViolation<User> violation : violations) {
            System.err.println(violation.getMessage());
        }
    }
}
