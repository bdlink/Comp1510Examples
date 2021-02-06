package ca.bcit.comp1510.ch07;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *  Demonstrates the use of the Math class to perform a calculation
 *  based on user input.
 *  Illustrates import static.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Quadratic {

    /**
     * Determines the roots of a quadratic equation.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // ax^2 + bx + c
        Complex a;
        Complex b;
        Complex c;
        
        final double discFactor = 4.0;
        Complex discriminant;
        Complex root1;
        Complex root2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the coefficient of x squared: ");
        a = new Complex(scan.nextDouble(), 0);

        System.out.print("Enter the coefficient of x: ");
        b = new Complex(scan.nextDouble(), 0);

        System.out.print("Enter the constant: ");
        c = new Complex(scan.nextDouble(), 0);

        // Uses the quadratic formula to compute the roots.
        // Note different style using OO methods vs. operators
        discriminant = b.multiply(b).
                subtract(a.multiply(c).multiply(discFactor));
        root1 = b.multiply(-1.0).
                add(discriminant.sqrt()).divide(a.multiply(2.0));
        root2 = b.multiply(-1.0).
                subtract(discriminant.sqrt()).divide(a.multiply(2.0));

        System.out.println("Root #1: " + root1);
        System.out.println("Root #2: " + root2);
        
        scan.close();
    }
}

