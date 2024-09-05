package average_of_Three_Numbers;

import java.util.Scanner;

public class Average_of_Three_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		double average =(num1+num2+num3) / 3.0;
		
		System.out.println("Average of Three Numbers are: " + average);

	}

}


//"Three numbers, add and divide by three for the average."