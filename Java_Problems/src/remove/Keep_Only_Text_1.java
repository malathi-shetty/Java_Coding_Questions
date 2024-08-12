package remove;

public class Keep_Only_Text_1 {

	public static void main(String[] args) {
		
		  String s = "Learning@789";
	        
	        // Find the index of the '@' character
	        int atIndex = s.indexOf('@');
	        
	        // Extract the part of the string before the '@' character       
	        String result = (atIndex == -1) ? s : s.substring(0, atIndex);
	        
	        // Print the result
	        System.out.println(result);
	}
}

/*
 * int atIndex = s.indexOf('@');
 * 		  //The indexOf('@') method is called on the string s. 
		  //This method returns the index (position) of the first occurrence of the @ character. 
		  //If @ is not found in the string, it returns -1.
	      
 * 
 * 
 * String result = (atIndex == -1) ? s : s.substring(0, atIndex);
This line uses the ternary conditional operator ? : to decide which substring to use:
Condition: (atIndex == -1)
If atIndex is -1 (i.e., @ was not found), it evaluates to true, and the entire string s is used as the result.
False Condition: s.substring(0, atIndex)
If atIndex is not -1 (i.e., @ was found), s.substring(0, atIndex) 
extracts the substring from the start (index 0) up to, but not including, atIndex. 
This effectively removes everything from @ onwards.
 * 
 * 
 * System.out.println(result);
This line prints the value of result to the console. 
If @ was present in the original string, it prints the part before @. 
If @ was not present, it prints the whole string.
 * 
 * 
 * Initialization: The string "priyanka@123" is stored in s.
Index Search: indexOf('@') finds where @ is located in the string.
Substring Extraction: Based on the index, we extract the part of the string before @, 
or return the entire string if @ is not present.
Output: The result is printed to the console.
 * */
