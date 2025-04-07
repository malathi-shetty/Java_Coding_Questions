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
		//int num = 1234; // Store the original number
			int num= 16461; // 4224
			System.out.println("num: " + num);
		int org_num = num;
		System.out.println("org_num: " + org_num);
		int rev=0;
		
		while(num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("rev: " + rev);
		
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