package ca.bcit.comp1510.ch05;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Demonstrates the use of a while loop for input validation.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class WinPercentage {

    /**
     * Computes the percentage of games won by a team.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final int numGames = 12;
        int won;
        double ratio;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of games won (0 to "
                + numGames + "): ");
        won = scan.nextInt();

        while (won < 0 || won > numGames) {
            System.out.print("Invalid input. Please reenter: ");
            won = scan.nextInt();
        }

        ratio = (double) won / numGames;

        NumberFormat fmt = NumberFormat.getPercentInstance();

        System.out.println();
        System.out.println("Winning percentage: " + fmt.format(ratio));
        
        scan.close();
    }
}

