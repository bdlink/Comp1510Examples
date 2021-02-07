package ca.bcit.comp1510.ch08;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ArrayPolynomialTest {
    /** ZERO is polynomial with one zero coefficient. Has degree -1. 
     * Should be the same as calling new ArrayPolynomial() */
    private Polynomial ZERO = new ArrayPolynomial(0);
    
    /** ONE is polynomial corresponding to double value 1.0 . */
    private Polynomial ONE = new ArrayPolynomial(1.0);

    /** 0x^5 + 0x^4 + 0x^3 + 0x^2 + 0x + 0 to check effect of higher zero coefs
     * especially on degree.*/
    private Polynomial f0a = new ArrayPolynomial(0, 0, 0, 0, 0, 0); 
    
    /** 0x + 5 to check effect of higher order zero coefs, such as degree.*/
    private Polynomial f1a = new ArrayPolynomial(5, 0);
    
    /** 3, nothing special.*/
    private Polynomial f2 = new ArrayPolynomial(3);
    
    /** x + 1 .*/
    private Polynomial f3 = new ArrayPolynomial(1, 1);
    
    /** 3x + 1 .*/
    private Polynomial f4 = new ArrayPolynomial(1, 3);
    
    /** 0x^5 + 0x^4 + 0x^3 + 0x^2 + 3x + 1 to check effect of higher order zeros.*/
    private Polynomial f4a = new ArrayPolynomial(1, 3, 0, 0, 0, 0);
    
    /** x^2 + 2x + 1 .*/
    private Polynomial f5 = new ArrayPolynomial(1, 2, 1);
    
    /** x^2 + 2x + 3 .*/
    private Polynomial f6 = new ArrayPolynomial(3, 2, 1);
    

    
    private static boolean equals(Polynomial a, Polynomial b) {
        if (a.degree() != b.degree()) {
            return false;
        }
        for (int i = 0; i <= a.degree(); i++) {
            if (a.coef(i) != b.coef(i)) {
                return false;
            }
        }
        return true;
    }
    
//    @Test
//    void testEquals() {
//        assertAll(
//                () -> {assertFalse(equals(f2, f3));},
//                () -> {assertFalse(equals(f3, f4));},
//                () -> {assertTrue(equals(f0, f0));},
//                () -> {assertTrue(equals(f1, f1));},
//                () -> {assertTrue(equals(f2, f2));},
//                () -> {assertTrue(equals(f3, f3));},
//                () -> {assertTrue(equals(f4, f4));},
//                () -> {assertTrue(equals(f4a, f4a));},
//                () -> {assertTrue(equals(f5, f5));},
//                () -> {assertTrue(equals(ZERO, ZERO));},
//                () -> {assertTrue(equals(ONE, ONE));},
//                () -> {assertFalse(equals(ZERO, ONE));});
//        
//    }
    
    
    @Test
    void testCoef1() {
        assertEquals(0, ZERO.coef(0), "0th coef of zero should be zero");
     }
    
    @Test
    void testCoef2() {
        assertEquals(1, ONE.coef(0), "0th coef of 1 should be 1");
     }
    
    @Test
    void testCoef3() {
        assertAll(
                () -> {assertEquals(0, f0a.coef(0), 
                        "0th coef of 0x^5 + 0x^4 + 0x^3 + 0x^2 + 0x + 0 should be 0");},
                () -> {assertEquals(5, f1a.coef(0), 
                        "0th coef of 0x + 5 should be 5");});
    }

    @Test
    void testCoef4() {
        assertAll(
                () -> {assertEquals(0, f0a.coef(1), 
                        "1st coef of 0x^5 + 0x^4 + 0x^3 + 0x^2 + 0x + 0 should be 0");},
                () -> {assertEquals(0, f1a.coef(1),
                        "1st coef of 0x + 5 should be 0");}
                );
    }
                
    @Test
    void testCoef5() {
        assertAll(
                () -> {assertEquals(3, f2.coef(0), 
                        "0th coef of 3 should be 3");}
);
    }
                
    @Test
    void testCoef6() {
        assertAll(
                () -> {assertEquals(0, f2.coef(1), 
                        "1st coef of 3 should be 0");},
                () -> {assertEquals(0, f2.coef(2), 
                        "2nd coef of 3 should be 0");},
                () -> {assertEquals(0, f2.coef(3), 
                        "3rd coef of 3 should be 0");});
    }
                
    @Test
    void testCoef7() {
        assertAll(
                () -> {assertEquals(1, f4.coef(0),
                        "0th coef of 3x + 1 should be 1");},
                () -> {assertEquals(3, f4.coef(1), 
                        "1st coef of 3x + 1 should be 3");});
    }
                
    @Test
    void testCoef8() {
        assertAll(
                () -> {assertEquals(0, f4.coef(2),
                        "2nd coef of 3x + 1 should be 0");},
                () -> {assertEquals(0, f4.coef(3),
                        "3nd coef of 3x + 1 should be 0");},
                () -> {assertEquals(0, f4.coef(4),
                        "4nd coef of 3x + 1 should be 0");},
                () -> {assertEquals(0, f4.coef(5),
                        "5nd coef of 3x + 1 should be 0");});
    }
                
    @Test
    void testCoef9() {
        assertAll(
                () -> {assertEquals(1, f4a.coef(0),
                        "0th coef of 0x^5 + 0x^4 + 0x^3 + 0x^2 + 3x + 1 should be 1");},
                () -> {assertEquals(3, f4a.coef(1),
                        "1st coef of 0x^5 + 0x^4 + 0x^3 + 0x^2 + 3x + 1 should be 3");});
    }

    @Test
    void testCoef10() {
        assertAll(
                () -> {assertEquals(0, f4a.coef(2),
                        "2nd coef of 0x^5 + 0x^4 + 0x^3 + 0x^2 + 3x + 1 should be 0");});
    }
                
    @Test
    void testCoef11() {
        assertAll(
                () -> {assertEquals(1, f5.coef(0),
                        "0th coef of x^2 + 2x + 1 should be 1");},
                () -> {assertEquals(2, f5.coef(1),
                        "1st coef of x^2 + 2x + 1 should be 2");},
                () -> {assertEquals(1, f5.coef(2),
                        "2nd coef of x^2 + 2x + 1 should be 1");});
    }

    @Test
    void testCoef12() {
        assertAll(
                () -> {assertEquals(3, f6.coef(0),
                        "0th coef of x^2 + 2x + 3 should be 3");},
                () -> {assertEquals(2, f6.coef(1),
                        "1st coef of x^2 + 2x + 3 should be 2");},
                () -> {assertEquals(1, f6.coef(2),
                        "2nd coef of x^2 + 2x + 3 should be 1");});
    }

    @Test
    void testCoef13() {
        assertAll(
                () -> {assertThrows(IllegalArgumentException.class, 
                        () -> {f2.coef(-1);}, 
                        "negative parameter to coef() should throw IllegalArgumentException");
                },
                () -> {assertThrows(IllegalArgumentException.class, 
                        () -> {f3.coef(-2);},
                        "negative parameter to coef() should throw IllegalArgumentException");
                },
                () -> {assertThrows(IllegalArgumentException.class, 
                        () -> {f4.coef(-3);},
                        "negative parameter to coef() should throw IllegalArgumentException");
                });
    }

    @Test
    void testDegree1() {
        assertEquals(-1, ZERO.degree(), "0 should have degree -1");
     }
    
    @Test
    void testDegree2() {
        assertEquals(0, ONE.degree(), "1 should have degree 0");
     }
    
    @Test
    void testDegree3() {
        assertEquals(-1, f0a.degree(), 
                "0x^5 + 0x^4 + 0x^3 + 0x^2 + 0x + 0 should have degree -1");
     }
    
    @Test
    void testDegree4() {
        assertEquals(0, f1a.degree(), "0x + 5 should have degree 0");
     }
    
    @Test
    void testDegree5() {
        assertEquals(0, f2.degree(), "3 should have degree 0");
     }
    
    @Test
    void testDegree6() {
        assertEquals(1, f4.degree(), "3x + 1 should have degree 1");
     }
    
    @Test
    void testDegree7() {
        assertEquals(2, f5.degree(), "x^2 + 2x + 1 should have degree 2");
     }
    
    @Test
    void testDegree8() {
        assertEquals(1, f4a.degree(), 
                "0x^5 + 0x^4 + 0x^3 + 0x^2 + 3x + 1 should have degree 1");
     }
    
    @Test
    void testDegree9() {
        assertEquals(-1, new ArrayPolynomial().degree(), 
                "constructor with no arguments should create 0, degree -1");
     }
    
    @Test
    void testEval1() {
        assertAll(
                () -> {assertEquals(0, ZERO.eval(13), 
                        "0 eval at 13 should be 0");},
                () -> {assertEquals(0, ZERO.eval(24.3), 
                        "0 eval at 24.3 should be 0");});
    }
    
    @Test
    void testEval2() {
        assertAll(
                () -> {assertEquals(1, ONE.eval(23), 
                        "1 eval at 23 should be 1");},
                () -> {assertEquals(1, ONE.eval(0), 
                        "1 eval at 0 should be 1");});
    }
    
    @Test
    void testEval3() {
        assertAll(
                () -> {assertEquals(5, f1a.eval(37), 
                        "0x + 5 eval at 37 should be 5");},
                () -> {assertEquals(5, f1a.eval(0), 
                        "0x + 5 eval at 0 should be 5");});
    }
    
    @Test
    void testEval4() {
        assertAll(
                () -> {assertEquals(0, f3.eval(-1), 
                        "x + 1 eval at -1 should equal 0");},
                () -> {assertEquals(1, f3.eval(0), 
                        "x + 1 eval at 0 should equal 1");},
                () -> {assertEquals(2, f3.eval(1), 
                        "x + 1 eval at 1 should equal 2");},
                () -> {assertEquals(3, f3.eval(2), 
                        "x + 1 eval at 2 should equal 3");});
    }
    
    @Test
    void testEval5() {
        assertAll(
                () -> {assertEquals(-2, f4.eval(-1), 
                        "3x + 1 eval at -1 should equal -2");},
                () -> {assertEquals(1, f4.eval(0), 
                        "3x + 1 eval at 0 should equal 0");},
                () -> {assertEquals(4, f4.eval(1), 
                        "3x + 1 eval at 1 should equal 4");});
    }
    
    @Test
    void testEval6() {
        assertAll(
                () -> {assertEquals(7, f4.eval(2), 
                        "3x + 1 eval at 2 should equal 7");},
                () -> {assertEquals(0, f5.eval(-1), 
                        "x^2 + 2x + 1 eval at -1 should be 0");},
                () -> {assertEquals(4, f5.eval(1), 
                        "x^2 + 2x + 1 eval at 1 should be 4");});
    }
    
    
    @Test
    void testEval7() {
        assertAll(
                () -> {assertEquals(36, f5.eval(5), 
                        "x^2 + 2x + 1 eval at 5 should be 36");},
                () -> {assertEquals(9, f5.eval(2), 
                        "x^2 + 2x + 1 eval at 2 should be 9");});
    }
    
    
    @Test
    void testAdd0() {
        ArrayPolynomial two = new ArrayPolynomial(2);
        assertAll(
                () -> {assertTrue(equals(two, ONE.add(ONE)),
                         "1 plus 1 should equal 2");},
                () -> {assertTrue(equals(f2, ONE.add(two)),
                         "1 plus 2 should equal 3");},
                () -> {assertTrue(equals(f2, ZERO.add(f2)),
                         "0 plus 3 should equal 3");});
    }

                
    @Test
    void testAdd1() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.add(ZERO)), "0 plus 0 should equal 0");},
                () -> {assertTrue(equals(f1a, 
                        ZERO.add(f1a)), "0 plus 0x + 5 should equal 0x + 5");},
                () -> {assertTrue(equals(f2, 
                        ZERO.add(f2)), "0 plus 3 should equal 3");});
    }

    @Test
    void testAdd2() {
        assertAll(
                () -> {assertTrue(equals(f3, 
                        ZERO.add(f3)), "0 plus x + 1 should equal x + 1");},
                () -> {assertTrue(equals(f4, 
                        ZERO.add(f4)), "0 plus 3x + 1 should equal 3x + 1");});
    }

    @Test
    void testAdd3() {
        assertAll(
                () -> {assertTrue(equals(f1a, 
                        f1a.add(ZERO)), "0x + 5 plus 0 should equal 0x + 5");},
                () -> {assertTrue(equals(f2, 
                        f2.add(ZERO)), "3 plus 0 should equal 3");});
    }
    
    @Test
    void testAdd4() {
        assertAll(
                () -> {assertTrue(equals(f3, 
                        f3.add(ZERO)), "x + 1 plus 0 should equal x + 1");},
                () -> {assertTrue(equals(f4, 
                        f4.add(ZERO)), "3x + 1 plus 0 should equal 3x + 1");},
                () -> {assertTrue(equals(f5, 
                        f5.add(ZERO)), 
                        "x^2 + 2x + 1 plus 0 should equal x^2 + 2x + 1");});
    }
    
    @Test
    void testAdd5() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(8), 
                        f1a.add(f2)), "0x + 5 plus 3 should equal 8");},
                () -> {assertTrue(equals(new ArrayPolynomial(8), 
                        f2.add(f1a)), "3 plus 0x + 5 should equal 8");});
    }
    
    @Test
    void testAdd6() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(6, 1), 
                        f1a.add(f3)), "0x + 5 plus x + 1 should equal x + 6");},
                () -> {assertTrue(equals(new ArrayPolynomial(6, 1), 
                        f3.add(f1a)), "x + 1 plus 0x + 5 should equal x + 6");},
                () -> {assertTrue(equals(new ArrayPolynomial(2, 5, 1), 
                        f4.add(f5)), 
                        "3x + 1 plus x^2 + 2x + 1 should equal x^2 + 5x + 1");});
    }
    
    @Test
    void testAdd7() {
        assertAll(
                () -> {assertTrue(equals(ONE, 
                        ZERO.add(ONE)), "0 plus 1 should equal 1");},
                () -> {assertTrue(equals(ONE, 
                        ONE.add(ZERO)), "1 plus 0 should equal 1");});
    }
    
    @Test
    void testAdd8() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(2, 5, 1), 
                        f5.add(f4)), "x^2 + 2x + 1 plus 3x + 1 should equal x^2 + 5x + 2");},
                () -> {assertTrue(equals(ZERO, 
                        f5.add(new ArrayPolynomial(-1, -2, -1))),
                        "x^2 + 2x + 1 plus -x^2 - 2x - 1 should equal 0");},
                () -> {assertTrue(equals(ZERO, 
                        new ArrayPolynomial(-1, -2, -1).add(f5)), 
                        "-x^2 - 2x - 1 plus x^2 + 2x + 1 should equal 0");});
    }
    
    @Test
    void testAdd9() {
        assertAll(
                () -> {assertTrue(equals(f5, 
                        ZERO.add(f5)), 
                        "0 plus x^2 + 2x + 1 should equal x^2 + 2x + 1");},
                () -> {assertTrue(equals(ONE, 
                        f5.add(new ArrayPolynomial(0, -2, -1))), 
                        "x^2 + 2x + 1 plus -x^2 - 2x should equal 1");});
    }
    
    @Test
    void testAdd10() {
        assertAll(
                () -> {assertTrue(equals(ONE, 
                        new ArrayPolynomial(0, -2, -1).add(f5)), 
                        "-x^2 - 2x plus x^2 + 2x + 1 should equal 1");},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 0, 1), 
                        f5.add(new ArrayPolynomial(-1, -2))), 
                        "x^2 + 2x + 1 plus -2x - 1 should equal x^2");},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 0, 1), 
                        new ArrayPolynomial(-1, -2).add(f5)), 
                        "-2x - 1 plus x^2 + 2x + 1 should equal x^2");});
    }
    
    @Test
    void testSub1() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.sub(ZERO)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-1), 
                        ZERO.sub(ONE)));},
                () -> {assertTrue(equals(ONE, 
                        ONE.sub(ZERO)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, -1, 1), 
                        f5.sub(f4)));});
    }

    @Test
    void testSub2() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(2), 
                        f1a.sub(f2)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-2), 
                        f2.sub(f1a)));},
                () -> {assertTrue(equals(new ArrayPolynomial(4, -1), 
                        f1a.sub(f3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-4, 1), 
                        f3.sub(f1a)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 1, -1), 
                        f4.sub(f5)));});
    }
    
    @Test
    void testSub3() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        f1a.sub(f1a)));},
                () -> {assertTrue(equals(ZERO, 
                        f2.sub(f2)));},
                () -> {assertTrue(equals(ZERO, 
                        f3.sub(f3)));},
                () -> {assertTrue(equals(ZERO, 
                        f4.sub(f4)));},
                () -> {assertTrue(equals(ZERO, 
                        f5.sub(f5)));});
    }
    
    @Test
    void testSub4() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(-2,-4,-2), 
                        new ArrayPolynomial(-1, -2, -1).sub(f5)));},
                () -> {assertTrue(equals(ONE, 
                        f5.sub(new ArrayPolynomial(0, 2, 1))));},
                () -> {assertTrue(equals(ONE, 
                        new ArrayPolynomial(2, 2, 1).sub(f5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 0, 1), 
                        f5.sub(new ArrayPolynomial(1, 2))));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 0, -1), 
                        new ArrayPolynomial(1, 2).sub(f5)));});
    }
    
    @Test
    void testMulPolynomial21() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(ZERO)));},
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(ONE)));},
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(f1a)));},
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(f2)));},
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(f3)));});
    }
    
    @Test
    void testMulPolynomial22() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(f4)));},
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(f5)));},
                () -> {assertTrue(equals(ZERO, 
                        f1a.mul(ZERO)));},
                () -> {assertTrue(equals(ZERO, 
                        f2.mul(ZERO)));},
                () -> {assertTrue(equals(ZERO, 
                        f3.mul(ZERO)));});
    }
    
    @Test
    void testMulPolynomial23() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        f4.mul(ZERO)));},
                () -> {assertTrue(equals(ZERO, 
                        f5.mul(ZERO)));},
                () -> {assertTrue(equals(ZERO, 
                        ONE.mul(ZERO)));},
                () -> {assertTrue(equals(ONE, 
                        ONE.mul(ONE)));},
                () -> {assertTrue(equals(f1a, 
                        ONE.mul(f1a)));});
    }
    
    @Test
    void testMulPolynomial24() {
        assertAll(
                () -> {assertTrue(equals(f2, 
                        ONE.mul(f2)));},
                () -> {assertTrue(equals(f3, 
                        ONE.mul(f3)));},
                () -> {assertTrue(equals(f4, 
                        ONE.mul(f4)));},
                () -> {assertTrue(equals(f5, 
                        ONE.mul(f5)));},
                () -> {assertTrue(equals(f1a, 
                        f1a.mul(ONE)));});
    }
    
    @Test
    void testMulPolynomial25() {
        assertAll(
                () -> {assertTrue(equals(f2, 
                        f2.mul(ONE)));},
                () -> {assertTrue(equals(f3, 
                        f3.mul(ONE)));},
                () -> {assertTrue(equals(f4, 
                        f4.mul(ONE)));},
                () -> {assertTrue(equals(f5, 
                        f5.mul(ONE)));},
                () -> {assertTrue(equals(new ArrayPolynomial(15), 
                        f1a.mul(f2)));});
    }
    
    @Test
    void testMulPolynomial26() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(15), 
                        f2.mul(f1a)));},
                () -> {assertTrue(equals(new ArrayPolynomial(5, 5), 
                        f1a.mul(f3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(5, 5), 
                        f3.mul(f1a)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 5, 7, 3), 
                        f4.mul(f5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 5, 7, 3), 
                        f5.mul(f4)));});
    }
    
    @Test
    void testMulPolynomial27() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(25), 
                        f1a.mul(f1a)));},
                () -> {assertTrue(equals(new ArrayPolynomial(9), 
                        f2.mul(f2)));},
                () -> {assertTrue(equals(f5, 
                        f3.mul(f3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 6, 9), 
                        f4.mul(f4)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 4, 6, 4, 1), 
                        f5.mul(f5)));});
   }
    
    @Test
    void testMulPolynomial28() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(1, 3, 3, 1), 
                        f3.mul(f5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 3, 3, 1), 
                        f5.mul(f3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-1, -4, -6, -4, -1), 
                        new ArrayPolynomial(-1, -2, -1).mul(f5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-1, -4, -6, -4, -1), 
                        f5.mul(new ArrayPolynomial(-1, -2, -1))));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 2, 5, 4, 1), 
                        f5.mul(new ArrayPolynomial(0, 2, 1))));});
    }
    
    @Test
    void testMulPolynomial29() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(0, 2, 5, 4, 1), 
                        new ArrayPolynomial(0, 2, 1).mul(f5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(2, 6, 7, 4, 1), 
                        new ArrayPolynomial(2, 2, 1).mul(f5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(2, 6, 7, 4, 1), 
                        f5.mul(new ArrayPolynomial(2, 2, 1))));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 4, 5, 2), 
                        f5.mul(new ArrayPolynomial(1, 2))));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 4, 5, 2), 
                        new ArrayPolynomial(1, 2).mul(f5)));});
    }
    
    @Test
    void testMulDouble1() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.mul(0)));},
                () -> {assertTrue(equals(ZERO, 
                        ONE.mul(0)));},
                () -> {assertTrue(equals(ZERO, 
                        f1a.mul(0)));},
                () -> {assertTrue(equals(ZERO, 
                        f2.mul(0)));},
                () -> {assertTrue(equals(ZERO, 
                        f3.mul(0)));});
    }
    
    @Test
    void testMulDouble2() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        f4.mul(0)));},
                () -> {assertTrue(equals(ZERO, 
                        f5.mul(0)));},
                () -> {assertTrue(equals(new ArrayPolynomial(15), 
                        f1a.mul(3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(15), 
                        f2.mul(5)));});
    }
    
    @Test
    void testMulDouble3() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(5, 5), 
                        f3.mul(5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(3, 9), 
                        f4.mul(3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(7, 14, 7), 
                        f5.mul(7)));},
                () -> {assertTrue(equals(new ArrayPolynomial(25), 
                        f1a.mul(5)));});
    }
    
    @Test
    void testMulDouble4() {
        assertAll(
                () -> {assertTrue(equals(new ArrayPolynomial(9), 
                        f2.mul(3)));},
                () -> {assertTrue(equals(f5, 
                        f3.mul(f3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0.25, 0.75), 
                        f4.mul(0.25)));},
                () -> {assertTrue(equals(new ArrayPolynomial(.125, .25, .125), 
                        f5.mul(.125)));});
    }
    
    @Test
    void testMulDouble5() {
        assertAll(
                () -> {assertTrue(equals(f5, 
                        new ArrayPolynomial(-1, -2, -1).mul(-1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 4, 2), 
                        new ArrayPolynomial(0, 2, 1).mul(2)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 1, .5), 
                        new ArrayPolynomial(2, 2, 1).mul(.5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(.125, .25, .5, 1, 2, 4), 
                        new ArrayPolynomial(1, 2, 4, 8, 16, 32).mul(.125)));});
    }
    
    @Test
    void testD() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.d()));},
                () -> {assertTrue(equals(ZERO, 
                        ONE.d()));},
                () -> {assertTrue(equals(ZERO, 
                        f1a.d()));},
                () -> {assertTrue(equals(ZERO, 
                        f2.d()));},
                () -> {assertTrue(equals(ONE, 
                        f3.d()));},
                () -> {assertTrue(equals(ONE.mul(3), 
                        f4.d()));},
                () -> {assertTrue(equals(f3.mul(2), 
                        f5.d()));},
                () -> {assertTrue(equals(ZERO, 
                        f1a.mul(f2).d()));},
                () -> {assertTrue(equals(f1a, 
                        f1a.mul(f3).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(5, 14, 9), 
                        f4.mul(f5).d()));},
                () -> {assertTrue(equals(f3.mul(2), 
                        f3.mul(f3).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(6, 18), 
                        f4.mul(f4).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(4, 12, 12, 4), 
                        f5.mul(f5).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(3, 6, 3), 
                        f3.mul(f5).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(-4, -12 , -12, -4), 
                        new ArrayPolynomial(-1, -2, -1).mul(f5).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(2, 10, 12, 4), 
                        f5.mul(new ArrayPolynomial(0, 2, 1)).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(6, 14, 12, 4), 
                        new ArrayPolynomial(2, 2, 1).mul(f5).d()));},
                () -> {assertTrue(equals(new ArrayPolynomial(4, 10, 6), 
                        f5.mul(new ArrayPolynomial(1, 2)).d()));});
    }

    @Test
    void testI() {
        assertAll(
                () -> {assertTrue(equals(ZERO, 
                        ZERO.i(0)));},
                () -> {assertTrue(equals(ONE, 
                        ZERO.i(1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(3), 
                        ZERO.i(3)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-5), 
                        ZERO.i(-5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 5), 
                        f1a.i(0)));},
                () -> {assertTrue(equals(new ArrayPolynomial(5, 3), 
                        f2.i(5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-1, 1, 0.5), 
                        f3.i(-1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(5, 1, 1.5), 
                        f4.i(5)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 1, 1, 1), 
                        new ArrayPolynomial(1, 2, 3).i(1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0,1), 
                        ONE.i(0)));},
                () -> {assertTrue(equals(f3, 
                        f3.d().i(1)));},
                () -> {assertTrue(equals(f4, 
                        f4.d().i(1)));},
                () -> {assertTrue(equals(f5, 
                        f5.d().i(1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(2, 5, 2.5), 
                        f1a.mul(f3).i(2)));},
               () -> {assertTrue(equals(new ArrayPolynomial(1, 5, 7, 3), 
                        f4.mul(f5).d().i(1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 1, 3, 3), 
                        f4.mul(f4).i(0)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 3, 3, 1), 
                        f3.mul(f5).d().i(1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(-1, -4, -6, -4, -1), 
                        new ArrayPolynomial(-1, -2, -1).mul(f5).d().i(-1)));},
                () -> {assertTrue(equals(new ArrayPolynomial(0, 2, 5, 4, 1), 
                        f5.mul(new ArrayPolynomial(0, 2, 1)).d().i(0)));},
                () -> {assertTrue(equals(new ArrayPolynomial(2, 6, 7, 4, 1), 
                        new ArrayPolynomial(2, 2, 1).mul(f5).d().i(2)));},
                () -> {assertTrue(equals(new ArrayPolynomial(1, 4, 5, 2), 
                        f5.mul(new ArrayPolynomial(1, 2)).d().i(1)));});
    }
    

    
    @Test
    void testToString1() {
        assertAll(
                () -> {assertEquals("[]", ZERO.toString(), 
                        "0 to string should be \"[]\"");},
                () -> {assertEquals("[]", f0a.toString(), 
                        "0x^5 + 0x^4 + 0x^3 + 0x^2 + 0x + 0 to string should be \"[]\"");});

    }
    
    @Test
    void testToString2() {
        assertAll(
                () -> {assertEquals("[1.0]", ONE.toString(),
                        "1 to string should be \"[1.0]\"");},
                () -> {assertEquals("[5.0]", f1a.toString(), 
                        "0x + 5 to string should be \"[5.0]\"");},
                () -> {assertEquals("[3.0]", f2.toString(), 
                        "3 to string should be \"[3.0]\"");});

    }
    
    @Test
    void testToString3() {
        assertAll(
                () -> {assertEquals("[1.0, 1.0]", f3.toString(), 
                        "x + 1 to string should be \"[1.0, 1.0]\"");},
                () -> {assertEquals("[3.0, 1.0]", f4.toString(),
                        "3x + 1 to string should be \"[3.0, 1.0]\"");});
    }
    
    @Test
    void testToString4() {
        assertAll(
                () -> {assertEquals("[1.0, 2.0, 1.0]", f5.toString(),
                        "x^2 + 2x + 1 to string should be \"[1.0, 2.0, 1.0]\"");},
                () -> {assertEquals("[-1.0, -4.0, -6.0, -4.0, -1.0]", 
                        new ArrayPolynomial(-1, -4, -6, -4, -1).toString(), 
                        "-x^4 - 4x^3 - 6x^2 - 4x -1 to string should " 
                        + "be \"[-1.0, -4.0, -6.0, -4.0, -1.0]\"");});
    }
    
    @Test
    void testToString5() {
        assertAll(
                () -> {assertEquals("[4.0, 3.0, 12.0, 0.0]", 
                        new ArrayPolynomial(0, 12, 3, 4).toString(),
                        "4x^3 + 3x^2 + 12x to string should be \"[4.0, 3.0, 12.0, 0.0]\"");},
                () -> {assertEquals("[3.0, 2.0, 1.0]", 
                        new ArrayPolynomial(1, 2, 3).toString(), 
                        "3x^2 + 2x + 1 to string should be \"[3.0, 2.0, 1.0]\"");});
    }
    
    @Test
    void testToString6() {
        assertAll(
                () -> {assertEquals("[1.0, 0.0, 0.0, 0.0]", 
                        new ArrayPolynomial(0, 0, 0, 1).toString(),
                        "x^4  to string should be \"[1.0, 0.0, 0.0, 0.0]\"");},
                () -> {assertEquals("[1.0, 3.0]", 
                        new ArrayPolynomial(3, 1).toString(),
                        "x + 3 to string should be \"[1.0, 3.0]\"");});
    }
}
