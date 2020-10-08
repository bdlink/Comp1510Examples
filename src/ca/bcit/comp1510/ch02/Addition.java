package ca.bcit.comp1510.ch02;

/**
 * Demonstrates the difference between the addition and string concatenation
 * operators.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Addition {

    /**
     * Concatenates and adds two numbers, then prints the results.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("24 and 45 concatenated: " + 24 + 45);
        System.out.println("24 and 45 added: " + (24 + 45));
    }
}

