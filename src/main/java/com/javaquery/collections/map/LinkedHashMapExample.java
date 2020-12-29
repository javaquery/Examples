package com.javaquery.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap Example.
 * @author javaQuery
 * @date 2019-11-29
 * @Github: https://github.com/javaquery/Examples
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        /* Check value of before, after and next to understand example */
        map.put("AaAaAa", "JJJ");
        /**
         * Current bucket data visualization
         *
         * bucket-index: 2
         * EntryObject1 [before = null, hash = 123, key = AaAaAa, value = JJJ, next = null, after = null]
         */

        map.put("xyz", "KKK");
        /**
         * Current bucket data visualization
         *
         * bucket-index: 2
         * EntryObject1 [before = null, hash = 123, key = AaAaAa, value = JJJ, next = null, after = EntryObject2]
         *
         * bucket-index: 11
         * EntryObject2 [before = EntryObject1, hash = 456, key = xyz, value = KKK, next = null, after = null]
         */

        /* since hashcode of 'AaAaBB' is same as 'AaAaAa' so it be added at 2nd index in bucket */
        map.put("AaAaBB", "LLL");
        /**
         * Current bucket data visualization
         *
         * bucket-index: 2
         * [
         *  EntryObject1 [before = null, hash = 123, key = AaAaAa, value = JJJ, next = EntryObject3, after = EntryObject2]
         *  EntryObject3 [before = EntryObject2, hash = 123, key = AaAaBB, value = LLL, next = null, after = null]
         * ]
         *
         * bucket-index: 11
         * EntryObject2 [before = EntryObject1, hash = 456, key = xyz, value = KKK, next = null, after = EntryObject3]
         */
    }
}
