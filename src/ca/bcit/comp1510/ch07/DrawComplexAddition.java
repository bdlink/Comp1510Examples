package ca.bcit.comp1510.ch07;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of mouse press and mouse drag events.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class DrawComplexAddition extends Application {
        
    /** The contents of the application scene. */
    private Group root;
    
    /** Logical x origin point in middle of screen in pixels. */
    private double originX;
    
    /** Logical y origin point in middle of screen in pixels. */
    private double originY;
    
    /** number of pixels for unit length. */
    private double scale;
    
    /** first point from mouse click. */
    private Complex z1;
    
    /** Second point from mouse click. */
    private Complex z2;

    /**
     * Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        root = new Group();

        final int appWidth = 1024;
        final int appHeight = 768;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);
        final int maxIm = 8;
        
        originX = appWidth / 2;
        originY = appHeight / 2;
        
        // how many pixels per unit
        scale = appHeight / (2 * maxIm); 
        
        double maxMag = Math.sqrt(originX * originX + originY * originY);
        
        addAxis(scene);
        
        addCircles(scene, scale, maxMag);
        /* 
         * calculate starting point to be nth root of 2
         */
        scene.setOnMouseClicked(this::processMouseClick);

        primaryStage.setTitle("Draw Spiral with Complex");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void addAxis(Scene s) {
        Line realAxis = new Line(0, s.getHeight() / 2, s.getWidth(), 
                s.getHeight() / 2);
        realAxis.setStroke(Color.LIGHTGREY);
        Line imagAxis = new Line(s.getWidth() / 2, 0, s.getWidth() / 2, 
                s.getHeight());
        imagAxis.setStroke(Color.LIGHTGREY);
        
        root.getChildren().add(realAxis);
        root.getChildren().add(imagAxis);
    }
    
    // add circles for integral magnitudes
    private void addCircles(Scene s, double unitScale, double maxMag) {
        final int emphasize = 5;
        double radius = unitScale;
        int i = 1;
        while (radius < maxMag) {
            Circle  c = new Circle(originX, originY, radius);
            c.setStroke(Color.LIGHTGREY);
            c.setFill(null);
            if (i % emphasize == 0) {
                c.setStrokeWidth(2);
            }
            root.getChildren().add(c);
            radius += scale;
            i++;
        }
        
    }

    /**
     * Adds a new line to the scene when the mouse button is pressed.
     * 
     * @param event
     *            invoked this method
     */
    public void processMouseClick(MouseEvent event) {
        double x = event.getX();
        double y = event.getY();
        
        if (z1 != null && z2 != null) {
            z1 = null;
            z2 = null;
        }
        if (z1 == null) {
            z1 = new Complex(coordRe(x), coordIm(y));
            drawZ(z1, Color.CYAN);
        } else {
            z2 = new Complex(coordRe(x), coordIm(y));
            drawZ(z2, Color.CYAN);
            drawZ(z1.add(z2), Color.LIGHTGREEN);
        }
    }

    private double coordX(Complex z) {
        return z.re * scale + originX;
    }
    
    private double coordY(Complex z) {
        return originY - z.im * scale;
    }
    
    private double coordRe(double x) {
        return (x - originX) / scale;
    }

    private double coordIm(double y) {
        return (originY - y) / scale;
    }
    
    private void drawZ(Complex z, Color c) {
        Line l = new Line(originX, originY, coordX(z), coordY(z));
        l.setStroke(c);
        final int strokeWidth = 2;
        l.setStrokeWidth(strokeWidth);
        root.getChildren().add(l);
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

