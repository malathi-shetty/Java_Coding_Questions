package find_Largest_Of_3_Numbers;

import java.util.Scanner;

public class Find_Largest_Of_3_Numbers_1 {
	public static void main(String[] args) {
		// a =10 b = 20 c = 30
		// a > b , a > c --> a is largest
		// b > a , b > c --> b is largest
		// c > a , c > b --> c is largest
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a= sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b= sc.nextInt();
		
		System.out.println("Enter Third Number: ");
		int c= sc.nextInt();
		
		if(a > b && a > c)
		{
			System.out.println( a+ " is largest Number");
		}else if(b > a && b > c)
		{
			System.out.println( b+ " is largest Number");
		}
		else
		{
			System.out.println( c+ " is largest Number");
		}
	}
}