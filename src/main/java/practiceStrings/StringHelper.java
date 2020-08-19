package practiceStrings;

import java.util.HashMap;
import java.util.Map;

/** StringHelper class contains several static methods for manipulating strings. */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {
        //TODO: Replace with your code.
        int count = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'a'
                    || message.charAt(i) == 'e'
                    || message.charAt(i) == 'i'
                    || message.charAt(i) == 'o'
                    || message.charAt(i) == 'u') {
                count++;
            }
        }
        return count; // remember to change
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     * @param message input message to encrypt
     * @param shift by how much the letters should be shifted
     * @return encrypted string
     * @author Prof. Rollins
     */
    public static String encrypt(String message, int shift) {
        //TODO: Replace with your code.
        if (shift > 26) return null;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            if ('A' <= message.charAt(i) && message.charAt(i) <= 'Z') {
                System.out.println("what A");
                if (message.charAt(i) + shift > (int) 'Z') {
                    str.append((char) ((int) 'A' + message.charAt(i) + shift - (int) 'Z' - 1));
                } else {
                    str.append((char) (message.charAt(i) + shift));
                }
            } else if ('a' <= message.charAt(i) && message.charAt(i) <= 'z') {
                if (message.charAt(i) + shift > (int) 'z') {
                    str.append((char) ((int) 'a' + message.charAt(i) + shift - (int) 'z' - 1));
                } else {
                    str.append((char) (message.charAt(i) + shift));
                }
            } else {
                return null;
            }
        }
        return str.toString(); // remember to change
    }

    /** Main method: runs methods of class StringHelper
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }
}
