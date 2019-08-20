package ca.bcit.comp1510.chG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 * Demonstrates how to use a StackPane.
 *
 * @author BCIT
 * @version 2017
 */
public class StackPaneDemo extends Application {
    
    /**
     * Creates the StackPane.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        ImageView imageView = new ImageView(new Image("tiger.jpg"));

        Rectangle rect = new Rectangle(350, 300, null);
        rect.setStroke(Color.ORANGE);
        rect.setStrokeWidth(6);

        StackPane imagePane = new StackPane(imageView, rect);
        imagePane.setStyle("-fx-background-color: beige");

        Scene scene = new Scene(imagePane, 500, 400);

        primaryStage.setTitle("Stack Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
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
