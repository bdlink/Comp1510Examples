package ca.bcit.comp1510.ch07;
/**
 * Complex number type.
 * @author blink
 * @version 1.0
 */
public class Complex {
    
    /** Imaginary number I. */
    public static final Complex I = new Complex(0, 1);
    /** Complex number 0. */
    public static final Complex ZERO = new Complex(0, 0);
    /** Complex number 1. */
    public static final Complex ONE = new Complex(1, 0);
    
    /** Real part of number. */
    private double re;
    /** Imaginary part of number. */
    private double im;
    
    /**
     * Constructs a Complex object.
     * @param real the real part of the new number.
     * @param imag the imaginary part of the new number.
     */
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    /**
     * Returns (accesses) the real part of the number.
     * @return the re
     */
    public double getRe() {
        return re;
    }

    /**
     * Sets (mutates) the real part of the number.
     * @param re the re to set
     */
    public void setRe(double re) {
        this.re = re;
    }

    /**
     * Returns (accesses) the imaginary part of the number.
     * @return the im
     */
    public double getIm() {
        return im;
    }

    /**
     * Sets (mutates) the imaginary part of the number.
     * @param im the im to set
     */
    public void setIm(double im) {
        this.im = im;
    }
    
    /**
     * Returns absolute value of this.
     * @return the absolute value
     */
    public double abs() {
        return Math.sqrt(re * re + im * im);
    }
    
    /**
     * Returns argument of this, the angle with respect to 
     * the positive real axis.
     * @return the argument, in radians
     */
    public double arg() {
        return Math.atan2(im, re);
    }
    
    /**
     * Returns conjugate value of this.
     * @return the conjugate value
     */
    public Complex conjugate() {
        return new Complex(re, -im);
    }

    /**
     * Adds parameter to this complex number.
     * @param op2 complex number to add
     * @return sum of this + op2
     */
    public Complex add(Complex op2) {
        return new Complex(re + op2.getRe(), im + op2.getIm());
    }
    
    /**
     * Subtracts parameter from this complex number.
     * @param op2 complex number to subtract
     * @return difference of this - op2
     */
    public Complex subtract(Complex op2) {
        return new Complex(re - op2.getRe(), im - op2.getIm());
    }
    
    /**
     * Multiplies parameter with this complex number.
     * @param op2 complex number to multiply
     * @return product of this * op2
     */
    public Complex multiply(Complex op2) {
        double realPart = re * op2.getRe() - im * op2.getIm();
        double imagPart = re * op2.getIm() + im * op2.getRe();
        return new Complex(realPart, imagPart);
    }
    
    /**
     * Returns reciprocal of this complex number.
     * @return 1 / this
     */
    public Complex reciprocal() {
        double denominator = re * re + im * im;
        if (denominator == 0.0) {
            throw new IllegalArgumentException(
                    "tried to take reciprocal of 0");
        }
        return new Complex(re / denominator, -im / denominator);
    }
    
    /**
     * Divides parameter into this complex number.
     * @param op2 complex number to divide
     * @return quotient of this / op2
     */
    public Complex divide(Complex op2) {
        if (op2.getRe() == 0.0 && op2.getIm() == 0.0) {
            throw new IllegalArgumentException("Tried to divide by zero");
        }
        return multiply(op2.reciprocal());
    }

    /**
     * Determines if this complex number is equal to the one passed as a
     * parameter.
     * 
     * @param op2
     *            The value to compare to this
     * @return true if this is equal to op2 numerically
     */
    public boolean equals(Object op2) {
        return (op2 instanceof Complex
                && re == ((Complex) op2).getRe()
                && im == ((Complex) op2).getIm());
    }

    /**
     * Satisfies requirement that for all Complex z1, z2: if
     * z1.equals(z2) then z1.hashCode() == z2.hashCode(). if !z1.equals(z2) then
     * z1.hashCode() != z2.hashCode() if possible.
     * 
     * @return hash code for this
     */
    public int hashCode() {
        return Double.hashCode(re) ^ Double.hashCode(im);
    }
    
   /**
     * Converts to string with special cases for real and imaginary
     * values.
     * @return String representation of the complex number
     */
    public String toString() {
        if (im == 0.0) {
            return Double.toString(re);
        } else if (re == 0.0) {
            return Double.toString(im) + "I";
        } else if (im > 0) {
            return Double.toString(re) + " + " 
                      + Double.toString(im) + "I";
        } else {
            return Double.toString(re) + " - " 
                    + Double.toString(-im) + "I";   
        }
    }
}
