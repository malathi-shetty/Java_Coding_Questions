package reverse_A_Number_Different_Ways;

import java.util.Scanner;

public class Reverse_A_Number_3_Using_StringBuilder_1_1 {

	public static void main(String[] args) {
		//  Java Program to Reverse a Given Number Using Predefined Methods
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number:");
	        int number = sc.nextInt();
	        
	        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
	        
	        System.out.print("Reversed number: " + reversed);

	}

}


// Convert number to string, reverse the string, convert back to number.