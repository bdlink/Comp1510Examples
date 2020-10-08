package ca.bcit.comp1510.ch04;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Demonstrates the use of Image and ImageView objects.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class ImageDisplay extends Application {

    /**
     * Displays an image centered in a window.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        Image img = new Image("gull.jpg");
        ImageView imgView = new ImageView(img);

        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");
        final int viewX = 200;
        final int viewY = 80;
        final int viewWidth = 70;
        final int viewHeight = 60;
        imgView.setViewport(
                new Rectangle2D(viewX, viewY, viewWidth, viewHeight));

        final int appWidth = 500;
        final int appHeight = 350;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Image Display");
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

