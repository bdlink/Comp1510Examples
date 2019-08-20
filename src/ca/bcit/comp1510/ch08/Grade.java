package ca.bcit.comp1510.ch08;

/**
 * Represents a school grade.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Grade {
    /** Name of grade. A+, A, A-, etc. */
    private String name;

    /** lowest percentage to get grade. */
    private int lowerBound;
    
    /**
     * Constructs a Grade object with the specified grade name and numeric lower
     * bound.
     * 
     * @param grade a String
     * @param cutoff an int
     */
    public Grade(String grade, int cutoff) {
        name = grade;
        lowerBound = cutoff;
    }
    
    /**
     * Sets (mutates) the grade name to be the specified value.
     * @param grade a String
     */
    public void setName(String grade) {
        name = grade;
    }

    /**
     * Sets (mutates) the lower bound to be the specified value.
     * @param cutoff an int
     */
    public void setLowerBound(int cutoff) {
        lowerBound = cutoff;
    }

    /**
     * Gets (accesses) the Grade name.
     * @return name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Gets (accesses) the Grade lower bound.
     * @return lowerBound as an int
     */
    public int getLowerBound() {
        return lowerBound;
    }

    /**
     * Returns a description of this Grade as a String.
     * @return toString description
     */
    public String toString() {
        return name + "\t" + lowerBound;
    }
}

