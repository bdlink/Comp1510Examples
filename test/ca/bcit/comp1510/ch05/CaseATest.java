package ca.bcit.comp1510.ch05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * A dummy test-case to demonstrate how to use a test-suite.
 * 
 * @author blink
 * @version 1
 */
public class CaseATest {
    /**
     * Dummy test.
     */
    @Test
    public void testA1() {
        assertEquals(2, 1 + 1, "PlaceHolderA1");
    }
    
    /**
     * Dummy test.
     */
    @Test
    public void testA2() {
        assertEquals(0, 2 - 2, "PlaceHolderA2");
    }
}
