package practice_Exercise;

import java.util.Arrays;
import java.util.List;

public class Simple_Exercise_9 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		
		System.out.println("*****int*****");
		numbers.stream().mapToInt(Integer::intValue) // Convert to IntStream
				.mapToObj(Simple_Exercise_9::process) // Apply the process(int) method
				.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("*****Integer*****");
		
		numbers.stream()
	    .map(Simple_Exercise_9::process)
	    .forEach(System.out::println);
	}

	static String process(int n) {
		return "int: " + n;
	}

	static String process(Integer n) {
		return "Integ: " + n;

	}

}

/*
 * 1. Initialize the List: List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
 * 
 * You start with a list of Integer objects: [1, 2, 3, 4].
 * 
 * 2. Create a Stream: numbers.stream()
 * 
 * You convert this list to a stream of integers.
 * 
 * 3. Map Each Element: .map(Simple_Exercise_9::process)
 * 
 * The .map operation is used to transform each element of the stream.
 * 
 * 4. Process Method Selection:
 * 
 * In the map operation, you use a method reference
 * Simple_Exercise_9::process.Java will attempt to find a suitable method based
 * on the type of elements in the stream.
 * 
 * Since the list contains Integer objects, the method process(Integer n) is
 * chosen because it's a match for the type in the stream.
 * 
 * The process method is chosen based on the type of argument: int n (primitive)
 * or Integer n (boxed type)
 * 
 * 5. Primitive vs. Boxed Type:
 * 
 * Even though there’s an overloaded process method for int, the stream contains
 * Integer, which means the process(Integer n) method is used.
 * 
 * The stream handles Integer (boxed type) and invokes the process(Integer n)
 * method.
 * 
 * 6. Print Each Element: forEach(System.out::println);
 * 
 * Finally, the .forEach operation prints each processed result. For the given
 * list [1, 2, 3, 4], the output will be:
 * 
 * Integ1 Integ2 Integ3 Integ4 This is because the process(Integer n) method is
 * called for each element in the stream.
 * 
 * *********
 * 
 * mapToInt(Integer::intValue): Converts the Stream<Integer> to IntStream, which
 * contains primitive int values.
 * 
 * mapToObj(Simple_Exercise_9::process): Converts the IntStream back to a
 * Stream<String> using the process(int) method.
 * 
 * forEach(System.out::println): Prints each processed string.
 * 
 * 
 * To use the process(int n) method with Integer objects in a stream:
 * 
 * Use mapToInt to convert the stream of Integer to IntStream.
 * 
 * Use mapToObj to apply the process(int n) method to each primitive int.
 * 
 * This alteration ensures that the process(int n) method is used for processing
 * the stream elements.
 * 
 */