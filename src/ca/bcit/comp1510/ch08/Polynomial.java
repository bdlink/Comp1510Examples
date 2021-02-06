package ca.bcit.comp1510.ch08;

/**
 * Interface for a polynomial of one variable.  
 * A polynomial is a sum of powers of a single variable, x,
 * with a coefficient for each power. 
 * Constants are viewed as coefficients of x^0 (x to the power 0)
 * Highest power in polynomial has non-zero coefficient.
 * Zero then has to be a special case, viewed as polynomial of degree -1
 * 
 * @author blink
 * @version 1.1
 */
public interface Polynomial {
    
    /**
     * return coefficient of term corresponding to a power.
     * If polynomial does not have a term for that power
     *  then return zero.
     * @param power the exponent of the term requested
     * @return the coefficient of the term requested
     */
    double coef(int power);

    /**
     * Degree of polynomial is highest power term with non-zero exponent.
     * Zero has degree -1, other constants have degree 0
     * @return degree of this polynomial
     */
    int degree();

    /**
     * Evaluate this polynomial with a specific values of x.
     * @param x value to substitute for polynomial's free variable.
     * @return value of polynomial at x.
     */
    double eval(double x);

    /**
     * Adds this polynomial to parameter.
     * @param other second polynomial to add
     * @return sum of this + other
     */
    Polynomial add(Polynomial other);
    
    /**
     * Subtract parameter from this polynomial.
     * @param other polynomial to subtract from this
     * @return difference
     */
    Polynomial sub(Polynomial other);
    
    /**
     * Multiply parameter by this polynomial.
     * @param other parameter to multiply by
     * @return product
     */
    Polynomial mul(Polynomial other);
    
    /**
     * multiply this polynomial by the scalar other.
     * @param other scalar to multiply by
     * @return product
     */
    Polynomial mul(double other);
    
    /**
     * Derivative.  coef(i-1) = i * coef(i)
     * @return derivative of this
     */
    Polynomial d();
    
    /**
     * integral coef(i) == (1.0 / i) * coef(i - 1) .
     * @param c constant to add
     * @return integral of this.
     */
    Polynomial i(double c);
    
    /**
     * Format polynomial coefficients in normal reading order with
     * highest order term on left. Values in [] and separated with commas.
     * Examples: [1] for 1, [1, 2] for x + 1, [1, 2, 3] for x^2 + 2x + 3
     * [] for 0
     * @return resulting string.
     */
    String toString();
}
