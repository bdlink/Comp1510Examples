package ca.bcit.comp1510.ch02;

import java.util.Scanner;

/**
 * Demonstrates the use of the Scanner class to read numeric data.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class GasMileage {

    /**
     * Calculates fuel efficiency based on values entered by the user.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        int miles;
        double gallons;
        double mpg;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of miles: ");
        miles = scan.nextInt();

        System.out.print("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;

        System.out.println("Miles Per Gallon: " + mpg);

        scan.close();
    }
}

