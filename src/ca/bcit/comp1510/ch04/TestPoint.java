package ca.bcit.comp1510.ch04;

/**
 * Show the use of records using Point.
 * @author blink
 * @version 2025
 */
public class TestPoint {

    /**
     * Create use and print some points.
     * @param args unused.
     */
    public static void main(String[] args) {
        final var a = new Point(3, 4);
        final var b = new Point(3, 3);
        final var c = new Point(4, 3);
        final var d = new Point(3, 4);
        
        System.out.println("a = " + a);
        System.out.println("Coordinates of a: (" + a.x() + ", " + a.y() + ")");
        System.out.println("|a| = " + a.abs());
        System.out.println("slope of a = " + a.slope());
        
        System.out.println();
        System.out.println("b = " + b);
        System.out.println("a + b = " + a.add(b));
        System.out.println("a.equals(b) = " + a.equals(b));        
        System.out.println("slope of b = " + b.slope());
        
        System.out.println();
        System.out.println("c = " + c);
        System.out.println("slope of c = " + c.slope());
        
       
        System.out.println(); 
        System.out.println("d = " + d);
        System.out.println("a = d? " + a.equals(d));


    }

}
