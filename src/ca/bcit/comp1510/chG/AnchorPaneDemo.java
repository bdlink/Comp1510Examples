package ca.bcit.comp1510.chG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Demonstrates how to use an AnchorPane.
 *
 * @author BCIT
 * @version 2017
 *
 */
public class AnchorPaneDemo extends Application {
    
    /**
     * Creates the AnchorPane.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        Button prev = new Button("Prev");
        Button next = new Button("Next");

        AnchorPane navPane = new AnchorPane(prev, next);
        navPane.setStyle("-fx-background-color: black");
        navPane.setPrefHeight(70);

        AnchorPane.setBottomAnchor(prev, 20.0);
        AnchorPane.setLeftAnchor(prev, 30.0);
        AnchorPane.setBottomAnchor(next, 20.0);
        AnchorPane.setRightAnchor(next, 30.0);

        Scene scene = new Scene(navPane, 500, 400);

        primaryStage.setTitle("Anchor Pane Demo");
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
