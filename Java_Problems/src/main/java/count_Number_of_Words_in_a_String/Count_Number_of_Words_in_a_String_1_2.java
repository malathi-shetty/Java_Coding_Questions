package count_Number_of_Words_in_a_String;

import java.util.Arrays;

public class Count_Number_of_Words_in_a_String_1_2 {

	public static void main(String[] args) {

		String str ="This is a        Sample     Sentence for Example.";
		String[] words = str.split("\\s+");
		int wordCount = words.length;
		System.out.println(Arrays.toString(words));
		System.out.println("Word Count: " + wordCount);
	}
}