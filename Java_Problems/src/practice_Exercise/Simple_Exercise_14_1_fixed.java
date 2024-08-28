package practice_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simple_Exercise_14_1_fixed {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		words.add("orange"); // This is allowed
		words.stream().forEach(System.out::println);
	}
}