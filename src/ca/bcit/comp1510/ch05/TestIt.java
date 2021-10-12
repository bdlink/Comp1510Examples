package ca.bcit.comp1510.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Provide code for testing.
 * @author blink
 * @version 1
 *
 */
public class TestIt {
    
    /** 
     * Return the largest value in the parameters.
     * @param a first number
     * @param b second number
     * @param c third number
     * @return largest of three numbers
     */
    public static int largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    
    /** 
     * Return the largest value in the parameters.
     * @param a List of integers
     * @return largest of numbers in List
     */
    public static int largest(List<Integer> a) {
        int max = a.get(0);
        int i = 1;
        while (i < a.size()) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
            i++;
        }
        
        return max;
    }
    
    /** read a list of integers and find the largest.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter a list of integers, " 
                +  "terminated by \"done\"");
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        System.out.println("largest = " + largest(list));
    }

}
