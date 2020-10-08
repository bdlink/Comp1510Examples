package ca.bcit.comp1510.ch07;

/**
 * Driver to exercise the use of multiple Rational objects. Includes tests for
 * divide by zero cases
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Rational2Tester {

    /** 6/8 numerator. */
    private static final int TEST1NUM = 6;

    /** 6/8 Denominator. */
    private static final int TEST1DEN = 8;

    /** 1/3 numerator. */
    private static final int TEST2NUM = 1;

    /** 1/3 Denominator. */
    private static final int TEST2DEN = 3;

    /**
     * Creates some rational number objects and performs various operations on
     * them.
     * 
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        RationalNumber2 r1 = new RationalNumber2(TEST1NUM, TEST1DEN);
        RationalNumber2 r2 = new RationalNumber2(TEST2NUM, TEST2DEN);
        RationalNumber2 r3;
        RationalNumber2 r4;
        RationalNumber2 r5;
        RationalNumber2 r6;
        RationalNumber2 r7;
        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.equals(r2)) {
            System.out.println("r1 and r2 are equal.");
        } else {
            System.out.println("r1 and r2 are NOT equal.");
        }

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);

        testErrorCases();

    }

    //Groups together error test cases.
    private static void testErrorCases() {
        try {
            new RationalNumber2(2, 0);
            System.out.println("Creation test failed");
        } catch (IllegalArgumentException ex) {
            System.out.println("Creation test worked");
        }
        try {
            RationalNumber2.ZERO.reciprocal();
            System.out.println("ZERO reciprocal test failed");
        } catch (IllegalArgumentException ex) {
            System.out.println("ZERO reciprocal test worked");
        }
        try {
            new RationalNumber2(1, 1).divide(RationalNumber2.ZERO);
            System.out.println("Divide by zero test failed");
        } catch (IllegalArgumentException ex) {
            System.out.println("Divide by zero test worked");
        }
        
        // uncaught exception
        new RationalNumber2(1, 1).divide(RationalNumber2.ZERO);

    }
}

