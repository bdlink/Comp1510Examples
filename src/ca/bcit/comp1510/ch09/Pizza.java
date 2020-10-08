package ca.bcit.comp1510.ch09;

/**
 * Represents a pizza, which is a FoodItem. Used to demonstrate indirect
 * referencing through inheritance.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Pizza extends FoodItem {
    /** Number of servings in a pizza. */
    public static final int PIZZA_SERVINGS = 8;

    /**
     * Constructs a Pizza object with the specified amount of fat (assumes
     * PIZZA_SERVINGS servings).
     * 
     * @param fatGrams an int
     */
    public Pizza(int fatGrams) {
        super(fatGrams, PIZZA_SERVINGS);
    }
}

