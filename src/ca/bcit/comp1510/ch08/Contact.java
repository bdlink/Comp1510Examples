package ca.bcit.comp1510.ch08;

/**
 * Represents a phone contact.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Contact implements Comparable<Contact> {
    /** The Contact's first name. */
    private String firstName;

    /** The Contact's last name. */
    private String lastName;

    /** The Contact's phone number. */
    private String phone;

    /**
     * Constructs a new Contact object with the specified data.
     * 
     * @param first The first name
     * @param last The last name
     * @param telephone The telephone number
     */
    public Contact(String first, String last, String telephone) {
        firstName = first;
        lastName = last;
        phone = telephone;
    }
    
    /**
     * Returns first name.
     * @return firstName as a String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns last name.
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns a description of this Contact object.
     *
     * @return formatted value of last name, first name, and phone
     */
    public String toString() {
        return lastName + ", " + firstName + "\t" + phone;
    }

    /**
     * Returns true if this Contact is equal to the specified Object.
     * 
     * @param other The object being compared to this Contact
     * @return true if they are the same, else false
     */
    public boolean equals(Object other) {
        return (other instanceof Contact
                && lastName.equals(((Contact) other).getLastName())
                && firstName.equals(((Contact) other).getFirstName()));
        //return compareTo((Contact) other) == 0
    }
    
    /**
     * Returns hash of this Contact.
     * 
     * @return hash code
     */
    @Override
    public int hashCode() {
        return lastName.hashCode() ^ firstName.hashCode();

    }

    /**
     * Uses both last and first names to determine ordering.
     * 
     * @param other Contact to compare to this one
     * @return value whose sign indicates relationship of this contact to other
     */
    public int compareTo(Contact other) {
        int result;

        if (lastName.equals(other.getLastName())) {
            result = firstName.compareTo(other.getFirstName());
        } else {
            result = lastName.compareTo(other.getLastName());
        }
        return result;
    }

}

