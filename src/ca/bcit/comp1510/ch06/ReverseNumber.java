package ca.bcit.comp1510.ch06;

import java.util.Scanner;

/**
 * Demonstrates the use of a do loop.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class ReverseNumber {

    /**
     * Reverses the digits of an integer mathematically.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        int number;
        int lastDigit;
        int reverse = 0;
        final int base = 10;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = scan.nextInt();

        /* Will this work for multiples of 10, i.e., numbers
           with trailing zeros? */
        do {
            lastDigit = number % base;
            reverse = (reverse * base) + lastDigit;
            number = number / base;
        } while (number > 0);

        System.out.println("That number reversed is " + reverse);
        
        scan.close();
    }
}

