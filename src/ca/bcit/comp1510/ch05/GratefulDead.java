package ca.bcit.comp1510.ch05;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of a ArrayList object.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class GratefulDead {
    /**
     * Stores and modifies a list of band members.
     * 
     * @param args Unused
     */
    public static void main(String[] args) {
        List<String> band = new ArrayList<>();

        band.add("Jerry Garcia");
        band.add("Bob Weir");
        band.add("Ron \"Pigpen\" McKernan");
        band.add("Phil Lesh");
        band.add("Bill Kreutzmann");

        System.out.println("1965\n" + band);

        band.add("Mickey Hart");

        int location = band.indexOf("Ron \"Pigpen\" McKernan");
        band.remove(location);
        band.add("Keith Godchaux");
        band.add("Donna Godchaux");

        System.out.println("\n1973\n" + band);
        System.out.println("At index 1: " + band.get(1));

        location = band.indexOf("Keith Godchaux");
        band.set(location, "Brent Mydland");

        location = band.indexOf("Donna Godchaux");
        band.remove(location);

        System.out.println("\n1980\n" + band);
        System.out.println("Size of the band: " + band.size());
    }
}

