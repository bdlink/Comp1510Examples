package ca.bcit.comp1510.ch03;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Demonstrates the use of the NumberFormat class to format output.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Purchase {

    /** 6% sales tax. */
    public static final double TAX_RATE = 0.06;

    /**
     * Calculates the final price of a purchased item using values entered by
     * the user.
     * 
     * @param args command-line arguments (unused)
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
        quantity = scan.nextInt();

        System.out.print("Enter the unit price: ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        // Print output with appropriate formatting
        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax) + " at "
                + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalCost));

        scan.close();
    }
}

