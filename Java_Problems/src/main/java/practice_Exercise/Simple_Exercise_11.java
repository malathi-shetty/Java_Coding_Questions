package practice_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Simple_Exercise_11 {

	
	//JDK Issues
	
	public static void main(String[] args) {
		// List<String> words = List.of("apple", "banana", "cherry"); // For Java 9 or later
		List<String> words = Arrays.asList("apple", "banana", "cherry");
/*	 Optional<String> result = words.stream()
                 .filter(s -> s.length() > 6)
                 .map(s -> s.substring(0, 3))
                 .findAny();
		System.out.println(result.orElse("None"));
*/
	}

}

/*
 * List.of("apple", "banana", "cherry"): This creates an immutable list
 * containing the three strings. It is only available in Java 9 and later.
 * 
 * Arrays.asList("apple", "banana", "cherry"): This is used in Java 8 and
 * earlier to create a mutable list.
 * 
 * 
 * List Creation:
 * 
 * words is a list containing three strings: "apple", "banana", and "cherry".
 * 
 * Stream Processing:
 * 
 * .stream(): Creates a stream from the list. .filter(s -> s.length() > 6):
 * Filters the strings to include only those with a length greater than 6. In
 * this case, none of "apple", "banana", or "cherry" has a length greater than
 * 6.
 * 
 * .map(s -> s.substring(0, 3)): Maps the filtered strings to their first three
 * characters. Since the filter step yields no elements, this step doesn’t
 * process any data.
 * 
 * .findAny(): Attempts to find any element from the resulting stream. If no
 * elements are present, it returns an empty Optional.
 * 
 * Result Handling: result.orElse("None"): If result is empty, it returns
 * "None".
 * 
 * Output: Since no string in the list has a length greater than 6, the filter
 * step results in an empty stream, leading findAny to return an empty Optional.
 * 
 * Therefore, result.orElse("None") will return "None".
 * 
 */