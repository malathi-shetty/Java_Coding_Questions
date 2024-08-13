package palindrome_Number;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		//A Palindrome Number is a number that remains the same when its digits are reversed
		// 16461
			
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");		
		int num = sc.nextInt();
	*/
		//OR - below 1 statement - int original = 1234;
			int num = 1234; // Store the original number
			//int original= 16461; // 4224
			
		int org_num = num;
		int rev=0;
		
		while(num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
		if(org_num == rev)
		{
			System.out.println(org_num + " is Palindrome Number");
		}
		else
		{
			System.out.println(org_num + " is Not a Palindrome Number");
		}
	}
}