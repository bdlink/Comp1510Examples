package ca.bcit.comp1510.ch08;

import static java.io.File.separator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrates the use of an array of objects.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Movies {

    /**
     * Creates a DVDCollection object and adds some DVDs to it. Prints reports
     * about the status of the collection.
     * 
     * @param args command line arguments (unused)
     * @throws FileNotFoundException if file is not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        DVDCollection movies = new DVDCollection();
        
        Scanner scan = new Scanner(new File("resources" 
                + separator + "movies.txt"));


        while (scan.hasNextLine()) {
            movies.addDVD(scan.nextLine(), scan.nextLine(), scan.nextInt(),
                    scan.nextDouble(), scan.nextBoolean());
            scan.nextLine();   //advance past end of line after reading boolean
        }

        System.out.println(movies);

    }
}

