package ca.bcit.comp1510.ch11;

import java.util.Scanner;

/**
 * Demonstrates the ability to define an exception via inheritance.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class CreatingExceptions {

    /**
     * Creates an exception object and possibly throws it.
     * 
     * @param args
     *            command line arguments (unused)
     * @throws OutOfRangeException
     *             if user input is 'out of range'
     */
    public static void main(String[] args) throws OutOfRangeException {
        final int minimum = 25;
        final int maximum = 40;

        Scanner scan = new Scanner(System.in);

        OutOfRangeException problem = 
                new OutOfRangeException("Input value is out of range.");

        System.out.print("Enter an integer value between " 
                + minimum + " and " + maximum + ", inclusive: ");
        int value = scan.nextInt();
        scan.close();

        // Determines if the exception should be thrown
        if (value < minimum || value > maximum) {
            throw problem;
        }

        System.out.println("End of main method."); // May never be reached

    }
}

