package ca.bcit.comp1510.ch05;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Demonstrates the use of radio buttons.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class QuoteOptions extends Application {
    
    /**
     * Creates and presents the program window.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        QuoteOptionsPane pane = new QuoteOptionsPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: lightgreen");

        final int appWidth = 500;
        final int appHeight = 150;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Quote Options");
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

