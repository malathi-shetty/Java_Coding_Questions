package remove_duplicates_Strings_In_An_Array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unique_Characters_In_A_String_4_Using_Regular_Expressions {

	public static void main(String[] args) {
		String s ="The quick brown fox jumps over the lazy dog Hello, World!";
		System.out.println("unique characters: " + findUniqueCharacters(s));
	}

	public static String findUniqueCharacters(String str) {
		StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("(?i)([a-zA-Z])"); // Match alphabetic characters
        Matcher matcher = pattern.matcher(str);
        
        while (matcher.find()) {
            String match = matcher.group();
            if (result.toString().indexOf(match) == -1) {
                result.append(match);
            }
        }
        return result.toString();
	}
}

/*
 * The regular expression (?i)([a-zA-Z]) has several components:
(?i): This is a flag that makes the matching case-insensitive. 
It means that the pattern will match both uppercase and lowercase letters.

([a-zA-Z]): This part defines a capturing group that matches any single alphabetic character:
[a-z]: Matches any lowercase letter from 'a' to 'z'.
[A-Z]: Matches any uppercase letter from 'A' to 'Z'.
The combination [a-zA-Z] thus matches any letter, regardless of case.

Matcher Class:
Matcher is another class in the java.util.regex package that is used 
to perform matching operations on an input string using the Pattern defined earlier.
The matcher method creates a Matcher object that will operate on the provided string str.
 */