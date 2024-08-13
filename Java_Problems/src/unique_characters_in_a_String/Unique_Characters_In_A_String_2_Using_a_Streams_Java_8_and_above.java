package unique_characters_in_a_String;

import java.util.stream.Collectors;

public class Unique_Characters_In_A_String_2_Using_a_Streams_Java_8_and_above {

	public static void main(String[] args) {
		String input = "test string!";
		System.out.println("Unique characters: " + findUniqueCharacters(input));
	}

	public static String findUniqueCharacters(String str) {
		return str.chars().distinct() // Get distinct characters
				.mapToObj(c -> (char) c) // Convert to Character
				.map(String::valueOf) // Convert to String
				.collect(Collectors.joining()); // Join as String
	}

}
