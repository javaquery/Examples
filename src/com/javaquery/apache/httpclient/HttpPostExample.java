/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.apache.httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Example: Apache HttpPost.
 * @author javaQuery
 * @date 23rd January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class HttpPostExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /* Create object of CloseableHttpClient */
        CloseableHttpClient httpClient = HttpClients.createDefault();

        /* Prepare POST request */
        HttpPost httpPost = new HttpPost("http://www.example.com/api/customer");
        /* Add headers to POST request */
        httpPost.addHeader("Authorization", "value");
        httpPost.addHeader("Content-Type", "application/json");
        
        /* Prepare StringEntity from JSON */
        StringEntity jsonData = new StringEntity("{\"id\":\"123\", \"name\":\"Vicky Thakor\"}", "UTF-8");
        /* Body of request */
        httpPost.setEntity(jsonData);
        
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
            String strResponse = httpClient.execute(httpPost, responseHandler);
            /* Print the response */
            System.out.println("Response: " + strResponse);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
