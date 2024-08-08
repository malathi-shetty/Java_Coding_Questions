package count;

public class Count_Character_Occurence {

	public static void main(String[] args) {
		
		String s = "Java Programming Java OOPS"; // a is repeating need to find
		
		// total length of a string
		int totalcount=s.length();
		System.out.println("Total Length of a String: " + totalcount); 
		
		// total length of a string after removing a's
		int totalcount_afterRemove = s.replace("a", "").length();
		System.out.println("Total Length of a String after Removing a's: " + totalcount_afterRemove); 
		
		// total count of 'a' length in the string
		int count = totalcount - totalcount_afterRemove;
		System.out.println("count: " + count);	
	}
}