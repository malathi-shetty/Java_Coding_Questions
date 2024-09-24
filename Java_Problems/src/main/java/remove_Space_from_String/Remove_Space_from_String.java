package remove_Space_from_String;

import java.util.Scanner;

public class Remove_Space_from_String {

	public static void main(String[] args) {
		System.out.print("Enter String: "); //hello java Learning
		Scanner sc = new Scanner(System.in); 
		String input = sc.nextLine(); 
		System.out.println("Original String- " + input);
		input = input.replaceAll("\\s", ""); 
		System.out.println("Final String- " + input);

	}

}
