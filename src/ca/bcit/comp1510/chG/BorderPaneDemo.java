package ca.bcit.comp1510.chG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a BorderPane.
 *
 * @author BCIT
 * @version 2017
 */
public class BorderPaneDemo extends Application {

    /**
     * Creates the BorderPane.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        StackPane titlePane = buildTitlePane();

        ImageView imageView = new ImageView(new Image("tiger.jpg"));

        final Rectangle rect = new Rectangle(350, 300, null);
        rect.setStroke(Color.ORANGE);
        final int rectThick = 6;
        rect.setStrokeWidth(rectThick);

        StackPane imagePane = new StackPane(imageView, rect);
        imagePane.setStyle("-fx-background-color: beige");

        RadioButton sepiaButton = new RadioButton("Sepia");
        RadioButton monoButton = new RadioButton("Monochrome");
        RadioButton colorButton = new RadioButton("Full Color");

        Separator sep = new Separator();
        Label colorLabel = new Label("Frame:");
        ColorPicker colorPicker = new ColorPicker(Color.ORANGE);

        VBox colorControls = new VBox(sepiaButton, monoButton, colorButton, sep, colorLabel, colorPicker);
        colorControls.setStyle("-fx-padding: 20px 10px; " + "-fx-background-color: skyblue");
        final int spacing = 10;
        colorControls.setSpacing(spacing);

        AnchorPane navPane = buildAnchorPane();

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(titlePane);
        borderPane.setLeft(colorControls);
        borderPane.setCenter(imagePane);
        borderPane.setBottom(navPane);

        final int sceneWidth = 600;
        final int sceneHeight = 500;
        Scene scene = new Scene(borderPane, sceneWidth, sceneHeight);

        primaryStage.setTitle("Border Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private StackPane buildTitlePane() {
        Text title = new Text("Image Viewer");
        final int fontSize = 24;
        title.setFont(Font.font(fontSize));
        title.setFill(Color.YELLOW);
        StackPane titlePane = new StackPane(title);
        titlePane.setStyle("-fx-padding: 20px; -fx-background-color: black");

        return titlePane;
    }
    
    private AnchorPane buildAnchorPane() {
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
      
        return navPane;
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
