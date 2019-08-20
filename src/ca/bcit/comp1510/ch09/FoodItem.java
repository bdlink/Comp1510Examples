package ca.bcit.comp1510.ch09;

/**
 * Represents an item of food. Used as the parent of a derived class to
 * demonstrate indirect referencing.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class FoodItem {
    /** Number of calories per gram of fat. */
    public static final int CALORIES_PER_GRAM = 9;

    /**
     * Number of servings per food item.
     * 
     * Should be private, but protected for illustration. Violation of
     * Checkstyle.
     */
    protected int servings;

    /** Number of grams of fat per food item. */
    private int fatGrams;

    /**
     * Constructs a FoodItem with the specified number of fat grams and number
     * of servings.
     * 
     * @param numFatGrams
     *            an int
     * @param numServings
     *            an int
     */
    public FoodItem(int numFatGrams, int numServings) {
        fatGrams = numFatGrams;
        servings = numServings;
    }

    /**
     * Calculates and returns the number of calories in this FoodItem due to
     * fat.
     * 
     * @return fatCalories as an int
     */
    private int calories() {
        return fatGrams * CALORIES_PER_GRAM;
    }

    /**
     * Calculates and returns the number of calories per serving in this
     * FoodItem.
     * 
     * @return caloriesPerServing as an int
     */
    public int caloriesPerServing() {
        return (calories() / servings);
    }
}

