package ca.bcit.comp1510.ch03;

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
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {
        // ax^2 + bx + c
        int a;
        int b;
        int c;
        
        final int discFactor = 4;
        double discriminant;
        double root1;
        double root2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the coefficient of x squared: ");
        a = scan.nextInt();

        System.out.print("Enter the coefficient of x: ");
        b = scan.nextInt();

        System.out.print("Enter the constant: ");
        c = scan.nextInt();

        // Uses the quadratic formula to compute the roots.
        // Assumes a positive discriminant.
        discriminant = pow(b, 2) - (discFactor * a * c);
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);

        System.out.println("Root #1: " + root1);
        System.out.println("Root #2: " + root2);
        
        scan.close();
    }
}

