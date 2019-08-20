package ca.bcit.comp1510.ch05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * A dummy test-case to demonstrate how to use a test-suite.
 * 
 * @author blink
 * @version 1
 */
public class CaseA {
    /**
     * Dummy test.
     */
    @Test
    public void testA1() {
        assertEquals("PlaceHolderA1", 2, 1 + 1);
    }
    
    /**
     * Dummy test.
     */
    @Test
    public void testA2() {
        assertEquals("PlaceHolderA2", 0, 2 - 2);
    }
}
