package unique_characters_in_a_String;

public class Duplicate_Count_Character_Occurence_Approach_2_1 {

	public static void main(String[] args) {
		
		String s = "Java Programming Java OOPS"; // a is repeating need to find
		
		// total length of a string
		int totalcount=s.length();
		System.out.println("Total Length of a String: " + totalcount); 
		
		// total length of a string after removing a's
		int totalcount_afterRemove = s.replace("a", "").length();
		System.out.println("Total Length of a String after Removing a's: " + totalcount_afterRemove); 
		
		// total count_Number_of_Words_in_a_String of 'a' length in the string
		int count = totalcount - totalcount_afterRemove;
		System.out.println("Total count of the character: " + count);	
	}
}