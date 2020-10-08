package ca.bcit.comp1510.ch08;

/**
 * Demonstrates basic array declaration and use.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class BasicArray {

    /** Largest value to print. */
    private static final int LIMIT = 15;

    /** Print multiples of this value. */
    private static final int MULTIPLE = 10;

    /** Value that is out of pattern. */
    private static final int CLUNKER = 999;

    /** Index to store CLUNKER. */
    private static final int CLUNK_IDX = 5;  
    
    /**
     * Creates an array, fills it with various integer values, modifies one
     * value, then prints them out.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        int[] list = new int[LIMIT];

        // Initializes the array values
        for (int index = 0; index < LIMIT; index++) {
            list[index] = index * MULTIPLE;
        }
        
        // Changes one array value
        list[CLUNK_IDX] = CLUNKER;
        
        // Prints the array values
        for (int value : list) {
            System.out.print(value + "  ");
        }
    }
}

