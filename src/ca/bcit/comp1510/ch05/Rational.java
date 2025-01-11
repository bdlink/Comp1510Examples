package ca.bcit.comp1510.ch05;

/**
 * Represents one rational number with a numerator and denominator.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 * @param numerator Numerator of rational number in reduced form, holds sign.
 * @param denominator Denominator of rational number in reduced form, 
 *     positive sign.
 */
public record Rational(int numerator, int denominator) {
    
    /**
     * Helps construct a RationalNumber. Ensures a nonzero denominator 
     * and stores the sign in the numerator.
     * Runs before the canonical constructor.
     */
    public Rational {
        if (denominator == 0) {
            denominator = 1;
        } else if (denominator < 0) {
            // Make the numerator "store" the sign
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        int common = gcd(numerator, denominator);

        numerator /= common;
        denominator /= common;            

    }

    /**
     * Returns the reciprocal of this rational number.
     * 
     * @return reciprocal as a RationalNumber
     */
    public Rational reciprocal() {
        return new Rational(denominator, numerator);
    }

    /**
     * Adds this rational number to the one passed as a parameter. A common
     * denominator is found by multiplying the individual denominators.
     * 
     * @param op2 a RationalNumber
     * @return sum of this RationalNumber and op2
     */
    public Rational add(Rational op2) {
        int commonDenominator = denominator * op2.denominator();
        int numerator1 = numerator * op2.denominator();
        int numerator2 = op2.numerator() * denominator;
        int sum = numerator1 + numerator2;

        return new Rational(sum, commonDenominator);
    }

    /**
     * Subtracts the rational number passed as a parameter from this rational
     * number.
     * 
     * @param op2 a RationalNumber
     * @return difference between this RationalNumber and op2
     */
    public Rational subtract(Rational op2) {
        int commonDenominator = denominator * op2.denominator();
        int numerator1 = numerator * op2.denominator();
        int numerator2 = op2.numerator() * denominator;
        int difference = numerator1 - numerator2;

        return new Rational(difference, commonDenominator);
    }

    /**
     * Multiplies the rational number passed as a parameter with this rational
     * number.
     * 
     * @param op2 a RationalNumber
     * @return product of this RationalNumber and op2
     */
    public Rational multiply(Rational op2) {
        int numer = numerator * op2.numerator();
        int denom = denominator * op2.denominator();

        return new Rational(numer, denom);
    }

    /**
     * Divides this rational number by the one passed as a parameter by
     * multiplying by the reciprocal of the second rational.
     * 
     * @param op2 a RationalNumber
     * @return quotient of this RationalNumber divided by op2
     */
    public Rational divide(Rational op2) {
        return multiply(op2.reciprocal());
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
     * Computes and returns the greatest common divisor of the two integer
     * parameters. Uses Euclid's algorithm.
     * 
     * @param num1 an int
     * @param num2 an int
     * @return the greatest common divisor of num1 and num2
     */
    private int gcd(int num1, int num2) {
        if (num2 == 0) {
            return Math.abs(num1);
        } else {
            return gcd(num2, num1 % num2);
        }
    }
}

