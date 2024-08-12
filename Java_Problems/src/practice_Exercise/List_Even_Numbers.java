package practice_Exercise;

import java.util.Scanner;

public class List_Even_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit: ");
		int value = sc.nextInt();
		System.out.println("Print Even numbers between 1 and" + value);
		
		for(int i=1; i<=value; i++ )
		{
			//if the number is divisible by 2 then it is even
			if(i % 2 == 0) // i % 2 == 1 then odd
			{
				System.out.println(i + " ");
			}
			
		}
	}

}
