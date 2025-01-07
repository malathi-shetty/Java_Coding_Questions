package count_The_Consecutive_Characters_aaabbcdddd_a2b3c1;

public class a2b3c1 {

	public static void main(String[] args) {

		// String s = "a2b3c1";
		String s = "a2b3c4";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				int x = Character.getNumericValue(s.charAt(i));

				for (int j = 1; j < x; j++) {
					System.out.print(s.charAt(i - 1));
				}
			}
		}
	}
}

/*
 * 
 * This program is trying to decode a string where each alphabet is followed by
 * a number, and it will print the alphabet repeated as many times as the number
 * next to it.
 * 
 * Example:
 * 
 * If the string is "a2b3c1", it means:
 * 
 * 'a' should appear 2 times (because of the '2' next to it).
 * 
 * 'b' should appear 3 times (because of the '3' next to it).
 * 
 * 'c' should appear 1 time (because of the '1' next to it).
 * 
 * So, the output for "a2b3c1" would be aabbbcc.
 * 
 * Here's what the code does, step by step:
 * 
 * Initialize a String:
 * 
 * The program has a string s = "a2b3c4", which means 'a' should repeat 2 times,
 * 'b' should repeat 3 times, and 'c' should repeat 4 times.
 * 
 * Loop Through the String:
 * 
 * The program goes through each character in the string one by one using a
 * loop.
 * 
 * For example, when it looks at a2, it sees:
 * 
 * a is a letter (not a number), so it just prints 'a'.
 * 
 * 2 is a number, so it will print 'a' one more time (since it repeats 2 times
 * in total).
 * 
 * Check if the Character is a Letter:
 * 
 * The code checks if the current character is a letter (alphabet) using
 * Character.isAlphabetic().
 * 
 * If it's a letter, it prints it.
 * 
 * If it's a number, it assumes this number tells how many times to print the
 * previous letter.
 * 
 * Print the Letter:
 * 
 * When a number is encountered (like '2', '3', or '4'), the program uses that
 * number to repeat the letter before it. For example:
 * 
 * When the program encounters '2' after 'a', it prints 'a' twice.
 * 
 * Then, for 'b' and '3', it prints 'b' three times.
 * 
 * For 'c' and '4', it prints 'c' four times.
 * 
 * Example Walkthrough for the String "a2b3c4":
 * 
 * The program starts with a (letter), then sees 2 (number), so it prints 'a' 2
 * times → aa.
 * 
 * Next, it sees b (letter), then 3 (number), so it prints 'b' 3 times → aa bbb.
 * 
 * Finally, it sees c (letter), then 4 (number), so it prints 'c' 4 times → aa
 * bbb cccc.
 * 
 * Output: aabbbcccc
 * 
 * Summary:
 * 
 * This program is like a "decoder" that converts a string with letters and
 * numbers into a string where each letter is repeated according to the number
 * that follows it.
 * 
 * 
 * 
 * 
 * 
 * The string is "a2b3c4".
 * 
 * The letter 'a' is followed by the number 2, which means 'a' should appear 2
 * times.
 * 
 * The letter 'b' is followed by the number 3, which means 'b' should appear 3
 * times.
 * 
 * The letter 'c' is followed by the number 4, which means 'c' should appear 4
 * times.
 * 
 * What the Code Does:
 * 
 * Loop Through Each Character: The program loops through the string one
 * character at a time. Let's go through each iteration for "a2b3c4":
 * 
 * First Character:
 * 
 * i = 0, the character is 'a', which is a letter.
 * 
 * The program prints 'a' because it’s a letter.
 * 
 * Second Character:
 * 
 * i = 1, the character is '2', which is a number.
 * 
 * The program converts the number '2' to an integer and knows that it should
 * print the letter 'a' one more time (since it already printed it once). So it
 * prints 'a' again.
 * 
 * Third Character:
 * 
 * i = 2, the character is 'b', which is a letter.
 * 
 * The program prints 'b' because it's a letter.
 * 
 * Fourth Character:
 * 
 * i = 3, the character is '3', which is a number.
 * 
 * The program converts the number '3' to an integer and prints the letter 'b'
 * two more times (since it already printed it once). So it prints 'b' two more
 * times.
 * 
 * Fifth Character:
 * 
 * i = 4, the character is 'c', which is a letter.
 * 
 * The program prints 'c' because it's a letter.
 * 
 * Sixth Character:
 * 
 * i = 5, the character is '4', which is a number.
 * 
 * The program converts the number '4' to an integer and prints the letter 'c'
 * three more times (since it already printed it once). So it prints 'c' three
 * more times.
 * 
 * Result:
 * 
 * After the loop finishes, the program prints the string formed by repeating
 * the letters:
 * 
 * 'a' appears 2 times → aa
 * 
 * 'b' appears 3 times → bbb
 * 
 * 'c' appears 4 times → cccc
 * 
 * So, the final output for the string "a2b3c4" is: aabbbcccc
 * 
 * Summary of the Code's Logic:
 * 
 * It goes through each character of the string.
 * 
 * If the character is a letter (like a, b, or c), it prints that letter.
 * 
 * If the character is a number (like 2, 3, or 4), it repeats the previous
 * letter based on the number.
 * 
 * 
 * 
 * why s.charAt(i) is wrriten on Character.isAlphabetic(s.charAt(i)
 * 
 * The method Character.isAlphabetic(s.charAt(i)) is used to check if the
 * character at index i in the string s is an alphabetic character (a letter).
 * The expression s.charAt(i) retrieves the character at position i in the
 * string.
 ***
 * 
 * 
 * s.charAt(i): This method returns the character at position i in the string s.
 * For example, if s = "a2b3c4", then:
 * 
 * s.charAt(0) would return 'a'
 * 
 * s.charAt(1) would return '2'
 * 
 * s.charAt(2) would return 'b'
 * 
 * and so on.
 * 
 * Character.isAlphabetic(s.charAt(i)):
 * 
 * Character.isAlphabetic() is a method that checks if a given character is an
 * alphabetic letter (either uppercase or lowercase).
 * 
 * When we call Character.isAlphabetic(s.charAt(i)), it checks whether the
 * character at index i of the string s is a letter or not.
 * 
 * If the character is a letter (like 'a', 'b', 'c'), it will return true. If
 * it's a digit (like '2', '3', '4'), it will return false.
 * 
 * The reason why s.charAt(i) is passed into Character.isAlphabetic() is because
 * the program is checking each character in the string to see if it is a
 * letter. If it's a letter, it will print it as part of the decoded output. If
 * it's a number, it will use that number to repeat the previous letter.
 ***
 *
 * 
 * For the string s = "a2b3c4":
 * 
 * First iteration (i = 0): s.charAt(0) is 'a'. Since 'a' is an alphabetic
 * letter, Character.isAlphabetic('a') returns true, and the program prints 'a'.
 * 
 * Second iteration (i = 1): s.charAt(1) is '2'. Since '2' is not an alphabetic
 * letter, Character.isAlphabetic('2') returns false.
 * 
 * The program then knows to repeat the previous character (which is 'a'), based
 * on the number 2.
 * 
 * This is the reason for using Character.isAlphabetic(s.charAt(i)) in the
 * code—to distinguish between alphabetic characters and numbers, and to handle
 * them appropriately.
 * 
 * 
 * 
 */