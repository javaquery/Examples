package com.javaquery.malicious.json;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * Example of formating raw JSON
 * @author Vicky Thakor
 */
public class PrettifyJSONExample {
    public static void main(String[] args) {
        try {
            String json = "{\"candidate\" : \"Vicky Thakor\", \"expertise\" : [\"Core Java\", \"J2EE\", \"Design Pattern\"]}";
            System.out.println("Unformatter json:" + json);
            /* Create required objects */
            ObjectMapper objectMapper = new ObjectMapper();
            Object object = objectMapper.readValue(json, Object.class);
            ObjectWriter objectWriter = objectMapper.writer().withDefaultPrettyPrinter();
            /* Get the formatted json */
            String formattedJSON = objectWriter.writeValueAsString(object);
            System.out.println("Formatter json:\n"+formattedJSON);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
