package anagram_Panagram;

public class Panagram_Check {

	 // Method to check if a string is a pangram
    public static boolean isPangram(String str) {
        // Convert to lowercase and remove non-alphabetic characters
        str = str.toLowerCase().replaceAll("[^a-z]", "");

        // Create a boolean array to track the presence of each letter
        boolean[] alphabet = new boolean[26];

        // Traverse the string and mark letters in the boolean array
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean isPresent : alphabet) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "Hello, world!";

        // Check if the strings are pangrams
        if (isPangram(str1)) {
            System.out.println("\"" + str1 + "\" is a pangram.");
        } else {
            System.out.println("\"" + str1 + "\" is not a pangram.");
        }

        if (isPangram(str2)) {
            System.out.println("\"" + str2 + "\" is a pangram.");
        } else {
            System.out.println("\"" + str2 + "\" is not a pangram.");
        }
    }

}
