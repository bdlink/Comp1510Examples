package ca.bcit.comp1510.ch05;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * Demonstrates the use of check boxes.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class StyleOptionsPane extends VBox {
    
    /** Font size. */
    public static final int FONT_SIZE = 36;

    /** Holds the phrase. */
    private Text phrase;
    
    /** The check box for selecting bold type. */
    private CheckBox boldCheckBox;
    
    /** The check box for selecting italic type. */
    private CheckBox italicCheckBox;

    /**
     * Constructs this pane with a Text object and check boxes that
     * determine the style of the text font.
     */
    public StyleOptionsPane() {
        final int fontSize = 36;
        phrase = new Text("Say it with style!");
        phrase.setFont(new Font("Helvetica", fontSize));

        boldCheckBox = new CheckBox("Bold");
        boldCheckBox.setOnAction(this::processCheckBoxAction);
        italicCheckBox = new CheckBox("Italic");
        italicCheckBox.setOnAction(this::processCheckBoxAction);

        HBox options = new HBox(boldCheckBox, italicCheckBox);
        options.setAlignment(Pos.CENTER);
        
        final int checkBoxSpacing = 20;
        options.setSpacing(checkBoxSpacing); // between the check boxes

        final int componentSpacing = 20;
        setSpacing(componentSpacing); // between the text and the check boxes
        getChildren().addAll(phrase, options);
    }

    /**
     * Updates the font style of the displayed text.
     * @param event invoked this method
     */
    public void processCheckBoxAction(ActionEvent event) {
        FontWeight weight = FontWeight.NORMAL;
        FontPosture posture = FontPosture.REGULAR;

        if (boldCheckBox.isSelected()) {
            weight = FontWeight.BOLD;
        }

        if (italicCheckBox.isSelected()) {
            posture = FontPosture.ITALIC;
        }

        phrase.setFont(Font.font("Helvetica", weight, posture, FONT_SIZE));
    }
}

