package ca.bcit.comp1510.ch12;

/**
 * Represents a maze of characters. The goal is to get from the top left corner
 * to the bottom right, following a path of 1s.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Maze {
    
    /** Indicates the Cell has been tried and cannot be revisited. */
    private static final int TRIED = 3;
    
    /** Designates a Cell that is part of the solution path. */
    private static final int PATH = 7;

    /** The maze! */
    private int[][] grid = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1 },
                            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0 },
                            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1 },
                            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1 }, 
                            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

    /**
     * Attempts to recursively traverse the maze. Inserts special characters
     * indicating locations that have been tried and that eventually become part
     * of the solution
     * 
     * @param row The row index of the Cell being entered
     * @param column The column index of the Cell being entered
     * @return true if the maze is solved, else false
     */
    public boolean traverse(int row, int column) {
        boolean done = false;

        if (valid(row, column)) {
            grid[row][column] = TRIED;

            if (row == grid.length - 1 && column == grid[0].length - 1) {
                done = true;
            } else {
                // down
                done = traverse(row + 1, column);
                if (!done) {
                    // right
                    done = traverse(row, column + 1);
                }
                if (!done) {
                    // up
                    done = traverse(row - 1, column);
                }
                if (!done) {
                    // left
                    done = traverse(row, column - 1);
                }
            }

            if (done) {
                grid[row][column] = PATH;
            }
        }

        return done;
    }

    /**
     * Determines if the specified location is valid.
     * 
     * @param row The index of the row
     * @param column The index of the column
     * @return true if the cell is in the bounds of the matrix, else false
     */
    private boolean valid(int row, int column) {
        boolean result = false;

        // check if cell is in the bounds of the matrix
        if (row >= 0 && row < grid.length
                && column >= 0 && column < grid[row].length) {

            // check if cell is not blocked and not previously tried
            if (grid[row][column] == 1) {
                result = true;
            }
        }

        return result;
    }

    /**
     * Returns a String representation of this Maze.
     * 
     * @return toString of this Maze
     */
    public String toString() {
        String result = "\n";

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                result += grid[row][column] + "";
            }
            result += "\n";
        }

        return result;
    }
}

