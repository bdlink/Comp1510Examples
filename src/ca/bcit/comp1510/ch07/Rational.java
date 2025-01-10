package ca.bcit.comp1510.ch07;

/**
 * Represents one rational number with a numerator and denominator. Handles
 * argument errors (divide by zero)
 *
 * @author Lewis & Loftus 9e
 * @author blink
 * @version 2025
 * @param numerator Numerator of rational number in reduced form, holds sign.
 * @param denominator Denominator of rational number in reduced form, positive sign.
 */
public record Rational(int numerator, int denominator) {
    /** RationalNumber version of numeric zero. */
    public static final Rational ZERO = new Rational(0, 1);

    /**
     * Constructs a RationalNumber2. Ensures a nonzero denominator and stores
     * the sign in the numerator
     * 
     * @param numer Raw numerator of rational number
     * @param denom Raw denominator of rational number
     * @throws IllegalArgumentException if denom is zero
     */
    public Rational {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator was zero");
        } else if (denominator < 0) {
            // Make the numerator "store" the sign
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        if (numerator == 0) {
            denominator = 1;
        } else {
            int common = gcd(Math.abs(numerator), denominator);

            numerator /= common;
            denominator /= common;            
        }
    }

    /**
     * Returns the reciprocal of this rational number.
     * 
     * @return reciprocal RationalNumber
     * @throws IllegalArgumentException if this component is zero
     */
    public Rational reciprocal() {
        if (numerator == 0) {
            throw new
                IllegalArgumentException("Tried to take reciprocal of zero");
        }

        return new Rational(denominator, numerator);
    }

    /**
     * Adds this rational number to the one passed as a parameter. A common
     * denominator is found by multiplying the individual denominators.
     * 
     * @param op2 The value to add to this
     * @return The sum of this + op2
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
     * @param op2 The value to subtract from this
     * @return The difference of this - op2
     */
    public Rational subtract(Rational op2) {
        int commonDenominator = denominator * op2.denominator();
        int numerator1 = numerator * op2.denominator();
        int numerator2 = op2.numerator() * denominator;
        int difference = numerator1 - numerator2;

        return new Rational(difference, commonDenominator);
    }

    /**
     * Multiplies this rational number by the one passed as a parameter.
     * 
     * @param op2 The value to multiply to this
     * @return The product of this * op2
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
     * @param op2 The value to divide into this
     * @return The quotient of this / op2
     * @throws IllegalArgumentException if op2 is zero
     */
    public Rational divide(Rational op2) {
        if (op2.equals(ZERO)) {
            throw new IllegalArgumentException("Tried to divide by zero");
        }
        return multiply(op2.reciprocal());
    }

    /**
     * Returns this rational number as a string.
     * 
     * @return string representation of this
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

    /*
     * Computes and returns the greatest common divisor of the two positive
     * parameters. Uses Euclid's algorithm.
     * 
     * @param num1
     *            positive integer first argument
     * @param num2
     *            positive integer second argument
     * @return greatest positive integer that divides num1 and num2
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

