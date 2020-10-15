package ca.bcit.comp1510.ch05;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * A sample parameterized test-case.
 * 
 * @author blink
 * @version 1
 */
public class ParameterizedRationalTest {

    /** 
     * Test Rational creation.
     * @param expectedOne expected numerator
     * @param expectedTwo expected denomoninator
     * @param valueOne raw numerator
     * @param valueTwo raw denominator
     */
    @ParameterizedTest
    @CsvSource({"1, 1, 1, 1", "3, 2, 6, 4", "7, 3, 49, 21", "23, 1, 23, 0"})
    public void creationTest(int expectedOne, int expectedTwo, int valueOne,
            int valueTwo) {
        Rational r = new Rational(valueOne, valueTwo);
        assertEquals(expectedOne, r.getNumerator());
        assertEquals(expectedTwo, r.getDenominator());
    } 
}

