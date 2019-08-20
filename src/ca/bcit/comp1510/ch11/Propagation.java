package ca.bcit.comp1510.ch11;

/**
 * Demonstrates exception propagation.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Propagation {

    /**
     * Creates a new ExceptionScope object and invokes the level1() method in
     * it. This demonstrates exception propagation.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {
        ExceptionScope demo = new ExceptionScope();
        System.out.println("Program beginning.");
        demo.level1();
        System.out.println("Program ending.");
    }
}

