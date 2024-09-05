package EVEN_and_ODD_Digits_count_in_A_Number;

import java.util.Scanner;

public class Count_Number_Of_EVEN_and_ODD_Digits_in_A_Number {
	
	// Java Program to Count Even and Odd Digits Till the Given Number

	public static void main(String[] args) {
		
		/* Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        */
		//OR
	        
		//int num = 1234;
		int num = 145678;
		int even_count = 0;
		int odd_count = 0;
		
		while(num >0)
		{
			int rem = num% 10; // last digit extracted
			
			if(rem%2 == 0)
			{
				even_count++; // increase even count_Number_of_Words_in_a_String
			}
			else {
				odd_count++; // increase odd count_Number_of_Words_in_a_String
			}
			
			num = num/10;		
		}
		System.out.println("Even Numbers Count: " + even_count);
		System.out.println("Odd Numbers Count: " + odd_count);		
	}
}

/*
"Count digits; if even, increment even count; otherwise, odd count."

//Number - 145678
		
		//Even Digits: 3 | Odd Digits: 3
		
		// we will have 2 variables: even count_Number_of_Words_in_a_String & odd count_Number_of_Words_in_a_String
	
		// check last number is even or odd - if even increase even count_Number_of_Words_in_a_String & vice versa
	
		// once done eliminate & move to next number
	
		// any number modulo / remainder / % by 10 will get last number
	
		// if divided by 2 == 0 its even - increase event count_Number_of_Words_in_a_String & eliminate value same for odd number - num % 10 (extract)
	
		// to eliminate the last value once count_Number_of_Words_in_a_String is done - eliminate value by dividing it by 10 - num / 10 (eliminate)

*/

