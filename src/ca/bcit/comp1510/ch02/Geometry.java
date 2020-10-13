package ca.bcit.comp1510.ch02;

/**
 * Demonstrates the use of an assignment statement to change the value stored in
 * a variable.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Geometry {

    /**
     * Prints the number of sides of several geometric shapes.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // declaration with initialization
        var sides = 7;
        System.out.println("A heptagon has " + sides + " sides.");
        
        // assignment statement
        sides = 10;
        System.out.println("A decagon has " + sides + " sides.");

        sides = 12;
        System.out.println("A dodecagon has " + sides + " sides.");
    }
}

