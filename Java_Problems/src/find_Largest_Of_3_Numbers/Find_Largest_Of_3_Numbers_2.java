package find_Largest_Of_3_Numbers;

import java.util.Scanner;

public class Find_Largest_Of_3_Numbers_2 {
	
	//TERNARY OPERATOR
	// a=20 b =10
	// largest = a > b ? a : b

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a= sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b= sc.nextInt();
		
		System.out.print("Enter Third Number: ");
		int c= sc.nextInt();
		
	//	int largest1 = a > b? a:b; // largest of a & b
	//	int largest2 = c> largest1?c:largest1;
		
		// OR
		
		int largest = c > (a>b?a:b) ?c:(a>b?a:b);
		
		System.out.print("Largest of all 3 is: "+ largest);	
	}
}