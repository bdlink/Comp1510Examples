package ca.bcit.comp1510.ch07;

/**
 * Represents a single slogan string.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Slogan {
    /** Holds number of Slogan objects created. */
    private static int count;

    /** Holds slogan. */
    private String phrase;

    /**
     * Constructs the slogan and counts the number of instances created.
     * 
     * @param str
     *            the String used for the slogan
     */
    public Slogan(String str) {
        phrase = str;
        count++;
    }

    /**
     * Returns this Slogan as a String.
     * @return toString description
     */
    public String toString() {
        return phrase;
    }

    /**
     * Returns the number of instances of this class that have been
     * created.
     * @return count as an int
     */
    public static int getCount() {
        return count;
    }
}

