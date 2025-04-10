package swap_Two_Numbers_5_Ways;

public class Swap_the_two_numbers_using_the_substring_method {

	public static void main(String[] args) {
		// Write a program to swap the two numbers using the substring method.
		

		 // Initial numbers
        int num1 = 5;
        int num2 = 10;

        // Print before swapping
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Concatenate both numbers as a single string
        String concatenated = String.valueOf(num1) + String.valueOf(num2);

        // Find the position where the first number ends (length of num1's string)
        int num1Length = String.valueOf(num1).length();

        // Extract the numbers back using substring
        // Extract the first part (original num1)
        num1 = Integer.parseInt(concatenated.substring(num1Length));
        // Extract the second part (original num2)
        num2 = Integer.parseInt(concatenated.substring(0, num1Length));

        // Output swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
	}

}
