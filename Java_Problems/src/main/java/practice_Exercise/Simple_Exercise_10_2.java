package practice_Exercise;

import java.util.stream.Stream;

public class Simple_Exercise_10_2 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::print); // Prints: abc

		// Create a new stream to count elements
		long count = Stream.of("a", "b", "c").count(); // This creates a new stream and counts the elements
		System.out.println(count); // Prints: 3

	}

}
