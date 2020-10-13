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
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        Button prev = new Button("Prev");
        Button next = new Button("Next");

        AnchorPane navPane = new AnchorPane(prev, next);
        navPane.setStyle("-fx-background-color: black");
        final int navPaneHeight = 70;
        navPane.setPrefHeight(navPaneHeight);

        final double offsetFromBottom = 20.0;
        final double offsetFromLeft = 30.0;
        final double offsetFromRight = 30.0;
        AnchorPane.setBottomAnchor(prev, offsetFromBottom);
        AnchorPane.setLeftAnchor(prev, offsetFromLeft);
        AnchorPane.setBottomAnchor(next, offsetFromBottom);
        AnchorPane.setRightAnchor(next, offsetFromRight);

        final Scene scene = new Scene(navPane, 500, 400);

        primaryStage.setTitle("Anchor Pane Demo");
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
