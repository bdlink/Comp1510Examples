package ca.bcit.comp1510.chH;

//import java.net.URL;
//import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * The controller for the Miles Per Gallon program.
 * 
 * @author Java Foundations
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class MilesPerGallonController {
    
    /** Initial value of the slider. */
    public static final int STARTING_VALUE = 100;
    
    /** Initial number of miles traveled. */
    private int milesTraveled = STARTING_VALUE;

    /** Displays the miles. */
    @FXML
    private Label milesLabel;

    /** Slider for adjusting miles. */
    @FXML
    private Slider milesSlider;

    /** Displays the gas required. */
    @FXML
    private TextField gasTextField;

    /** Button to calculate. */
    @FXML
    private Button calculateButton;

    /** Displays the result. */
    @FXML
    private Label resultLabel;

    /**
     * Calculates the MPG.
     * 
     * @param event
     *            Invokes this method.
     */
    @FXML
    private void calculateMPG(ActionEvent event) {
        double gasUsed = Double.parseDouble(gasTextField.getText());
        double mpg = milesTraveled / gasUsed;
        resultLabel.setText(String.format("MPG: %.2f", mpg));
    }

    /**
     * Initializes the slider listener.
     */
    public void initialize() {
        milesSlider.valueProperty().addListener(new SliderListener());
    }

    /**
     * An inner class that serves as the listener for the slider.
     */
    private class SliderListener implements ChangeListener<Number> {

        /**
         * Reacts to the changed slider.
         * 
         * @param ov
         *            The element that changed
         * @param oldValue
         *            The old value
         * @param newValue
         *            The new value
         */
        public void changed(ObservableValue<? extends Number> ov,
                            Number oldValue,
                            Number newValue) {
            milesTraveled = newValue.intValue();
            milesLabel.setText("Miles: " + milesTraveled);
        }
    }
}


