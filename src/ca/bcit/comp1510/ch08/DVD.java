
package ca.bcit.comp1510.ch08;

import java.text.NumberFormat;

/**
 * Represents a DVD.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class DVD {
    /** Title of the DVD. */
    private String title;
    
    /** Director of the DVD. */
    private String director;
    
    /** Year the movie was filmed. */
    private int year;
    
    /** Price of the DVD. */
    private double cost;
    
    /** Is the DVD BluRay? */
    private boolean bluRay;

    /**
     * Constructs a new DVD with the specified information.
     * @param title a String
     * @param director a String
     * @param year released
     * @param cost to purchase
     * @param bluRay or not bluRay
     */
    public DVD(String title,
               String director, 
               int year, 
               double cost, 
               boolean bluRay) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.bluRay = bluRay;
    }
    
    /**
     *  return cost of DVD.
     * @return cost how much the DVD cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Returns a description of this DVD as a String.
     * @return toString description
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String description;

        description = fmt.format(cost) + "\t" + year + "\t";
        description += title + "\t" + director;

        if (bluRay) {
            description += "\t" + "Blu-Ray";
        }
        return description;
    }
}

