package ca.bcit.comp1510.ch07;

/**
 * Represents one rational number with a numerator and denominator.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RationalNumber {
    /** Numerator of rational number in reduced form, holds sign. */
    private int numerator;
    
    /** Denominator of rational number in reduced form, positive sign. */
    private int denominator;
    
    /**
     * Constructs a RationalNumber. Ensures a nonzero denominator and stores
     * the sign in the numerator.
     * 
     * @param numer
     *            the numerator (an int)
     * @param denom
     *            the denominator (an int)
     */
    public RationalNumber(int numer, int denom) {
        if (denom == 0) {
            denominator = 1;
            numerator = numer;
        } else if (denom < 0) {
            // Make the numerator "store" the sign
            numerator = numer * -1;
            denominator = denom * -1;
        } else {
            numerator = numer;
            denominator = denom;
        }
        reduce();
    }

    /**
     * Returns the numerator.
     * 
     * @return numerator as an int
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns the denominator.
     * 
     * @return denominator as an int
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Returns the reciprocal of this rational number.
     * 
     * @return reciprocal as a RationalNumber
     */
    public RationalNumber reciprocal() {
        return new RationalNumber(denominator, numerator);
    }

    /**
     * Adds this rational number to the one passed as a parameter. A common
     * denominator is found by multiplying the individual denominators.
     * 
     * @param op2
     *            a RationalNumber
     * @return sum of this RationalNumber and op2
     */
    public RationalNumber add(RationalNumber op2) {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator);
    }

    /**
     * Subtracts the rational number passed as a parameter from this rational
     * number.
     * 
     * @param op2
     *            a RationalNumber
     * @return difference between this RationalNumber and op2
     */
    public RationalNumber subtract(RationalNumber op2) {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);
    }

    /**
     * Multiplies the rational number passed as a parameter with this rational
     * number.
     * 
     * @param op2
     *            a RationalNumber
     * @return product of this RationalNumber and op2
     */
    public RationalNumber multiply(RationalNumber op2) {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    }

    /**
     * Divides this rational number by the one passed as a parameter by
     * multiplying by the reciprocal of the second rational.
     * 
     * @param op2
     *            a RationalNumber
     * @return quotient of this RationalNumber divided by op2
     */
    public RationalNumber divide(RationalNumber op2) {
        return multiply(op2.reciprocal());
    }

    /**
     * Determines if this rational number is equal to the one passed as a
     * parameter. Assumes they are both reduced.
     * 
     * @param op2
     *            a RationalNumber
     * @return true if this RationalNumber is like op2, else false
     */
    public boolean isLike(RationalNumber op2) {
        return (numerator == op2.getNumerator()
                && denominator == op2.getDenominator());
    }

    /**
     * Returns this RationalNumber as a String.
     * 
     * @return toString description
     */
    public String toString() {
        String result;
        if (numerator == 0) {
            result = "0";
        } else if (denominator == 1) {
            result = numerator + "";
        } else {
            result = numerator + "/" + denominator;
        }
        return result;
    }

    /**
     * Reduces this rational number by dividing both the numerator and the
     * denominator by their greatest common divisor.
     */
    private void reduce() {
        if (numerator != 0) {
            int common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        }
    }

    /**
     * Computes and returns the greatest common divisor of the two positive
     * parameters. Uses Euclid's algorithm.
     * 
     * @param num1
     *            an int
     * @param num2
     *            an int
     * @return the greatest common divisor of num1 and num2
     */
    private int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
}

