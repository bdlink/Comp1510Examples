package ca.bcit.comp1510.ch12;

/**
 * Demonstrates recursion.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class SolveTowers {

    /**
     * Creates a TowersOfHanoi puzzle and solves it.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        final int towerHeight = 4;
        TowersOfHanoi towers = new TowersOfHanoi(towerHeight);
        towers.solve();
    }
}

