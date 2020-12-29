package com.javaquery.core.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example: String to Date in Java
 * @author javaQuery
 * @date 22nd November, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class StringToDateExample {

    public static void main(String[] args) throws ParseException {
        /**
         * parseDate(StringDate, PatternToParse) 
         */
        parseDate("20151225", "yyyyMMdd");
        parseDate("2015.12.25", "yyyy.MM.dd");
        parseDate("2015-12-25", "yyyy-MM-dd");
        parseDate("2015/12/25", "yyyy/MM/dd");
        
        parseDate("25122015", "ddMMyyyy");
        parseDate("25.12.2015", "dd.MM.yyyy");
        parseDate("25-12-2015", "dd-MM-yyyy");
        parseDate("25/12/2015", "dd/MM/yyyy");
        parseDate("25/12/2015 15:10:05", "dd/MM/yyyy HH:mm:ss");
        
        parseDate("2015-12-25 15:10:05", "yyyy-MM-dd HH:mm:ss");
        parseDate("2015-12-25 15:10", "yyyy-MM-dd HH:mm");
        parseDate("2015-12-25T15:20:25Z", "yyyy-MM-dd'T'HH:mm:ss'Z'");
        parseDate("2015-12-25 15:10Z", "yyyy-MM-dd HH:mm'Z'");
        parseDate("2013-12-25T15:25:30-05:00", "yyyy-MM-dd'T'HH:mm:ssXXX");
        parseDate("2015-06-26T05:27:05.000Z", "yyyy-MM-dd'T'HH:mm:ss.'000Z'");
    }

    /**
     * Method to parse StringDate to {@link Date}.
     * @param strDate
     * @param pattern
     * @return {@link Date}
     */
    public static Date parseDate(String strDate, String pattern) {
        /* Return object of Date */
        Date date = null;
        /* Get DateFormatter for given pattern */
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            /* Parse String to java.util.Date */
            date = dateFormat.parse(strDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
            date = null;
        }
        /* Print the StringDate, Pattern and converted java Date */
        System.out.println("Date: " + strDate + ", Pattern: " + pattern + " -> java.util.Date[" + date + "]");
        return date;
    }
}
