package ca.bcit.comp1510.ch04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Demonstrates JavaFX buttons and event handlers.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class PushCounter extends Application {
    
    /** Holds the number of time the button is pressed. */
    private int count;
    
    /** Displays the number of times the button is pressed. */
    private Text countText;

    /**
     * Presents a GUI containing a button and text that displays
     * how many times the button is pushed.
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {        
        count = 0;
        countText = new Text("Pushes: 0");

        Button push = new Button("Push Me!");
        push.setOnAction(this::processButtonPress); // Wow!

        FlowPane pane = new FlowPane(push, countText);
        pane.setAlignment(Pos.CENTER);
        
        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: cyan");

        final int appWidth = 300;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Updates the counter and text when the button is pushed.
     * @param event invokes this method
     */
    public void processButtonPress(ActionEvent event) {
        count++;
        countText.setText("Pushes: " + count);
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

