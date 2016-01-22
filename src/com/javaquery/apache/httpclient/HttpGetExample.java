/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.apache.httpclient;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Example: Apache HttpGet.
 * @author javaQuery
 * @date 22nd January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class HttpGetExample {

    public static void main(String[] args) {
        /* Create object of CloseableHttpClient */
        CloseableHttpClient httpClient = HttpClients.createDefault();

        /* Prepare get request */
        HttpGet httpGet = new HttpGet("http://www.example.com/api/customer");
        /* Add headers to get request */
        httpGet.addHeader("Authorization", "value");
        httpGet.addHeader("Content-Type", "application/json");
        
        /* Response handler for after request execution */
        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

            @Override
            public String handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
                /* Get status code */
                int httpResponseCode = httpResponse.getStatusLine().getStatusCode();
                System.out.println("Response code: " + httpResponseCode);
                if (httpResponseCode >= 200 && httpResponseCode < 300) {
                    /* Convert response to String */
                    HttpEntity entity = httpResponse.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    return null;
                    /* throw new ClientProtocolException("Unexpected response status: " + httpResponseCode); */
                }
            }
        };

        try {
            /* Execute URL and attach after execution response handler */
            String strResponse = httpClient.execute(httpGet, responseHandler);
            /* Print the response */
            System.out.println("Response: " + strResponse);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
