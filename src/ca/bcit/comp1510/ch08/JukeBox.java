package ca.bcit.comp1510.ch08;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 * Demonstrates the use of a combo box and audio clips.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class JukeBox extends Application {
    /** The app width. */
    private static final int APP_WIDTH = 300;
    
    /** The app height. */
    private static final int APP_HEIGHT = 150;
    
    /** Stores the names of the music selections. */
    private ChoiceBox<String> choice;
    
    /** Array of music selections. */
    private AudioClip[] tunes;
    
    /** The current music selection. */
    private AudioClip current;
    
    /** The play button. */
    private Button playButton;
    
    /** The stop button. */
    private Button stopButton;

    /**
     * Presents an interface that allows the user to select and play a tune from
     * a drop down box.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        String[] names = {"Western Beat", "Classical Melody",
                          "Jeopardy Theme", "Eighties Jam",
                          "New Age Rhythm", "Lullaby",
                          "Alfred Hitchcock's Theme" };

        File[] audioFiles = {
            new File("resources/westernBeat.wav"), 
            new File("resources/classical.wav"), 
            new File("resources/jeopardy.mp3"),
            new File("resources/eightiesJam.wav"), 
            new File("resources/newAgeRythm.wav"), 
            new File("resources/lullaby.mp3"),
            new File("resources/hitchcock.wav")
        };

        tunes = new AudioClip[audioFiles.length];
        for (int i = 0; i < audioFiles.length; i++) {
            tunes[i] = new AudioClip(audioFiles[i].toURI().toString());
        }
        current = tunes[0];

        Label label = new Label("Select a tune:");

        choice = new ChoiceBox<String>();
        choice.getItems().addAll(names);
        choice.getSelectionModel().selectFirst();
        choice.setOnAction(this::processChoice);

        playButton = new Button("Play");
        stopButton = new Button("Stop");
        HBox buttons = new HBox(playButton, stopButton);
        final int spacing = 10;
        final int inset = 15;
        buttons.setSpacing(spacing);
        buttons.setPadding(new Insets(inset, 0, 0, 0));
        buttons.setAlignment(Pos.CENTER);

        playButton.setOnAction(this::processButtonPush);
        stopButton.setOnAction(this::processButtonPush);

        VBox root = new VBox(label, choice, buttons);
        root.setPadding(new Insets(inset, inset, inset, inset + spacing));
        root.setSpacing(spacing);
        root.setStyle("-fx-background-color: skyblue");

        Scene scene = new Scene(root, APP_WIDTH, APP_HEIGHT);

        primaryStage.setTitle("Java Juke Box");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * When a choice box selection is made, stops the current clip (if one was
     * playing) and sets the current tune.
     * 
     * @param event
     *            invokes this method
     */
    public void processChoice(ActionEvent event) {
        current.stop();
        current = tunes[choice.getSelectionModel().getSelectedIndex()];
    }

    /**
     * Handles the play and stop buttons. Stops the current clip in either case.
     * If the play button was pressed, (re)starts the current clip.
     * 
     * @param event
     *            invokes this method
     */
    public void processButtonPush(ActionEvent event) {
        current.stop();

        if (event.getSource() == playButton) {
            current.play();
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

