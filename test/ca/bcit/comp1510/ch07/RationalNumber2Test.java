package ca.bcit.comp1510.ch07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Simple test of Rational class.
 * 
 * @author blink
 * @version 1
 */
public class RationalNumber2Test {
    /** first test value. */
    private RationalNumber2 r1;
    
    /** second test value/. */
    private RationalNumber2 r2;
    
    /** initialize r1, r2 for all tests. */
    @BeforeEach
    public void setUp() {
        int num1 = 6;
        int den1 = 8;
        int num2 = 1;
        int den2 = 3;
        r1 = new RationalNumber2(num1, den1);
        r2 = new RationalNumber2(num2, den2);
    }
    
    /**
     * Test creation.
     */
    @Test
    public void testCreation() {
        RationalNumber2 r = new RationalNumber2(1, 1);
        assertEquals(1, r.getNumerator());
        assertEquals(1, r.getDenominator());
        assertThrows(IllegalArgumentException.class,
                () -> {new RationalNumber2(2, 0);} );

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
        RationalNumber2 r = new RationalNumber2(num, den);
        assertEquals(numOut, r.getNumerator(), "Numerator wrong");
        assertEquals(denOut, r.getDenominator(), "Denominator wrong");
    }
    
    /** Test equals. */
    @Test
    public void testSame() {
        final RationalNumber2 reduced = new RationalNumber2(3, 4);
        assertFalse(r1.equals(r2), "Falsely equal");
        assertTrue(r1.equals(reduced), "Falsly different");
    }

    /** Test reciprocal. */
    @Test
    public void testReciprocal() {
        final RationalNumber2 recipR1 = new RationalNumber2(4, 3);
        final RationalNumber2 recipR2 = new RationalNumber2(3, 1);

        assertTrue(r1.reciprocal().equals(recipR1), "Wrong reciprocal");
        assertTrue(r2.reciprocal().equals(recipR2), "Wrong reciprocal");
    }

    /** Test add. */
    @Test
    public void testAdd() {
        final RationalNumber2 answer = new RationalNumber2(13, 12);

        assertTrue(r1.add(r2).equals(answer));
        assertTrue(r2.add(r1).equals(answer));
    }

    /** Test subrtact. */
    @Test
    public void testSubtract() {
        final RationalNumber2 answer = new RationalNumber2(5, 12); 
        assertTrue(r1.subtract(r2).equals(answer));
        final RationalNumber2 answer2 = new RationalNumber2(-5, 12); 
        assertTrue(r2.subtract(r1).equals(answer2));
        
    }

    /** Test multiply. */
    @Test
    public void testMultiply() {
        final RationalNumber2 answer = new RationalNumber2(1, 4); 
        assertTrue(r1.multiply(r2).equals(answer));
        assertTrue(r2.multiply(r1).equals(answer));
    }

    /** Test divide. */
    @Test
    public void testDivide() {
        final RationalNumber2 answer = new RationalNumber2(9, 4); 
        assertTrue(r1.divide(r2).equals(answer));
        
        final RationalNumber2 answer2 = new RationalNumber2(4, 9);
        assertTrue(r2.divide(r1).equals(answer2));
        
    }
    
    /** test toString. */
    @Test
    public void testToString() {
        final RationalNumber2 test1 = new RationalNumber2(0, 2);
        final RationalNumber2 test2 = new RationalNumber2(23, 1);
        final RationalNumber2 test3 = new RationalNumber2(46, 2);
        final RationalNumber2 test4 = new RationalNumber2(5, 7);
        
        assertEquals("0", test1.toString(), "should be 0");
        assertEquals("23", test2.toString(), "should be 23");
        assertEquals("23", test3.toString(), "should be 23");
        assertEquals("5/7", test4.toString(), "should be 5/7");
    }

}
