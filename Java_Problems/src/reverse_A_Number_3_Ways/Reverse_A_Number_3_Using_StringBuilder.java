package reverse_A_Number_3_Ways;

import java.util.Scanner;

public class Reverse_A_Number_3_Using_StringBuilder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("Reverse Number is: " + rev);
	}
}

/**
Note: 
 sb - a class object is created in StringBuilder
 num is appended to the object sb
 we have to access the reverse number by using object & then reverse is stored in return StringBuilder type
 
 */