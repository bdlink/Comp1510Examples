package ca.bcit.comp1510.ch07;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of mouse press and mouse drag events.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RubberLines extends Application {
    
    /** The line the user has drawn. */
    private Line currentLine;
    
    /** The contents of the application scene. */
    private Group root;

    /**
     * Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        root = new Group();

        final int appWidth = 500;
        final int appHeight = 300;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("Rubber Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Adds a new line to the scene when the mouse button is pressed.
     * 
     * @param event
     *            invoked this method
     */
    public void processMousePress(MouseEvent event) {
        currentLine =
            new Line(event.getX(), event.getY(), event.getX(), event.getY());
        currentLine.setStroke(Color.CYAN);
        final int strokeWidth = 3;
        currentLine.setStrokeWidth(strokeWidth);
        root.getChildren().add(currentLine);
    }

    /**
     * Updates the end point of the current line as the mouse is dragged,
     * creating the rubber band effect.
     * 
     * @param event
     *            invoked this method
     */
    public void processMouseDrag(MouseEvent event) {
        currentLine.setEndX(event.getX());
        currentLine.setEndY(event.getY());
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

