package ca.bcit.comp1510.ch04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DieTest {
    
    private Die d = new Die();

    @Test
    void testDie() {
        assertAll(
                () -> {assertEquals(1, new Die().getFaceValue(), 
                        "new Die() should have face value 1");},
                () -> {assertNotNull(new Die(), 
                        "new Die() returns an object reference");});
    }

    @Test
    void testRoll() {
        int face;
        for (int i = 0; i < 100; i++) {
            face = d.roll();
            assertTrue(1 <= face && face <= Die.MAX);
        }
    }

    @Test
    void testSetFaceValue() {
        for (int i = 1; i <= Die.MAX; i++) {
            d.setFaceValue(i);
            assertEquals(i, d.getFaceValue(), "should be " + i);
        }
        
    }

    @Test
    void testGetFaceValue() {
        int face;
        for (int i = 0; i < 100; i++) {
            face = d.roll();
            assertEquals(face, d.getFaceValue(), "should be " + face);
        }
    }

    @Test
    void testToString() {
        int face;
        for (int i = 0; i < 100; i++) {
            face = d.roll();
            assertEquals("" + face, d.toString(), "should be \"" + face + "\"");
        }
    }

}
