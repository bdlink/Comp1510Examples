package ca.bcit.comp1510.ch08;

import java.util.Arrays;
import java.util.Random;

/**
 * Simulate income evolution with free exchange, finite resources.
 * @author blink
 * @version 1
 */
public class IncomeExchangeSimulation {
    
    /**
     * Run the simulation.
     * @param args unused.
     */
    public static void main(String[] args) {
        final long iterations = 100000;
        final var population = 100;
        final var initialWealth = 1000;
        final var exchange = 50;
        final Random ran = new Random();
        int[] person = new int[population];
        
        for (int i = 0; i < population; i++) {
            person[i] = initialWealth;
        }
        for (int i = 0; i < iterations; i++) {
            var first = ran.nextInt(population);
            var second = ran.nextInt(population);
            if (person[first] >= exchange && person[second] >= exchange) {
                person[first] -= exchange;
                person[second] += exchange;
            }
        }
        Arrays.sort(person);
        
        final int perLine = 10;
        for (int i = 1; i <= person.length; i++) {
            System.out.print(person[i] + "\t");
            if (i % perLine == 0) {
                System.out.println();
            }
        }
    }

}
