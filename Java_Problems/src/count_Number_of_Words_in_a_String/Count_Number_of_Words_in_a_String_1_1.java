package count_Number_of_Words_in_a_String;

import java.util.Scanner;

public class Count_Number_of_Words_in_a_String_1_1 {

	public static void main(String[] args) {
		
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); // Welcome to Java world
		//System.out.println(s.length());
		
		int count = 1;
		for(int i=0; i <s.length()-1; i++)
		{
			if((s.charAt(i) == ' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in a String: " + count);
	}
}