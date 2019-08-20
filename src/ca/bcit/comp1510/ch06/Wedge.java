package ca.bcit.comp1510.ch06;

/**
 * Demonstrates the use of nested for loops.
 *
 * @author Link
 * @version 1
 */
public class Wedge {

    /**
     * Prints a wedge shape using asterisk (star) characters.
     * 
     * @param args
     *            Unused
     */
    public static void main(String[] args) {
        final int maxRows = 11;

        for (int row = 1; row <= maxRows; row++) {
            for (int blanks = 1; blanks <= maxRows - row; blanks++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

