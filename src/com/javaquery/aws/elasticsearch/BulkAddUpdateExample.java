/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.aws.elasticsearch;

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
 * Example: Amazon ElasticSearch service bulk add/update record.
 * @author javaQuery
 * @date 14th January, 2016
 * @Github: https://github.com/javaquery/Examples
 */
public class BulkAddUpdateExample {
     public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * Amazon ElasticSearch Service URL:
         * endpoint + / + {index_name} + / + _bulk
         */
        String elastic_search_url = "http://xxxxx-yyyyy-r6nvlhpscgdwms5.ap-northeast-1.es.amazonaws.com/inventory/_bulk";
        
        /**
         * Records to add in elastic search
         * Important Note: For elastic search bulk add and update, it should be in following format.
         * 
         * {header} + {new_line} // Header for next line json document
         * {jsonDocument} + {new_line}
         * {header} + {new_line}
         * {jsonDocument} + {new_line}
         * 
         * New line at the end of String is compulsory.
         */
        String header_one = "{\"index\":{\"_index\":\"inventory\",\"_type\":\"simple\",\"_id\":\"123\"}}\n";
        String jsonDocument_one = "{\"id\": \"123\", \"name\": \"Apple iPhone 6s\", \"stock\" : 10}\n";
        String header_two = "{\"index\":{\"_index\":\"inventory\",\"_type\":\"simple\",\"_id\":\"456\"}}\n";
        String jsonDocument_two = "{\"id\": \"456\", \"name\": \"Apple iPhone 5s\", \"stock\" : 15}\n";
        
        String jsonDocumentBulk = header_one + jsonDocument_one + header_two + jsonDocument_two;
        
        /* Convert jsonDocument to apache StringEntity */
        StringEntity payload = new StringEntity(jsonDocumentBulk);
        
        /* Prepare post request to add record */
        HttpPost httpPost = new HttpPost(elastic_search_url);
        /* Attach payload */
        httpPost.setEntity(payload);
        /* Execute post request */
        httpPostRequest(httpPost);
    }

    /**
     * Perform post request.
     * @param httpPost 
     */
    public static void httpPostRequest(HttpPost httpPost) {
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
            String strResponse = httpClient.execute(httpPost, responseHandler);
            /* Print the response */
            System.out.println("Response: " + strResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
