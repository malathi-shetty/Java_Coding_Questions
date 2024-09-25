package practice_Exercise;

import java.util.Arrays;
import java.util.List;

public class Simple_Exercise_14 {
	
	//JDK Issues

	public static void main(String[] args) {
		// List<String> words = List.of("apple", "banana", "cherry"); // java 9 & above
		// -- This will throw UnsupportedOperationException
		List<String> words = Arrays.asList("apple", "banana", "cherry"); // This will throw
																			// UnsupportedOperationException
		words.add("orange");
//		words.stream().forEach(System.out::println);

	}

}

/*
 * List.of() creates an immutable list. This means you cannot modify it after
 * creation, including adding or removing elements. If you attempt to add an
 * element, it will throw an UnsupportedOperationException.
 * 
 * Arrays.asList() returns a fixed-size list backed by the original array. While
 * you can modify the elements of the list, you cannot add or remove elements.
 * Attempting to add an element with words.add("orange") will also throw
 * UnsupportedOperationException.
 * 
 */