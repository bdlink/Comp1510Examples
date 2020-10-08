package ca.bcit.comp1510.ch06;

/**
 * Demonstrates the use of nested for loops.
 *
 * @author Link
 * @version 1
 */
public class Tree {
    /**
     * Prints a tree shape using asterisk (star) characters.
     * 
     * @param args Unused
     */
    public static void main(String[] args) {
        final int maxRows = 10;
        final int trunkHeight = 4;
        final int trunkWidth = 5;

        // first draw triangle top
        // uses loop style starting at one with <=
        for (int row = 1; row <= maxRows; row++) {
            for (int blanks = 1; blanks <= maxRows - row; blanks++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // draw tree trunk at bottom
        // uses loop style starting at zero with <
        for (int row = 0; row < trunkHeight; row++) {
            for (int blanks = 0; blanks < maxRows - (trunkWidth / 2 + 1);
                    blanks++) {
                System.out.print(" ");
            }
            for (int star = 0; star < trunkWidth; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

