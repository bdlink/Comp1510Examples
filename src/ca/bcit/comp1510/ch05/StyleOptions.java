package ca.bcit.comp1510.ch05;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Demonstrates the use of check boxes.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class StyleOptions extends Application {
    
    /**
     * Creates and presents the program window.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        StyleOptionsPane pane = new StyleOptionsPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: skyblue");

        final int appWidth = 400;
        final int appHeight = 150;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Style Options");
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

