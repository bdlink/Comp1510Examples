package ca.bcit.comp1510.chG;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Demonstrates how to use a GridPane.
 *
 * @author BCIT
 * @version 2017
 */
public class GridPaneDemo extends Application {
    
    /**
     * Creates the GridPane.
     * 
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {
        GridPane gridPane = initializeGridPane();

        ImageView logo = new ImageView(new Image("mascot.png"));
        final int oneSpanX = 1;
        final int threeSpanY = 3;
        gridPane.add(logo, 0, 0, oneSpanX, threeSpanY);

        Text title = new Text("Welcome to Emotiful!");
        final int titleFont = 24;
        title.setFont(new Font(titleFont));
        gridPane.add(title, 1, 0, 2, 1);

        Label userLabel = new Label("User name:");
        final int labelFont = 18;
        userLabel.setFont(new Font(labelFont));
        GridPane.setHalignment(userLabel, HPos.RIGHT);
        gridPane.add(userLabel, 1, 1);

        TextField userName = new TextField();
        gridPane.add(userName, 2, 1);

        Label pwLabel = new Label("Password:");
        pwLabel.setFont(new Font(labelFont));
        GridPane.setHalignment(pwLabel, HPos.RIGHT);
        gridPane.add(pwLabel, 1, 2);

        TextField password = new TextField();
        gridPane.add(password, 2, 2);

        addGreeting(gridPane, labelFont);
        
        final int width = 550;
        final int height = 250;
        final Scene scene = new Scene(gridPane, width, height);

        primaryStage.setTitle("Grid Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane initializeGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: lemonchiffon");
        gridPane.setAlignment(Pos.CENTER);
        final int hGap = 20;
        final int vGap = 10;
        gridPane.setHgap(hGap);
        gridPane.setVgap(vGap);
        // gridPane.setGridLinesVisible(true);
        return gridPane;
    }
    
    private void addGreeting(GridPane gridPane, int labelFont) {
        Text greeting = new Text("Have an emotiful day!");
        greeting.setFont(new Font(labelFont));
        GridPane.setHalignment(greeting, HPos.CENTER);
        final int fourDown = 3;
        final int threeSpanX = 3;
        final int oneSpanY = 1;
        gridPane.add(greeting, 0, fourDown, threeSpanX, oneSpanY);        
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
