package ca.bcit.comp1510.chG;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a TilePane.
 *
 * @author BCIT
 * @version 2017
 */
public class TilePaneDemo extends Application {
    
    /**
     * Creates the TilePane.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        Button b1 = new Button("Push Me!");
        Button b2 = new Button("No, Push ME!");
        Button b3 = new Button("I'm the BEST! Push Me!");
        Button b4 = new Button("Smart people push me!");
        Button b5 = new Button("I'm here, too.");

        TilePane pane = new TilePane(b1, b2, b3, b4, b5);
        pane.setStyle("-fx-background-color: cyan");
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setHgap(10);
        pane.setVgap(5);

        Scene scene = new Scene(pane, 300, 200);

        primaryStage.setTitle("Tile Pane Demo");
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
