package ca.bcit.comp1510.ch04;

/**
 * Illustrates the record structure.  Specifically implements Cartesian
 * two-dimentional point.
 * @author blink
 * @version 2025
 * 
 * @param x horizontal coordinate
 * @param y vertical coordinate
 */
public record Point(double x, double y) {
    
    /** origin of Catresian plane. **/
    public static final Point ORIGIN = new Point(0, 0);

    /**
     * Magnitude of point (distance from origin).
     * @return distance from origin.
     */
    public double abs() {
        return Math.hypot(x(), y());
    }
    
    /**
     * Slope of the line from the origin to this point.
     * @return y/x
     */
    public double slope() {
        //from inside the class we can reference the fields directly.
        return y / x;
    }
    
    /**
     * Cartesian addition of points using parallelogram rule.
     * @param other the point to add to a given point.
     * @return sum of this point and other point
     */
    public Point add(Point other) {
        return new Point(x() + other.x(), y() + other.y());
    }
}
