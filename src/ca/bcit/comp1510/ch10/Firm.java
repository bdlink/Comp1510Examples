package ca.bcit.comp1510.ch10;

/**
 * Demonstrates polymorphism via inheritance.
 *
 * @author Lewis & Loftus 9e
 * @author Bruce Link
 * @version 2017
 */
public class Firm {
    /**
     * Creates a staff of employees for a firm and pays them.
     * 
     * @param args Unused
     */
    public static void main(String[] args) {
        Staff personnel = new Staff();

        personnel.payday();
    }
}

