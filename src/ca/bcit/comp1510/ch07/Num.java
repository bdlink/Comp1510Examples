package ca.bcit.comp1510.ch07;

/**
 * Represents a single integer as an object.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Num {
    
    /** Integer value that object wraps. */
    private int value;

    /**
     * Constructs a new Num object, storing an initial value.
     * @param initialValue an int
     */
    public Num(int initialValue) {
        value = initialValue;
    }

    /**
     * Sets the value stored in this Num object to be the specified value.
     * @param update the new value (an int)
     */
    public void setValue(int update) {
        value = update;
    }

    /**
     * Returns the stored integer value as a String.
     * @return toString description
     */
    public String toString() {
        return value + "";
    }
}

