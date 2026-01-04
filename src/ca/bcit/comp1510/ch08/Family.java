package ca.bcit.comp1510.ch08;

/**
 * Demonstrates the use of variable length parameter lists.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Family {
    /** Names of family members. */
    private final String[] members;

    /**
     * Constructs a Family object by storying the (possibly multiple)
     * names that are passed as parameters.
     * @param names a variable number of Strings
     */
    public Family(String... names) {
        members = names;
        //make copy of names to avoid aliasing with external array
//        members = new String[names.length];
//        for (int i = 0; i < names.length; i++) {
//            members[i] = names[i];
//        }
    }

    /**
     * Returns a description of this Family as a String.
     * @return toString description
     */
    public String toString() {
        String result = "";

        for (String name : members) {
            result += name + "\n";
        }
        return result;
    }
}

