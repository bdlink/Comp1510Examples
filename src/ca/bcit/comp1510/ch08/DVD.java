
package ca.bcit.comp1510.ch08;

import java.text.NumberFormat;

/**
 * Represents a DVD.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 * @param title Title of the DVD.
 * @param director Director of the DVD.
 * @param year Year the movie was filmed.
 * @param cost Price of the DVD.
 * @param bluRay Is the DVD BluRay?
 */
public record DVD(String title,
               String director, 
               int year, 
               double cost, 
               boolean bluRay) {

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

