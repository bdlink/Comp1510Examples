package ca.bcit.comp1510.ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Simple test of Rational class.
 * 
 * @author blink
 * @version 1
 */
public class RationalTest {
    /** first test value. */
    private Rational r1;
    
    /** second test value/. */
    private Rational r2;
    
    /** initialize r1, r2 for all tests. */
    @BeforeEach
    public void setUp() {
        int num1 = 6;
        int den1 = 8;
        int num2 = 1;
        int den2 = 3;
        r1 = new Rational(num1, den1);
        r2 = new Rational(num2, den2);
    }
    
    /**
     * Test creation.
     */
    @Test
    public void testCreation() {
        Rational r = new Rational(1, 1);
        assertEquals(1, r.getNumerator());
        assertEquals(1, r.getDenominator());
        r = new Rational(1, 0);
        assertEquals(1, r.getNumerator());
        assertEquals(1, r.getDenominator());
    }
    
    /**
     * Test creation with common divisor.
     */
    @Test
    public void testCreationReduction() {
        final int num = 6;
        final int den = 4;
        final int numOut = 3;
        final int denOut = 2;
        Rational r = new Rational(num, den);
        assertEquals(numOut, r.getNumerator(), "Numerator wrong");
        assertEquals(denOut, r.getDenominator(), "Denominator wrong");
    }
    
    /** Test isLike. */
    @Test
    public void testSame() {
        final Rational reduced = new Rational(3, 4);
        assertFalse(r1.isLike(r2), "Falsely equal");
        assertTrue(r1.isLike(reduced), "Falsly different");
    }

    /** Test reciprocal. */
    @Test
    public void testReciprocal() {
        final Rational recipR1 = new Rational(4, 3);
        final Rational recipR2 = new Rational(3, 1);

        assertTrue(r1.reciprocal().isLike(recipR1), "Wrong reciprocal");
        assertTrue(r2.reciprocal().isLike(recipR2), "Wrong reciprocal");
    }

    /** Test add. */
    @Test
    public void testAdd() {
        final Rational answer = new Rational(13, 12);

        assertTrue(r1.add(r2).isLike(answer));
        assertTrue(r2.add(r1).isLike(answer));
    }

    /** Test subtract. */
    @Test
    public void testSubtract() {
        final Rational answer = new Rational(5, 12); 
        assertTrue(r1.subtract(r2).isLike(answer));
        final Rational answer2 = new Rational(-5, 12); 
        assertTrue(r2.subtract(r1).isLike(answer2));
        
    }

    /** Test multiply. */
    @Test
    public void testMultiply() {
        final Rational answer = new Rational(1, 4); 
        assertTrue(r1.multiply(r2).isLike(answer));
        assertTrue(r2.multiply(r1).isLike(answer));
    }

    /** Test divide. */
    @Test
    public void testDivide() {
        final Rational answer = new Rational(9, 4); 
        assertTrue(r1.divide(r2).isLike(answer));
        
        final Rational answer2 = new Rational(4, 9);
        assertTrue(r2.divide(r1).isLike(answer2));
        
    }
    
    /** test toString. */
    @Test
    public void testToString() {
        final Rational test1 = new Rational(0, 2);
        final Rational test2 = new Rational(23, 1);
        final Rational test3 = new Rational(46, 2);
        final Rational test4 = new Rational(5, 7);
        
        assertEquals("0", test1.toString(), "should be 0");
        assertEquals("23", test2.toString(), "should be 23");
        assertEquals("23", test3.toString(), "should be 23");
        assertEquals("5/7", test4.toString(), "should be 5/7");
    }

}
