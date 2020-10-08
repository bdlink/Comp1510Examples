package ca.bcit.comp1510.ch05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Demonstrates the use of one handler for multiple buttons.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RedOrBlue extends Application {
    
    /** The red button. */
    private Button redButton;
    
    /** The blue button. */
    private Button blueButton;
    
    /** The pane that contains the buttons. */
    private FlowPane pane;

    /**
     * Creates and presents a GUI with two buttons that control the color of the
     * pane background.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        redButton = new Button("Red!");
        redButton.setOnAction(this::processColorButton);

        blueButton = new Button("Blue!");
        blueButton.setOnAction(this::processColorButton);

        pane = new FlowPane(redButton, blueButton);
        pane.setAlignment(Pos.CENTER);
        
        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: white");

        final int appWidth = 300;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Red or Blue?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Determines which button was pressed and sets the pane color accordingly..
     * 
     * @param event indicates a button was pressed
     */
    public void processColorButton(ActionEvent event) {
        if (event.getSource() == redButton) {
            pane.setStyle("-fx-background-color: crimson");
        } else {
            pane.setStyle("-fx-background-color: deepskyblue");
        }
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

