package ca.bcit.comp1510.ch03;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 * Demonstrates the translation of a set of shapes.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Snowman extends Application {

    /**
     * Presents a snowman scene.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        final Ellipse base = new Ellipse(80, 210, 80, 60);
        base.setFill(Color.WHITE);

        final Ellipse middle = new Ellipse(80, 130, 50, 40);
        middle.setFill(Color.WHITE);

        final Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);

        final Circle rightEye = new Circle(70, 60, 5);
        final Circle leftEye = new Circle(90, 60, 5);
        final Line mouth = new Line(70, 80, 90, 80);

        final Circle topButton = new Circle(80, 120, 6);
        topButton.setFill(Color.RED);
        final Circle bottomButton = new Circle(80, 140, 6);
        bottomButton.setFill(Color.RED);

        final int armThickness = 3;
        final Line leftArm = new Line(110, 130, 160, 130);
        leftArm.setStrokeWidth(armThickness);
        final Line rightArm = new Line(50, 130, 0, 100);
        rightArm.setStrokeWidth(armThickness);

        Group hat = makeHat();

        Group snowman = new Group(base, middle, head, leftEye, rightEye, mouth,
                topButton, bottomButton, leftArm, rightArm, hat);
        final int moveSnowmanX = 170;
        final int moveSnowmanY = 50;
        snowman.setTranslateX(moveSnowmanX);
        snowman.setTranslateY(moveSnowmanY);

        final Scene scene = addBackground(snowman);

        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private Group makeHat() {
        final Rectangle stovepipe = new Rectangle(60, 0, 40, 50);
        final Rectangle brim = new Rectangle(50, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        final int moveHatX = 10;
        hat.setTranslateX(moveHatX);
        final double hatAngle = 15;
        hat.setRotate(hatAngle);
        return hat;
    }
    
    private Scene addBackground(Group snowman) {
        final Circle sun = new Circle(50, 50, 30);
        sun.setFill(Color.GOLD);

        final Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);

        Group root = new Group(ground, sun, snowman);
        final Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);
        return scene;
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

