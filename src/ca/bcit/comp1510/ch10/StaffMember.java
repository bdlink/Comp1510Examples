package ca.bcit.comp1510.ch10;

import java.util.Scanner;

/**
 * Represents an abstract staff member. We do not know how to pay the staff
 * member, so subclasses will have to provide the pay method.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public abstract class StaffMember {
    /** Name of staff member. */
    private String name;

    /** Address of staff member. */
    private String address;

    /** Phone number of staff member. */
    private String phone;

    /**
     * No argument constructor. For creating components to be initialized from a
     * Scanner
     */
    public StaffMember() {
    }

    /**
     * Constructs a new StaffMember object using the specified information.
     * 
     * @param eName
     *            employee name
     * @param eAddress
     *            employee address
     * @param ePhone
     *            employee phone
     */
    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    /**
     * Returns a string including the basic employee information.
     * 
     * @return each element on separate line
     */
    public String toString() {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;
    }

    /**
     * Derived classes must define the pay method for each type of employee.
     * 
     * @return amount staff member is paid
     */
    public abstract double pay();

    /**
     * Reads instance data from scanner. Subclasses that add instance data
     * should override to read additional data.
     * 
     * @param scan
     *            Should be positioned before the instance data. Each field
     *            should be a token.
     */
    public void readInstanceData(Scanner scan) {
        name = scan.next();
        address = scan.next();
        phone = scan.next();
    }
}


