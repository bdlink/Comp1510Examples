package ca.bcit.comp1510.ch05;

import java.util.Scanner;

/**
 * Demonstrates finding smallest and largest with sentinal loop.
 *
 * @author Link
 * @version 1
 */
public class TestCompareTo {
    /** indication of when to stop. */
    private static final String SENTINAL = "---END---";

    /**
     * Read lines from the input until "---END---" is entered (case sensitive).
     * Write out the smallest and largest line entered.
     *
     * @param args
     *            Unused
     */
    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        String inputLine;
        Scanner scan = new java.util.Scanner(System.in);

        inputLine = scan.nextLine();
        // if inputLine is a valid line, initialize smallest and largest with it
        if (!inputLine.equals(SENTINAL)) {
            smallest = inputLine;
            largest = inputLine;
            // read second line
            if (scan.hasNext()) {
                inputLine = scan.nextLine();
            }
        }
        while (!inputLine.equals(SENTINAL) && scan.hasNext()) {
            // if inputLine < smallest update smallest
            if (inputLine.compareTo(smallest) < 0) {
                smallest = inputLine;
            }
            // if inputLine > largest update largest
            if (inputLine.compareTo(largest) > 0) {
                largest = inputLine;
            }
            inputLine = scan.nextLine();
        }

        System.out.println("smallest line: \"" + smallest + "\"");
        System.out.println("largest line: \"" + largest + "\"");

        scan.close();
    }
}

