package ca.bcit.comp1510.ch03;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Demonstrates the formatting of decimal values using the DecimalFormat class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class CircleStats {

    /**
     * Calculates the area and circumference of a circle given its radius.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        int radius;
        double area;
        double circumference;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the circle's radius: ");
        radius = scan.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        // Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: "
                + fmt.format(circumference));

        scan.close();
    }
}

