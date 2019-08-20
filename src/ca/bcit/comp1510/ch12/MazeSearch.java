package ca.bcit.comp1510.ch12;

/**
 * Demonstrates recursion.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class MazeSearch {

    /**
     * Creates a new maze, prints its original form, attempts to
     * solve it, and prints out its final form.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {
        Maze labyrinth = new Maze();

        System.out.println(labyrinth);

        if (labyrinth.traverse(0, 0)) {
            System.out.println("The maze was successfully traversed!");
        } else {
            System.out.println("There is no possible path.");
        }
        System.out.println(labyrinth);
    }
}

