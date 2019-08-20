package ca.bcit.comp1510.ch09;

/**
 * Represents some thoughtful advice. Used to demonstrate the use of an
 * overridden method.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Advice extends Thought {

    /**
     * Prints a message. Overrides the parent's version (the version in the
     * Thought class).
     */
    @Override
    public void message() {
        System.out.println("Warning: Dates in calendar are closer "
                + "than they appear.");

        System.out.println();

        // Explicitly invokes the parent's version
        super.message();
    }
}

