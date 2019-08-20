package ca.bcit.comp1510.ch07;

/**
 * Demonstrates the effects of passing various types of parameters.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class ParameterTester {
    /** Test value 111. */
    private static final int T111 = 111;

    /** Test value 222. */
    private static final int T222 = 222;

    /** Test value 333. */
    private static final int T333 = 333;
    
    /**
     * Sets up three variables (one primitive and two objects) to serve as
     * actual parameters to the changeValues method. Prints their values before
     * and after calling the method.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {
        ParameterModifier modifier = new ParameterModifier();

        int a1 = T111;
        Num a2 = new Num(T222);
        Num a3 = new Num(T333);

        System.out.println("Before calling changeValues:");
        System.out.println("a1\ta2\ta3");
        System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");

        modifier.changeValues(a1, a2, a3);

        System.out.println("After calling changeValues:");
        System.out.println("a1\ta2\ta3");
        System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
    }
}

