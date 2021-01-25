package ca.bcit.comp1510.ch02;

import static java.lang.System.getProperty;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * More advanced look at strings. Outside scope of chapter 2, included for 
 * completeness.
 * See https://www.javaadvent.com/2020/12/confusing-java-strings.html
 * Original code from https://github.com/jonatan-ivanov/java-strings-demo
 * @author Jonathan Ivanov
 * @author blink
 * @version 1.0
 */
public class ConfusingJavaStrings {
    /** Guess the length of these strings. */
    private static final List<String> TEST_STRINGS 
        = List.of("Java", "我喜欢茶", "𝕒𝕓𝕔", "👩❤☕", "👩‍💻❤️🍵");

    /**
     * Prints out information on multi-char characters.
     * @param args unused.
     */
    public static void main(String[] args) {
        System.out.printf("%s %s (%s)%n", getProperty("java.vm.vendor"),
                getProperty("java.vm.version"),
                getProperty("java.vm.name"));

        System.out.println("\n--- Length ---");
        transformAndPrint(TEST_STRINGS, String::length);

        System.out.println("\n--- Code Point Count ---");
        transformAndPrint(TEST_STRINGS, ConfusingJavaStrings::codePointCount);

        System.out.println("\n--- Code Points ---");
        transformAndPrint(TEST_STRINGS, ConfusingJavaStrings::codePoints);

        System.out.println("\n--- Code Units ---");
        transformAndPrint(TEST_STRINGS, ConfusingJavaStrings::codeUnits);

        System.out.println("\n--- Buggy Reverse ---");
        transformAndPrint(TEST_STRINGS, ConfusingJavaStrings::buggyReverse);

        System.out.println("\n--- Reverse ---");
        transformAndPrint(TEST_STRINGS, ConfusingJavaStrings::reverse);
        
        System.out.println("\n--- Reverse String Code Points ---");
        transformAndPrint(TEST_STRINGS, 
                ConfusingJavaStrings::reverseCodePoints);
        
        System.out.println("\n--- Reverse String Code Units---");
        transformAndPrint(TEST_STRINGS, 
                ConfusingJavaStrings::reverseCodeUnits);
    }

    private static void transformAndPrint(Collection<String> collection, 
            Function<String, ?> function) {
        collection.forEach(item -> System.out.println(item + " -> " 
            + function.apply(item)));
    }

    private static int codePointCount(String str) {
        return str.codePointCount(0, str.length());
    }

    private static String codeUnits(String str) {
        return str.chars().mapToObj(Integer::toHexString).
                map(String::toUpperCase).map(hex -> "\\u" + hex).
                collect(Collectors.joining(" "));
    }

    private static String codePoints(String str) {
        return str.codePoints().mapToObj(Integer::toHexString).
                map(String::toUpperCase).map(hex -> "U+" + hex).
                collect(Collectors.joining(" "));
    }

    private static String buggyReverse(String original) {
        String result = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            result += original.charAt(i);
        }

        return result;
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    private static String reverseCodePoints(String str) {
        return codePoints(reverse(str));
    }
    
    private static String reverseCodeUnits(String str) {
        return codeUnits(reverse(str));
    }
}
