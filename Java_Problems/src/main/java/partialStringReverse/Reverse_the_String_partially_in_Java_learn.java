package partialStringReverse;

public class Reverse_the_String_partially_in_Java_learn {

	public static void main(String[] args) {
		// How do we reverse the String partially in Java
		
		String s = "priyanka";
		System.out.println("s: " + s);
		String result = partialReverse(s,3,6); // Reverse Characters from index 2 to 5
		System.out.println("Reversed Part result - s: " + result);
	}

	public static String partialReverse(String s, int start, int end) {
		// Extract the parts of the string
		
		String part1 = s.substring(0, start); // Before the part to reverse
		System.out.println("part1: " + part1);
		String partToReverse = s.substring(start, end); // part to reverse
		System.out.println("partToReverse: " + partToReverse);
		String part3 = s.substring(end); // After the part to reverse
		System.out.println("part3: " + part3);
		
		//Reverse the part using a loop
		String reversedPart = "";
		for(int i = partToReverse.length()-1; i>=0; i--)
		{
			reversedPart = reversedPart + partToReverse.charAt(i); // Append characters in reverse order
		}
		
		//Combine all parts and return the result 
		return part1 + reversedPart + part3;
	}
}