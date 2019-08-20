package ca.bcit.comp1510.ch05;

/**
 * Demonstrates the use of an if-else statement.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class CoinFlip {

    /**
     * Creates a Coin object, flips it, and prints the result.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Coin myCoin = new Coin();

        myCoin.flip();

        System.out.println(myCoin);

        if (myCoin.isHeads()) {
            System.out.println("You win.");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}

