package ca.bcit.comp1510.ch08;

/**
 * Demonstrates the use of an initializer list for an array.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Primes {
    /** First several prime numbers. */
    private static final int[] PRIMES =
        {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

    /**
     * Stores some prime numbers in an array and prints them.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {

        System.out.println("Array length: " + PRIMES.length);

        System.out.println("The first few prime numbers are:");

        for (int prime : PRIMES) {
            System.out.print(prime + "  ");
        }
    }
}

