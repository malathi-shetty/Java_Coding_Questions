package partialStringReverse;

public class Reverse_the_String_partially_in_Java_1 {

	public static void main(String[] args) {
		// How do we reverse the String partially in Java
		
		String s = "Hello, World!";
        System.out.println("Original String: " + s);
        
        // Reverse characters from index 7 to 11 (inclusive)
        String result = partialReverse(s, 7, 12);
        System.out.println("Reversed Part Result: " + result);
    }

    public static String partialReverse(String s, int start, int end) {
        // Extract the parts of the string
        String part1 = s.substring(0, start); // Before the part to reverse
        System.out.println("part1: " + part1);
        
        String partToReverse = s.substring(start, end); // Part to reverse
        System.out.println("partToReverse: " + partToReverse);
        
        String part3 = s.substring(end); // After the part to reverse
        System.out.println("part3: " + part3);
        
    /*    // Reverse the part using StringBuilder
        StringBuilder reversedPart = new StringBuilder(partToReverse);
        reversedPart.reverse(); // Built-in reverse method
*/
        
     // Reverse the part using a loop
        String reversedPart = "";
        for (int i = partToReverse.length() - 1; i >= 0; i--) {
            reversedPart += partToReverse.charAt(i); // Append characters in reverse order
        }

        // Combine all parts and return the result 
        return part1 + reversedPart.toString() + part3;

	}

}
