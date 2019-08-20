package ca.bcit.comp1510.ch09;

/**
 * Represents a book. Used as the parent of a derived class to demonstrate
 * inheritance.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Book {
    
    /** 
     * Default number of pages.
     */
    private static final int DEFAULT_PAGES = 1500;

    /**
     * Stores the number of pages in the Book
     * 
     * Should be private but illustrating how protected works. Violation of
     * Checkstyle.
     */
    protected int pages = DEFAULT_PAGES;

    /**
     * Returns the number of pages in the Book.
     * 
     * @return pages as an int
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets (mutates) the number of pages in the Book.
     * 
     * @param numPages
     *            an int
     */
    public void setPages(int numPages) {
        pages = numPages;
    }
}

