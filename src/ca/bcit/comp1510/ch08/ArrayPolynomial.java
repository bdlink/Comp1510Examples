package ca.bcit.comp1510.ch08;

/**
 * Implements a polynomial in one variable.
 * @author blink
 * @version 1.0
 */
public class ArrayPolynomial implements Polynomial {
    
    /** ZERO is polynomial with one zero coefficient.*/
    public static final ArrayPolynomial ZERO = new ArrayPolynomial();
    
    /** ONE is polynomial with correspong to double value 1.0 . */
    public static final ArrayPolynomial ONE = new ArrayPolynomial(1.0);
    
    /**
     * Holds coefficients of polynomial with index the exponent of the
     *    independent variable.
     * a[i] is the coefficient of x ** i
     * Satisfies a[length-1] != 0.0
     * So 0 is represented by an empty array, length 0.
     */
    private double[] a;
  
    /**
     * Create a polynomial from coefficients.  The coefficients are 
     *  provided from lower order to higher order.  
     *  Example: the polynomial 3x + 1 will be created by calling
     *  createInstance(1, 3) 
     *  If called with no parameters, 0 will be returned.
     * 
     * @param coefs holds the coefficients of desired polynomial.
     * @throws IllegalArgumentException if parameter is null value
     */
    public ArrayPolynomial(double... coefs) {
        if (coefs == null) {
            throw new IllegalArgumentException(
                     "Parameters to constructor cannot be null");
        }
        a = reduce(coefs);

    }
    
    /**
     *  Return coefficient array that has highest coefficient is non-zero
     *  and represents the same polynomial as parameter.
     *  
     *  Return deep copy of parameters so no aliasing possible.
     * @param a coefficients of a polynomial
     * @return reduced set of coefficients
     * 
     */
    private static double[] reduce(double[] a) {
        int degree = a.length - 1;
        while (degree >= 0 && a[degree] == 0.0) {
            degree--;
        }
        double[] result = new double[degree + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i];
        }
        return result;
    }
      
    @Override
    public double eval(double x) {
        double result = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            result = result * x + a[i];
        }
        return result;
    }
    
    @Override
    public double coef(int power) {
        if (power < 0) {
            throw new IllegalArgumentException("power must be >= 0");
        }
        if (power < a.length) {
            return a[power];
        } else {
            return 0.0;
        }
    }
    
    @Override
    public int degree() {
        return a.length - 1;
    }
    

    @Override
    public Polynomial add(Polynomial other) {
        int degree = Math.max(this.a.length, other.degree() + 1);
        double[] result = new double[degree];
        for (int i = 0; i < degree; i++) {
            result[i] = coef(i) + other.coef(i);
        }
        return new ArrayPolynomial(result);
    }
    
    @Override
    public Polynomial sub(Polynomial other) {
        int degree = Math.max(degree(), other.degree());
        double[] result = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            result[i] = coef(i) - other.coef(i);
        }
        return new ArrayPolynomial(result);

    }
    

    @Override
    public Polynomial mul(Polynomial other) {
        int degree = degree() + other.degree();
        if (degree < 0) {
            return ZERO;
        }
        double[] result = new double[degree + 1];
        for (int i = 0; i <= degree; i++) {
            result[i] = 0;
            for (int j = 0; j <= i; j++) {
                result[i] += coef(j) * other.coef(i - j);
            }
        }
        return new ArrayPolynomial(result);
    }
    
    @Override
    public Polynomial mul(double other) {
        double[] result = new double[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = other * a[i];
        }
        return new ArrayPolynomial(result);
    }
    
    @Override
    public Polynomial d() {
        if (a.length == 0) {
            return new ArrayPolynomial(0);
        }
        double[] result = new double[a.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * a[i + 1];
        }
        return new ArrayPolynomial(result);
    }
    

    @Override
    public Polynomial i(double c) {
        double[] result = new double[a.length + 1];
        result[0] = c;
        for (int i = 1; i < result.length; i++) {
            result[i] = a[i - 1] / i;
        }
        return new ArrayPolynomial(result);
    }
    

    @Override
    public String toString() {
        if (a.length == 0) {
            return "[]";
        } else {
            String result = "[" + a[a.length - 1];
            for (int i = a.length - 2; i >= 0; i--) {
                result += ", " + a[i];
            }
            result += ']';
            return result;
        }
    }
}
