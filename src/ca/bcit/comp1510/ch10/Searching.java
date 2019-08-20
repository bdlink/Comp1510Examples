package ca.bcit.comp1510.ch10;

/**
 * Demonstrates the linear search and binary search algorithms.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Searching {

    /**
     * Searches the specified array of objects for the target using a linear
     * search. Returns a reference to the target object from the array if found,
     * and null otherwise
     * 
     * @param <T>
     *            Type placeholder for comparable type
     * @param list
     *            The array to be searched
     * @param target
     *            The object being searched for
     * @return The target if found, else null
     */
    public static <T extends Comparable<T>> T linearSearch(T[] list, T target) {
        int index = 0;
        boolean found = false;

        while (!found && index < list.length) {
            if (list[index].equals(target)) {
                found = true;
            } else {
                index++;
            }
        }

        if (found) {
            return list[index];
        } else {
            return null;
        }
    }

    /**
     * Searches the specified array of objects for the target using a binary
     * search. Assumes the array is already sorted in ascending order when it is
     * passed in. Returns a reference to the target object from the array if
     * found, and null otherwise.
     * 
     * @param <T>
     *            Type placeholder for comparable type
     * @param list
     *            Array to be searched
     * @param target
     *            Value to search for in array
     * @return Target found from array, null if not found
     */
    public static <T extends Comparable<T>> T binarySearch(T[] list, T target) {
        int min = 0;
        int max = list.length - 1;
        int mid = 0;
        boolean found = false;

        while (!found && min <= max) {
            mid = (min + max) / 2;
            if (list[mid].equals(target)) {
                found = true;
            } else if (target.compareTo((T) list[mid]) < 0) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        if (found) {
            return list[mid];
        } else {
            return null;
        }
    }
}

