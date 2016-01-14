/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.aws.elasticsearch;

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
 * Example: Amazon ElasticSearch service get record.
 * @author javaQuery
 * @date 14th January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class GetExample {

    public static void main(String[] args) {
        /**
         * Amazon ElasticSearch Service URL:
         * endpoint + / + {index_name} + / + {type} + / + {id}
         */
        String elastic_search_url = "http://xxxxx-yyyyy-r6nvlhpscgdwms5.ap-northeast-1.es.amazonaws.com/inventory/simple/123";

        /* Prepare delete request */
        HttpGet httpGet = new HttpGet(elastic_search_url);
        /* Execute get request */
        httpGetRequest(httpGet);
    }

    /**
     * Perform get request.
     * @param httpGet
     */
    public static void httpGetRequest(HttpGet httpGet) {
        /* Create object of CloseableHttpClient */
        CloseableHttpClient httpClient = HttpClients.createDefault();

        /* Response handler for after request execution */
        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

            @Override
            public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                /* Get status code */
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    /* Convert response to String */
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            }
        };

        try {
            /* Execute URL and attach after execution response handler */
            String strResponse = httpClient.execute(httpGet, responseHandler);
            /* Print the response */
            System.out.println("Response: " + strResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
