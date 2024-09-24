package practice_Exercise;

import java.util.Arrays;
import java.util.List;

public class Simple_Exercise_10_3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");

		list.forEach(System.out::print); // Prints: abc
		long count = list.size(); // Size of the list
		System.out.println(count); // Prints: 3

	}

}

/*
 * Alternatively, if you want to work with the same stream for multiple
 * operations, you can use a collection: using a List instead of a Stream, which
 * allows multiple operations without the constraints of a stream.
 */