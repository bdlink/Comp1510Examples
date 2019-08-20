package ca.bcit.comp1510.ch07;

/**
 * Enumerates the values for Season.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public enum Season {

    /** First season, winter. */
    winter("December through February"),

    /** Second season, spring. */
    spring("March through May"),

    /** Third season, summer. */
    summer("June through August"),

    /** Fourth season, fall (not autumn). */
    fall("September through November");

    /** Holds string to describe months of season. */
    private String span;

    /**
     * Constructor associates each value with a String.
     * @param months the span of the Season.
     */
    Season(String months) {
        span = months;
    }

    /**
     * Returns the span for the value.
     * @return span as a String
     */
    public String getSpan() {
        return span;
    }
}

