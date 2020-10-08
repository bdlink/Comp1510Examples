package ca.bcit.comp1510.ch09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Demonstrates the use of a file chooser dialog box and a text area.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class DisplayFile extends Application {

    /**
     * Presents a file chooser dialog, reads the selected file and loads it into
     * a text area.
     * 
     * @param primaryStage a Stage
     * @throws IOException if file cannot be opened
     */
    public void start(Stage primaryStage) throws IOException {
        FileChooser chooser = new FileChooser();
        File selectedFile = chooser.showOpenDialog(primaryStage);

        TextArea content = new TextArea();
        final int fontSize = 12;
        content.setFont(new Font("Courier", fontSize));
        content.setEditable(false);

        if (selectedFile == null) {
            content.setText("No file chosen.");
        } else {
            Scanner scan = new Scanner(selectedFile);
            String info = "";
            while (scan.hasNext()) {
                info += scan.nextLine() + "\n";
            }
            content.setText(info);
            scan.close();
        }

        final int appWidth = 500;
        final int appHeight = 500;
        Scene scene = new Scene(content, appWidth, appHeight);
        primaryStage.setTitle("Display File");
        primaryStage.setScene(scene);
        primaryStage.show();
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

