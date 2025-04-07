package find_the_number_of_occurrences_of_character_in_a_string;

public class Find_the_number_of_occurrences_of_character_in_a_string {

	//Calculate the number of occurrences of character in a string using java
	
	 public static void main(String[] args) {
	 String str = "Automation";
     char targetChar = 'o';
     int count = countCharacterOccurrences(str, targetChar);
     System.out.println("Character '" + targetChar + "' occurs " + count + " times in the string.");
 }

 public static int countCharacterOccurrences(String str, char targetChar) {
     int count = 0;
     // Loop through the string to count occurrences of the target character
     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == targetChar) {
             count++;
         }
     }
     return count;
 }

}

/*Count Character Occurrences: Iterates through a string and counts how many times a specific character appears.
 * 
 * To calculate the occurrences of a specific character in a string, you can iterate through the string and count how many times the character appears.
 * 
 * 
The countCharacterOccurrences() method iterates through the string and checks if the current character matches the target character.

Each time it finds a match, it increments the count.

Output:

Character 'o' occurs 2 times in the string.

*/