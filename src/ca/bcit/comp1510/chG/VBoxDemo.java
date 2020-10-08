package ca.bcit.comp1510.chG;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a VBox.
 *
 * @author BCIT
 * @version 2017
 */
public class VBoxDemo extends Application {
    
    /**
     * Creates the VBox.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        RadioButton sepiaButton = new RadioButton("Sepia");
        RadioButton monoButton = new RadioButton("Monochrome");
        RadioButton colorButton = new RadioButton("Full Color");

        Separator sep = new Separator();
        Label colorLabel = new Label("Frame:");
        ColorPicker colorPicker = new ColorPicker(Color.ORANGE);

        VBox colorControls = new VBox(sepiaButton, monoButton, colorButton, sep, colorLabel, colorPicker);
        colorControls.setStyle("-fx-background-color: skyblue");
        colorControls.setPadding(new Insets(20, 10, 20, 10));
        colorControls.setSpacing(10);

        final Scene scene = new Scene(colorControls, 600, 500);

        primaryStage.setTitle("VBox Demo");
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
