package check_Number_is_Even_or_Odd;

import java.util.Scanner;

public class Check_Number_is_Even_or_Odd {

	public static void main(String[] args) {
		// Check if the entered number is even or odd
     //   Scanner sc = new Scanner(System.in);
     //   System.out.print("Please enter a number: "); // 11
   //     int num = sc.nextInt();
        int num = 144;
        // Check for even or odd using the modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is an even number."); // Including the number in the output
        } else {
            System.out.println(num + " is an odd number."); // Including the number in the output
        }
        
   //     sc.close(); // Close the scanner to prevent resource leaks

	}
}
// Output: 144 is an even number.
