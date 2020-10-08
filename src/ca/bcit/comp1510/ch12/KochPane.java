package ca.bcit.comp1510.ch12;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

/**
 * Represents the pane in which the Koch Snowflake fractal is presented.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class KochPane extends Pane {
    /**
     * The fractal dimension.
     */
    public static final double SQ = Math.sqrt(3) / 6;

    /**
     * Constructs a new KochPane object and initializes a fractal of order 1 (a
     * triangle).
     */
    public KochPane() {
        makeFractal(1);
    }

    /**
     * Draws the fractal by clearing the pane and then adding three lines of the
     * specified order between three predetermined points.
     * 
     * @param order Of the fractal (1, 2, ...)
     */
    public void makeFractal(int order) {
        getChildren().clear();
        addLine(order, 200, 20, 60, 300);
        addLine(order, 60, 300, 340, 300);
        addLine(order, 340, 300, 200, 20);
    }
    
    /**
     * Recursively adds a line of the specified order to the fractal. The base
     * case is a straight line between the given points. Otherwise, three
     * intermediate points are computed and four line segments are added as a
     * fractal of decremented order.
     * 
     * @param order The order of the fractal
     * @param x1 Origin x coordinate
     * @param y1 Origin y coordinate
     * @param x5 Destination x coordinate
     * @param y5 Destination y coordinate
     */
    public void addLine(int order, double x1, double y1, double x5, double y5) {
        double deltaX;
        double deltaY;
        double x2;
        double y2;
        double x3;
        double y3;
        double x4;
        double y4;
       
        final int third = 3;
        if (order == 1) {
            getChildren().add(new Line(x1, y1, x5, y5));
        } else {
            deltaX = x5 - x1;
            deltaY = y5 - y1;

            x2 = x1 + deltaX / third;
            y2 = y1 + deltaY / third;

            // projection
            x3 = (x1 + x5) / 2 + SQ * (y1 - y5);
            y3 = (y1 + y5) / 2 + SQ * (x5 - x1);

            x4 = x1 + deltaX * 2 / third;
            y4 = y1 + deltaY * 2 / third;

            addLine(order - 1, x1, y1, x2, y2);
            addLine(order - 1, x2, y2, x3, y3);
            addLine(order - 1, x3, y3, x4, y4);
            addLine(order - 1, x4, y4, x5, y5);
        }
    }
}

