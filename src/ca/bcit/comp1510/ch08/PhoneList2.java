package ca.bcit.comp1510.ch08;

/**
 * Driver for testing searching algorithms.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class PhoneList2 {

    /**
     * Creates an array of Contact objects, sorts them, then prints
     * them.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        Contact test;
        Contact found;
        Contact[] friends = {new Contact("John", "Smith", "610-555-7384"),
                             new Contact("Sarah", "Barnes", "215-555-3827"),
                             new Contact("Mark", "Riley", "733-555-2969"),
                             new Contact("Laura", "Getz", "663-555-3984"),
                             new Contact("Larry", "Smith", "464-555-3489"),
                             new Contact("Frank", "Phelps", "322-555-2284"),
                             new Contact("Mario", "Guzman", "804-555-9066"),
                             new Contact("Marsha", "Grant", "243-555-2837")};

        test = new Contact("Frank", "Phelps", "");
        found = Searching.linearSearch(friends, test);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("The contact was not found.");
        }
        System.out.println();

        Sorting.selectionSort(friends);

        test = new Contact("Mario", "Guzman", "");
        found = Searching.binarySearch(friends, test);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("The contact was not found.");
        }
    }
}

