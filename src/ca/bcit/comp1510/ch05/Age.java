package ca.bcit.comp1510.ch05;

import java.util.Scanner;

/**
 * Demonstrates the use of an if statement.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Age {
    /** Age of majority.  Person is minor if age < MINOR */
    public static final int AGE_OF_MAJORITY = 21;
    
    /**
     * Reads the user's age and prints comments accordingly.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("You entered: " + age);

        if (age < AGE_OF_MAJORITY) {
            System.out.println("Youth is a wonderful thing. Enjoy.");
        }
        
        System.out.println("Age is a state of mind.");
        
        scan.close();
    }
}

