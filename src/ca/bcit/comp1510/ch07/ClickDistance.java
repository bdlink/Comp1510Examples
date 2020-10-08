package ca.bcit.comp1510.ch07;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of a mouse click event.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class ClickDistance extends Application {
    /** The line the user draws. */
    private Line line;
    
    /** Displays the distance. */
    private Text distanceText;

    /**
     * Shows the distance between the origin (0, 0) and the point where
     * the mouse is clicked.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        line = new Line(0, 0, 0, 0);
        final int textXCoord = 150;
        final int textYCoord = 30;
        distanceText = new Text(textXCoord, textYCoord, "Distance:  --");

        Group root = new Group(distanceText, line);

        final int appWidth = 400;
        final int appHeight = 300;
        Scene scene = new Scene(root, appWidth, appHeight, Color.LIGHTYELLOW);

        scene.setOnMouseClicked(this::processMouseClick);

        primaryStage.setTitle("Click Distance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Resets the end point of the line to the location of the mouse
     * click event and updates the distance displayed.
     * @param event indicates mouse clicked
     */
    public void processMouseClick(MouseEvent event) {
        double clickX = event.getX();
        double clickY = event.getY();

        line.setEndX(clickX);
        line.setEndY(clickY);

        double distance = Math.sqrt(clickX * clickX + clickY * clickY);

        String distanceStr = String.format("%.2f", distance);
        distanceText.setText("Distance:  " + distanceStr);
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

