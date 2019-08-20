package ca.bcit.comp1510.ch05;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Demonstrates the use of the while loop to avoid problem of bad input.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Purchase {
    /** 6% sales tax rate. */
    public static final double TAX_RATE = 0.06;

    /**
     * Calculates the final price of a purchased item using values entered by
     * the user.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {

        int quantity;
        double subtotal;
        double tax;
        double totalCost;
        double unitPrice;

        Scanner scan = new Scanner(System.in);

        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();

        System.out.print("Enter the quantity: ");

        // Skips non-int token and re-prompts for input
        while (!scan.hasNextInt()) {
            scan.next(); // Reads and removes the non-int token from the scanner
            System.out.print("The quantity must be an integer\n"
                    + "Enter the quantity: ");
        }
        quantity = scan.nextInt();

        System.out.print("Enter the unit price: ");

        // Skips non-int token and re-prompts for input
        while (!scan.hasNextDouble()) {
            scan.next(); // Clears the non-int token from the scanner
            System.out.print("The unit price must be a number\n"
                    + "Enter the unit price: ");
        }
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        // Prints output with appropriate formatting
        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax)
                + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalCost));

        scan.close();
    }
}

