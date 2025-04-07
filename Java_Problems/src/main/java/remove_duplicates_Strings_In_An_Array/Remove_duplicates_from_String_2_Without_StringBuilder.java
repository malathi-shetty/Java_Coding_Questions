package remove_duplicates_Strings_In_An_Array;

import java.util.LinkedHashSet;

//Write a Java program to remove duplicates from given String str1 = "automation" : o/p: "automin" ?

public class Remove_duplicates_from_String_2_Without_StringBuilder {

	public static void main(String[] args) {
        String s = "automation";
        String result = removeDuplicates(s);
        System.out.println("Output: " + result);
    }

    public static String removeDuplicates(String s) {
        // Create a LinkedHashSet to store characters without duplicates
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Iterate over the string and add characters to the set
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

        // Convert the set back to a string (no StringBuilder)
        String result = "";
        for (char c : charSet) {
            result += c;
        }

        return result;
    }

}
