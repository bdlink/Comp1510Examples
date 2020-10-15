package ca.bcit.comp1510.ch06;

import java.util.Scanner;

/**
 * Demonstrates the use of a for loop.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Multiples {

    /**
     * Prints multiples of a user-specified number up to a user-
     * specified limit.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final int perLine = 5;
        int value;
        int limit;
        int mult;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive value: ");
        value = scan.nextInt();

        System.out.print("Enter an upper limit: ");
        limit = scan.nextInt();
        scan.close();

        System.out.println();
        System.out.println("The multiples of " + value + " between "
                + value + " and " + limit + " (inclusive) are:");

        for (mult = value; mult <= limit; mult += value) {
            System.out.print(mult + "\t");

            // Prints a specific number of values per line of output
            count++;
            if (count % perLine == 0) {
                System.out.println();
            }
        }
    }
}

