package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1_2 {

	public static void main(String[] args) {
		 String s = "BOOKEEPER";
	        char targetChar = 'E';
	        char replacementChar = '#';
	        
	        // Find the index of the second occurrence of the target character
	        int firstIndex = s.indexOf(targetChar);
	        if (firstIndex != -1) {
	            int secondIndex = s.indexOf(targetChar, firstIndex + 1);
	            if (secondIndex != -1) {
	                // Replace the second occurrence with the replacement character
	                s = s.substring(0, secondIndex) + replacementChar + s.substring(secondIndex + 1);
	            }
	        }
	        
	        System.out.println(s); // Output should be "BOOKE#PER"
	    }

	}
