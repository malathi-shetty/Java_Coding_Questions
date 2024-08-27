package practice_Exercise;

import java.util.stream.Stream;

public class Simple_Exercise_10_1 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::print);
		long count = stream.count();
		System.out.println(count);

	}

}

/*
 * Once a stream has been consumed, it cannot be used again. This means that
 * after the forEach operation, the stream is closed and cannot be used for
 * further operations like count.
 *
 * Stream<String> stream = Stream.of("a", "b", "c"); - Creates a stream of the
 * strings "a", "b", and "c".
 * 
 * stream.forEach(System.out::print); - This will print each element of the
 * stream. The output will be abc.
 * 
 * long count = stream.count(); - This line will throw an IllegalStateException
 * because the stream has already been used (or "consumed") by the forEach
 * operation.
 */