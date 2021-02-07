package ca.bcit.comp1510.ch08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayPolynomialsConstructorsTest {

    @Test
    void testConstructor1() {
        assertDoesNotThrow(() -> {
            new ArrayPolynomial();
        }, "should construct zero polynomial");

    }

    @Test
    void testConstructor2() {
        assertDoesNotThrow(() -> {
            new ArrayPolynomial(0);
        }, "should construct zero polynomial");

    }

    @Test
    void testConstructor3() {
        assertDoesNotThrow(() -> {
            new ArrayPolynomial(1);
        }, "should constuct polynomial 1");

    }

    @Test
    void testConstructor4() {
        assertDoesNotThrow(() -> {
            new ArrayPolynomial(1, 1);
        }, "should construct polymonial 1 + x");

    }

    @Test
    void testConstructor5() {
        assertThrows(IllegalArgumentException.class, 
                () -> {new ArrayPolynomial(null);},
                "illegal to pass null to constructor");
    }

}
