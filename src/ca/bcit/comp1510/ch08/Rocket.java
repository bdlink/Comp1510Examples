package ca.bcit.comp1510.ch08;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**
 * Demonstrates the use of polygons and polylines.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Rocket extends Application {

    /**
     * Displays a rocket lifting off. The rocket and hatch are polygons and the
     * flame is a polyline.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        final double[] hullPoints = 
            {200, 25, 240, 60, 240, 230, 270, 260, 270,
             300, 140, 300, 140, 260, 160, 230, 160, 60};

        Polygon rocket = new Polygon(hullPoints);
        rocket.setFill(Color.BEIGE);

        final double[] hatchPoints = {185, 70, 215, 70, 220, 120, 180, 120 };

        Polygon hatch = new Polygon(hatchPoints);
        hatch.setFill(Color.MAROON);

        final double[] flamePoints = {142, 310, 142, 330, 150, 325, 155,
                380, 165, 340, 175, 360, 190, 350, 200, 375, 215, 330,
                220, 360, 225, 355, 230, 370, 240, 340, 255, 370, 260,
                335, 268, 340, 268, 310 };

        Polyline flame = new Polyline(flamePoints);
        flame.setStroke(Color.RED);
        final int strokeWidth = 3;
        flame.setStrokeWidth(strokeWidth);

        Group root = new Group(rocket, hatch, flame);

        final int appWidth = 400;
        final int appHeight = 400;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);

        primaryStage.setTitle("Rocket");
        primaryStage.setScene(scene);
        primaryStage.show();
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

