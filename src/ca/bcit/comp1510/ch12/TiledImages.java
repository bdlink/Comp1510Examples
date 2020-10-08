package ca.bcit.comp1510.ch12;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates the use of recursion.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class TiledImages extends Application {

    /** The minimum size for the image. */
    private static final int MIN = 10;

    /** The image. */
    private Image image;
    
    /** Displays the image as a monochrome. */
    private ColorAdjust monochrome;
    
    /** Displays the image in sepia. */
    private SepiaTone sepia;
    
    /** Contains the application components. */
    private Group root;

    /**
     * Sets up the display of a series of tiled images.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        image = new Image("girl.jpg");

        monochrome = new ColorAdjust(0, -1, 0, 0);
        sepia = new SepiaTone();

        root = new Group();
        final int initialSizeInPixels = 300;
        addPictures(initialSizeInPixels);

        final int appWidth = 600;
        final int appHeight = 600;
        Scene scene = new Scene(root, appWidth, appHeight, Color.WHITE);

        primaryStage.setTitle("Tiled Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Uses the parameter to specify the size and position of an image. Displays
     * the image in full color, monochrome, and sepia tone, then repeats the
     * display recursively in the upper left quadrant.
     * 
     * @param size The image size
     */
    private void addPictures(double size) {
        ImageView colorView = new ImageView(image);
        colorView.setFitWidth(size);
        colorView.setFitHeight(size);
        colorView.setX(size);
        colorView.setY(size);

        ImageView monochromeView = new ImageView(image);
        monochromeView.setEffect(monochrome);
        monochromeView.setFitWidth(size);
        monochromeView.setFitHeight(size);
        monochromeView.setX(0);
        monochromeView.setY(size);

        ImageView sepiaView = new ImageView(image);
        sepiaView.setEffect(sepia);
        sepiaView.setFitWidth(size);
        sepiaView.setFitHeight(size);
        sepiaView.setX(size);
        sepiaView.setY(0);

        root.getChildren().addAll(sepiaView, colorView, monochromeView);

        if (size > MIN) {
            addPictures(size / 2);
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

