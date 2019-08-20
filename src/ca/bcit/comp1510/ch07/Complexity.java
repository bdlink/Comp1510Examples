package ca.bcit.comp1510.ch07;

/**
 * Represents the interface for an object that can be assigned an explicit
 * complexity.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public interface Complexity {
    /** default complexity. */
    int DEFAULT_COMPLEXITY = 1;
    
    /** set complexity of item.
     * @param complexity new value for complexity
     */
    void setComplexity(int complexity);

    /** get complexity of item.
     * @return complexity of item
     */
    int getComplexity();
    
    /** set default complexity. */
    default void setDefaultComplexity() {
        setComplexity(DEFAULT_COMPLEXITY);
    }
}

