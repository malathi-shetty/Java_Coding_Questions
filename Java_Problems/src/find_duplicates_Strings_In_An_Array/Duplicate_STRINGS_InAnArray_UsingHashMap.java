package find_duplicates_Strings_In_An_Array;

import java.util.HashMap;

public class Duplicate_STRINGS_InAnArray_UsingHashMap {
	
	public static void main(String[] args) { //Entry point of the Java program.
		
		//String s = "malathishettyyyyyyyyyyyyyeeeee"; //Initializes a string s with a sequence of characters.
		String s = "I am a student student for testing testing learning learning Java Selenium Java Selenium"; 
		char[] a = s.toCharArray(); // each value would be stored in the array - m[0], a[1],l[2], a[3],... 
		//Converts the string s into an array of characters a. This allows easy iteration over each character in the string.
		
		HashMap<Character, Integer> newobj = new HashMap<Character, Integer>();
		//HashMap <String, Integer> newobj = new HashMap<String, Integer>(); can write either character or string
		//Creates a new HashMap named newobj where keys are characters (Character) and values are integers (Integer). 
		//This map will store each character along with its count_Number_of_Words_in_a_String of occurrences.
		//Creates a new empty HashMap newobj.
		 // keys - unique
		// value - duplicates
		
		int count =1; //Initializes an integer variable count_Number_of_Words_in_a_String to 1. This will be used to count_Number_of_Words_in_a_String occurrences of each character.
		
		for(int i=0; i<a.length; i++)//Loops through each character in the array a.
		{
			if(!newobj.containsKey(a[i]))//Checks if the character a[i] is already a key in the HashMap newobj. 
			{
		    newobj.put(a[i], count);//If newobj does not contain currentChar, it adds the character a[i] as a key with an initial count_Number_of_Words_in_a_String (count_Number_of_Words_in_a_String) of 1.
		    //Prints a message indicating that the character currentChar is added to the HashMap with an initial count_Number_of_Words_in_a_String of 1.
			}else
			{
				newobj.put(a[i],newobj.get(a[i])+1);//If yes (else block), it increments the count_Number_of_Words_in_a_String of occurrences associated with a[i] by 1.
				/*
				 * If newobj contains currentChar:
			int currentCount = newobj.get(currentChar);: Retrieves the current count_Number_of_Words_in_a_String of currentChar from the HashMap.
			newobj.put(currentChar, currentCount + 1);: Updates the count_Number_of_Words_in_a_String of currentChar in the HashMap by incrementing its current count_Number_of_Words_in_a_String by 1.
			System.out.println("Incremented count_Number_of_Words_in_a_String of '" + currentChar + "' to " + (currentCount + 1));: 
					Prints a message indicating that the count_Number_of_Words_in_a_String of currentChar has been incremented.*/
			}
			
		}
		for(Character i:newobj.keySet())//After populating the HashMap, another loop iterates through each key (Character i) in the HashMap.
		{
			System.out.println("the character duplicate is: " + i + " Value: " + newobj.get(i));
			// Prints each character (i) along with its count_Number_of_Words_in_a_String of occurrences (newobj.get(i)).
		}
	}// In this Java program counts the occurrences of each character in the string s using a HashMap. 
	//It prints each unique character along with the number of times it appears in the string. 
	//The use of HashMap here ensures that each character is counted efficiently, 
	//and duplicates are managed by updating the value associated with each key (character).

}
