package check_Given_Number_is_Prime_Or_Not;

import java.util.Scanner;

public class Prime_Number_1_1 {

	public static void main(String[] args) {
		// Natural Number should be greater than 1
		// Which has only 2 factors: 1 and itself
		//Eg: 19 - 1 & 19 --> Prime Number --> 2,3,5,7,11,13,17..
		// 28- 1,2,4,7,14,28 --> Not a Prime Number
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		
	//Or -->	//int num = 3; // 3 is a prime number
		int count = 0;
		
		if(num > 1)
		{
			for(int i =1; i <= num; i++)
			{
				if(num % i == 0)
					{
					count++;
					}
			}
			if(count == 2) // the number itself & 1
				{
				System.out.println(num + " is a Prime Number");
				}
			else {
				System.out.println(num + " is Not a Prime Number");
				}	
		}
		else {
			System.out.println(num + " is Not a Prime Number");
			}
	}
}