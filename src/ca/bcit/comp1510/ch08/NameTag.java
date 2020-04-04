package ca.bcit.comp1510.ch08;

/**
 * Demonstrates the use of command line arguments.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class NameTag {

    /**
     * Prints a simple name tag using a greeting and a name that is specified by
     * the user.
     * 
     * @param args
     *            a first and last name
     */
    public static void main(String[] args) {
        System.out.println("     " + args[0]);
        System.out.println();
        System.out.println("My name is " + args[1]);
    }
}

