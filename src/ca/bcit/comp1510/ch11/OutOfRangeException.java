package ca.bcit.comp1510.ch11;

/**
 * Represents an exceptional condition in which a value is out of some
 * particular range.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class OutOfRangeException extends Exception {

    /**
     * For serialization.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs an OutOfRangeException object with the specified message.
     * 
     * @param message Describes the exceptional situation
     */
    OutOfRangeException(String message) {
        super(message);
    }
}

