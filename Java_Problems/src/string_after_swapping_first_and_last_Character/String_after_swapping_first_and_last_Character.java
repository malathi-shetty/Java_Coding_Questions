package string_after_swapping_first_and_last_Character;

public class String_after_swapping_first_and_last_Character {

	public static void main(String[] args) {
		
		String s ="hello";
		
		//check if string has more than 1 character
		if(s.length()<2)
		{
			System.out.println("String is too short to swap characters.");
			return;
		}
		
		//Convert the string to a character array
		char[] charArray = s.toCharArray();
		
		//swap the first & last characters
		char temp = charArray[0];
		charArray[0] = charArray[charArray.length - 1];
		charArray[charArray.length - 1] = temp;
		
		//convert the character array back to a string
		String result = new String(charArray);
		
		//print the result
		System.out.println("String after swapping first and last Character: " + result);
	}

}
