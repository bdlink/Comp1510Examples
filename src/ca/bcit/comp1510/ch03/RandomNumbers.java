package ca.bcit.comp1510.ch03;

import java.util.random.RandomGenerator;

/**
 * Demonstrates the creation of pseudo-random numbers using the RandomGenerator
 *  interface.
 * 
 * @author Lewis & Loftus 9e
 * @author bdlink
 * @version 2025
 */
public class RandomNumbers {

    /**
     * Generates random numbers in various ranges.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        //These are just sample numbers, so hard to have meaningful names here
        final int ten = 10;
        final int fifteen = 15;
        final int twenty = 20;
        final int dieMax = 6;

        //RandomGenerator is a type that includes the Random class. 
        //See discussion in chapter 7, interfaces.
        //getDefault returns a random number generator with better statistics 
        //than the Random class.
        RandomGenerator generator = RandomGenerator.getDefault();
        System.out.println(generator);
        int num1;
        float num2;
        
        System.out.println("""
                ***********************************************
                Example of random numbers from java.util.Random
                ***********************************************
                """);
        num1 = generator.nextInt();
        System.out.println("A random integer: " + num1);

        num1 = generator.nextInt(ten);
        System.out.println("From 0 to 9: " + num1);

        num1 = generator.nextInt(ten) + 1;
        System.out.println("From 1 to 10: " + num1);

        num1 = generator.nextInt(fifteen) + twenty;
        System.out.println("From 20 to 34: " + num1);

        num1 = generator.nextInt(twenty) - ten;
        System.out.println("From -10 to 9: " + num1);

        num2 = generator.nextFloat();
        System.out.println("A random float (between 0-1): " + num2);
        
        // 0.0 to 5.999999
        num2 = generator.nextFloat() * dieMax;
        num1 = (int) num2 + 1;
        System.out.println("From 1 to 6: " + num1);
    }
}

