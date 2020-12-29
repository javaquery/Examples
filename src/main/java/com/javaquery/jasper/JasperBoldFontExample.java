/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaquery.jasper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 * Example: Make bold font in jasper report pdf?
 * @author javaQuery
 * @date 22nd November, 2015
 * @Github: https://github.com/javaquery/Examples
 */
public class JasperBoldFontExample {
    public static void main(String[] args) {
        try {
            /* User home directory location */
            String userHomeDirectory = System.getProperty("user.home");
            /* Output file location */
            String outputFile = userHomeDirectory + File.separatorChar + "JasperBoldFont.pdf";
            
            /* Using compiled version(.jasper) of Jasper report to generate PDF */
            JasperPrint jasperPrint = JasperFillManager.fillReport("resources/com/javaquery/jasper/templates/template_boldFont.jasper", new HashMap(), new JREmptyDataSource());
            
            /* outputStream to create PDF */
            OutputStream outputStream = new FileOutputStream(new File(outputFile)); 
            /* Write content to PDF file */
            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream); 
        } catch (JRException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
