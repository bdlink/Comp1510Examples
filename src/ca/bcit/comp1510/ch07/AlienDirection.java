package ca.bcit.comp1510.ch07;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates the handling of keyboard events.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class AlienDirection extends Application {
    
    
    /** Distance in pixels that the alien moves when a key is pressed. */
    public static final int JUMP = 10;

    /** Contains the image of the alien. */
    private ImageView imageView;

    /**
     * Displays an image that can be moved using the arrow keys.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        Image alien = new Image("alien.png");

        imageView = new ImageView(alien);
        final int alientStartCoordinate = 20;
        imageView.setX(alientStartCoordinate);
        imageView.setY(alientStartCoordinate);

        Group root = new Group(imageView);

        final int appWidth = 400;
        final int appHeight = 200;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);
        scene.setOnKeyPressed(this::processKeyPress);

        primaryStage.setTitle("Alien Direction");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Modifies the position of the image view when an arrow key is pressed.
     * 
     * @param event signals a key press or release occured
     */
    public void processKeyPress(KeyEvent event) {
        switch (event.getCode()) {
            case UP:
                imageView.setY(imageView.getY() - JUMP);
                break;
            case DOWN:
                imageView.setY(imageView.getY() + JUMP);
                break;
            case RIGHT:
                imageView.setX(imageView.getX() + JUMP);
                break;
            case LEFT:
                imageView.setX(imageView.getX() - JUMP);
                break;
            // do nothing if it's not an arrow key:
            default:
                break;
        }
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

