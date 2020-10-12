package ca.bcit.comp1510.ch06;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

/**
 * Demonstrates graphic transformations. Not shown in full in textbook.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class TransformationDemo extends Application {

    /**
     * Creates and presents the program window.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        // TRANSLATION
        final Rectangle rec1 = new Rectangle(100, 100, 200, 50);
        rec1.setFill(Color.STEELBLUE);

        final Rectangle rec2 = new Rectangle(100, 100, 200, 50);
        rec2.setFill(Color.ORANGE);
        
        final int moveX = 70;
        final int moveY = 10;
        rec2.setTranslateX(moveX);
        rec2.setTranslateY(moveY);

        // SCALING
        ImageView imgView = waterLily();

        // ROTATION
        final Rectangle rec = new Rectangle(50, 100, 200, 50);
        rec.setFill(Color.STEELBLUE);
        final int rectAngle = 40;
        rec.setRotate(rectAngle);
        
        final Text text = new Text(270, 125, "Tilted Text!");
        final int textSize = 24;
        text.setFont(new Font("Courier", textSize));
        final double textAngle = -15;
        text.setRotate(textAngle);
        

        // SHEARING
        Image img2 = new Image("duck.jpg");
        ImageView imgView2 = new ImageView(img2);
        final Shear duckShear = new Shear(0.4, 0.2);
        imgView2.getTransforms().add(duckShear);

        // Add and remove from root to observe changes
        Group root = new Group(rec1, rec2, imgView, rec, text, imgView2);
        final int appWidth = 500;
        final int appHeight = 250;
        Scene scene = new Scene(root, appWidth, appHeight);

        primaryStage.setTitle("Transformation Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private ImageView waterLily() {
        Image img = new Image("water lily.jpg");
        ImageView imgView = new ImageView(img);
        final int lilyX = 100;
        final double lilyScale = 0.7;
        imgView.setX(lilyX);
        imgView.setScaleX(lilyScale);
        imgView.setScaleY(lilyScale);
        return imgView;
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

