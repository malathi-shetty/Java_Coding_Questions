package reverse_A_Number_3_Ways;

import java.util.Scanner;

public class Reverse_A_Number_1 {

	public static void main(String[] args) {
		
		// Taking inputs from User
		
		Scanner sc = new Scanner(System.in); // Accepts input from user at Runtime
		System.out.println("Enter a Number: "); // For user to enter a number
		
		int num = sc.nextInt(); // Accepts number from user & save it in variable num -- 4321 should be reversed as 1234
		
		// Logic 1: Using Algorithm
		
		int rev=0; // tempaorary nnumber
		
		while(num!=0)
		{
			rev = rev * 10 + num % 10; 
			num = num / 10; 
		}
		System.out.println("Reverse Number is: " + rev);
	}

}

//int rev=0;
//num = 4321

//                                        --- rev=0;
//                                        --- num = 4321
// rev = rev * 10 + num % 10; 
// rev = 0 * 10   + 4321 % 10  = 1        --- rev = 1 

//num = num / 10; 
//4321 = 4321 / 10 = 432.1 = 432          --- num = 432

// 1   = 1 * 10   + 432  % 10  = 10 + 2   --- rev = 12
//432  = 432 / 10              = 43.2     --- num = 43

//12   = 12 * 10  + 43   % 10  = 120 + 3  --- rev = 123
//43   = 43 / 10               = 4.3      --- num = 4

//123  = 123 * 10 + 4    % 10  = 1230 + 4 --- rev = 1234
//4    = 4 / 10                = 0.4      --- num = 0

