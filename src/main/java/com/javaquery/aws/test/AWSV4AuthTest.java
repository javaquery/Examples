/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.aws.test;

import com.javaquery.aws.AWSV4Auth;
import java.util.Map;
import java.util.TreeMap;

/**
 * Example: Signing AWS Requests with Signature Version 4 in Java(Test class).
 * @reference: http://docs.aws.amazon.com/general/latest/gr/sigv4_signing.html
 * @author javaQuery
 * @date 19th January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class AWSV4AuthTest {
    public static void main(String[] args) {
        String url = "xxxxx-yyyyy-r6nvlhpscgdwms5.ap-northeast-1.es.amazonaws.com/inventory/simple/123";
        
        /**
         * Add host without http or https protocol.
         * You can also add other parameters based on your amazon service requirement.
         */
        TreeMap<String, String> awsHeaders = new TreeMap<String, String>();
        awsHeaders.put("host", "xxxxx-yyyyy-r6nvlhpscgdwms5.ap-northeast-1.es.amazonaws.com");
        
        AWSV4Auth aWSV4Auth = new AWSV4Auth.Builder("exampleKey", "exampleSecret")
                                           .regionName("xx-yy-zzz")
                                           .serviceName("es") // es - elastic search. use your service name
                                           .httpMethodName("GET") //GET, PUT, POST, DELETE, etc...
                                           .canonicalURI("/inventory/simple/123") //end point
                                           .queryParametes(null) //query parameters if any
                                           .awsHeaders(awsHeaders) //aws header parameters
                                           .payload(null) // payload if any
                                           .debug() // turn on the debug mode
                                           .build();
        
        /* Get header calculated for request */
        Map<String, String> header = aWSV4Auth.getHeaders();
        for (Map.Entry<String, String> entrySet : header.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            
            /* Attach header in your request */
            /* Simple get request */
            //HttpGet httpGet = new HttpGet(url);
            //httpGet.addHeader(key, value);
        }
        // execute httpGet
    }
}
