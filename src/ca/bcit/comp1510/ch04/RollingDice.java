package ca.bcit.comp1510.ch04;

/**
 * Demonstrates the creation and use of a user-defined class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RollingDice {
    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int newFace = 4;
        
        Die die1;
        Die die2;
        int sum;

        die1 = new Die();
        die2 = new Die();

        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(newFace);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
    }
}

