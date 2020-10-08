package ca.bcit.comp1510.ch11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Demonstrates the use of a character file output stream.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class TestData {

    /** The minimum value. */
    public static final int MINIMUM = 10;

    /** The range of the numbers being produced. */
    public static final int RANGE = 90;

    /**
     * Creates a file of test data that consists of ten lines each containing
     * ten integer values in the range 10 to 99.
     * 
     * @param args command-line arguments (unused)
     * @throws IOException if the output file cannot be created.
     */
    public static void main(String[] args) throws IOException {
        final int max = 10;

        int value;
        String fileName = "test.txt";

        PrintWriter outFile = new PrintWriter(fileName);

        Random rand = new Random();

        for (int line = 1; line <= max; line++) {
            for (int num = 1; num <= max; num++) {
                value = rand.nextInt(RANGE) + MINIMUM;
                outFile.print(value + "   ");
            }
            outFile.println();
        }

        outFile.close();
        System.out.println("Output file has been created: " + fileName);
    }
}

