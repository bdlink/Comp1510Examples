package ca.bcit.comp1510.ch11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Demonstrates the use of tool tips and disabled controls.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class LightBulb extends Application {

    /** Width of the light bulb. */
    public static final int VIEW_WIDTH = 125;

    /** Height of the light bulb. */
    public static final int VIEW_HEIGHT = 200;
    
    /** Coordinate for light bulb on. */
    public static final int ON = 143;
    
    /** Coordinate for light bulb off. */
    public static final int OFF = 0;

    /** The on button. */
    private Button onButton;

    /** The off button. */
    private Button offButton;

    /** Displays the bulb. */
    private ImageView bulbView;

    /**
     * Displays an image of a light bulb that can be turned on and off using
     * enabled buttons with tool tips set.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        Image img = new Image("lightBulbs.png");
        bulbView = new ImageView(img);

        // off
        bulbView.setViewport(
                new Rectangle2D(0, 0, VIEW_WIDTH, VIEW_HEIGHT));

        final int preferedButtonWidth = 70;
        onButton = new Button("On");
        onButton.setPrefWidth(preferedButtonWidth);
        onButton.setTooltip(new Tooltip("Turn me on!"));
        onButton.setOnAction(this::processButtonPress);

        offButton = new Button("Off");
        offButton.setPrefWidth(preferedButtonWidth);
        offButton.setTooltip(new Tooltip("Turn me off!"));
        offButton.setDisable(true);
        offButton.setOnAction(this::processButtonPress);

        final int buttonSpacing = 30;
        HBox buttons = new HBox(onButton, offButton);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(buttonSpacing);

        final int componentSpacing = 20;
        VBox root = new VBox(bulbView, buttons);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: black");
        root.setSpacing(componentSpacing);

        final int appWidth = 250;
        final int appHeight = 300;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Light Bulb");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Determines which button was pressed and sets the image viewport
     * appropriately to show either the on or off bulb. Also swaps the disable
     * state of both buttons.
     * 
     * @param event invokes this method
     */
    public void processButtonPress(ActionEvent event) {
        if (event.getSource() == onButton) {
            bulbView.setViewport(
                    new Rectangle2D(ON, 0, VIEW_WIDTH, VIEW_HEIGHT));
            onButton.setDisable(true);
            offButton.setDisable(false);
        } else {
            bulbView.setViewport(
                    new Rectangle2D(OFF, 0, VIEW_WIDTH, VIEW_HEIGHT));
            offButton.setDisable(true);
            onButton.setDisable(false);
        }
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

