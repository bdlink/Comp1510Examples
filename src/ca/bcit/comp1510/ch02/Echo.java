package ca.bcit.comp1510.ch02;

import java.util.Scanner;

/**
 * Demonstrates the use of the nextLine method of the Scanner class to read a
 * string from the user.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Echo {

    /**
     * Reads a character string from the user and prints it.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text:");

        message = scan.nextLine();

        System.out.println("You entered: \"" + message + "\"");

        scan.close();
    }
}

