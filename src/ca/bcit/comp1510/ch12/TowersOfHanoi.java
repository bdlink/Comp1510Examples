package ca.bcit.comp1510.ch12;

/**
 * Represents the classic Towers of Hanoi puzzle.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class TowersOfHanoi {

    /** The total number of disks. */
    private int totalDisks;

    /**
     * Constructs a TowersOfHanoi object with the specified number of disks.
     * 
     * @param disks
     *            The height of the tower, in disks.
     */
    public TowersOfHanoi(int disks) {
        totalDisks = disks;
    }

    /**
     * Performs the initial call to moveTower to solve the puzzle. Moves the
     * disks from tower 1 to tower 3 using tower 2
     */
    public void solve() {
        final int start = 1;
        final int end = 3;
        final int temp = 2;
        moveTower(totalDisks, start, end, temp);
    }

    /**
     * Moves the specified number of disks from one tower to another by moving a
     * subtower of n-1 disks out of the way, moving one disk, then moving the
     * subtower back. Base case of 1 disk.
     * 
     * @param numDisks Disks to move.
     * @param start Start tower.
     * @param end End tower.
     * @param temp Temporary (intermediate or helper) tower.
     */
    private void moveTower(int numDisks, int start, int end, int temp) {
        if (numDisks == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numDisks - 1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks - 1, temp, end, start);
        }
    }

    /**
     * Displays instructions to move one disk from the specified start
     * tower to the specified end tower.
     * @param start Start tower.
     * @param end End tower.
     */
    private void moveOneDisk(int start, int end) {
        System.out.println("Move one disk from " + start + " to " + end);
    }
}

