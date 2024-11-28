package ca.bcit.comp1510.ch05;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Demonstrates the use of Scanner to read file input and parse it using
 * alternative delimiters.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class URLDissector {

    /**
     * Reads URLs from a file and prints their path components.
     * @param args command line arguments (unused)
     * @throws IOException if there is an error reading the file
     */
    public static void main(String[] args) throws FileNotFoundException {
        String url;
        Scanner fileScan;
        Scanner urlScan;

        fileScan = new Scanner(
                new File("resources/urls.inp"));

        // Reads and processes each line of the file
        while (fileScan.hasNext()) {
            
            url = fileScan.nextLine();
            System.out.println("URL: " + url);

            urlScan = new Scanner(url);
            urlScan.useDelimiter("[/?&]");

            // Prints each part of the URL
            while (urlScan.hasNext()) {
                System.out.println("   " + urlScan.next());
            }
            
            System.out.println();
        }
        
        fileScan.close();
    }
}

