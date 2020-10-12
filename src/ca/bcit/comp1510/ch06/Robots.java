package ca.bcit.comp1510.ch06;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates graphical transformations.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Robots extends Application {

    /**
     * Displays three robot faces, applying various transformations.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        RobotFace robot1 = new RobotFace();
        final int robot1X = 70;
        final int robot1Y = 40;
        robot1.setTranslateX(robot1X);
        robot1.setTranslateY(robot1Y);

        RobotFace robot2 = new RobotFace();
        final int robot2X = 300;
        final int robot2Y = 40;
        robot2.setTranslateX(robot2X);
        robot2.setTranslateY(robot2Y);
        final double robot2Angle = 20;
        robot2.setRotate(robot2Angle);

        RobotFace robot3 = new RobotFace();
        final int robot3X = 200;
        final int robot3Y = 200;
        robot3.setTranslateX(robot3X);
        robot3.setTranslateY(robot3Y);
        final double robot3Scale = 2.5;
        robot3.setScaleX(robot3Scale);
        robot3.setScaleY(robot3Scale);

        Group root = new Group(robot1, robot2, robot3);

        final int appWidth = 500;
        final int appHeight = 380;
        Scene scene = new Scene(root, appWidth, appHeight, Color.WHITE);

        primaryStage.setTitle("Robots");
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

