package reverse_A_Number_Different_Ways;

import java.util.Scanner;

public class Reverse_A_Number_2_Using_StringBuffer {

	public static void main(String[] args) {
		// Logic 2: Using StringBuffer Class Method
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num)); 
		StringBuffer rev = sb.reverse(); 
		
		System.out.println("Reverse Number is: " + rev);
	}
}
//Note: 
//StringBuffer sb = new StringBuffer(String.valueOf(num)); 
// Convert Number in String Format; Pass it into StringBuffer Constructor which is referring variable- sb
//StringBuffer rev = sb.reverse(); 
// reverse method is to reverse the string, 
//After reversing store the value in rev variable which is again StringBuffer variable & then print it