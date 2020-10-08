package ca.bcit.comp1510.ch03;

/**
 * Demonstrates the use of the String class and its methods.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class StringMutation {

    /**
     * Prints a String and various mutations of it.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        String phrase = "Change is inevitable";
        String mutation1;
        String mutation2;
        String mutation3;
        String mutation4;

        System.out.println("Original string: \"" + phrase + "\"");
        System.out.println("Length of string: " + phrase.length());

        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        
        // With magic numbers you may not understand the following:
        mutation4 = mutation3.substring(3, 30);

        // Prints each mutated string
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);

        System.out.println("Mutated length: " + mutation4.length());
    }
}

