package ca.bcit.comp1510.ch05;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ca.bcit.comp1510.ch05.Rational;

/**
 * A sample parameterized test-case.
 * 
 * @author blink
 * @version 1
 */
@RunWith(value = Parameterized.class)
public class ParameterizedRationalTest {

    private int expectedOne; 
    private int expectedTwo; 
    private int valueOne; 
    private int valueTwo; 

    @Parameters 
    public static Collection<Integer[]> getTestParameters() {
       return Arrays.asList(new Integer[][] {
          {1, 1, 1, 1},  //expectedOne, expectedTwo, valueOne, valueTwo   
          {3, 2, 6, 4},     
          {7, 3, 49, 21},
          {23, 1, 23, 0}
       });
    }

    public ParameterizedRationalTest(int eOne, int eTwo,
       int vOne, int vTwo) {
       expectedOne = eOne;
       expectedTwo = eTwo;
       valueOne = vOne;
       valueTwo = vTwo;
    }

    @Test
    public void creationTest() {
       Rational r = new Rational(valueOne, valueTwo);
       assertEquals(expectedOne, r.getNumerator());
       assertEquals(expectedTwo, r.getDenominator());
    } 
}

