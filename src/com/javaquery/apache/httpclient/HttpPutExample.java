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
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Example: Apache HttpPut.
 *
 * @author javaQuery
 * @date 26th January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class HttpPutExample {

    public static void main(String[] args) {
        /* Create object of CloseableHttpClient */
        CloseableHttpClient httpClient = HttpClients.createDefault();

        /* Prepare put request */
        HttpPut httpPut = new HttpPut("http://www.example.com/api/customer");
        /* Add headers to get request */
        httpPut.addHeader("Authorization", "value");

        /* Prepare StringEntity from JSON */
        StringEntity jsonData = new StringEntity("{\"id\":\"123\", \"name\":\"Vicky Thakor\"}", "UTF-8");
        /* Body of request */
        httpPut.setEntity(jsonData);
        
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
            String strResponse = httpClient.execute(httpPut, responseHandler);
            /* Print the response */
            System.out.println("Response: " + strResponse);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
