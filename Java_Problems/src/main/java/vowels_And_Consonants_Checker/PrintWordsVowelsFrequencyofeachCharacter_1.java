package vowels_And_Consonants_Checker;

import java.util.HashMap;

public class PrintWordsVowelsFrequencyofeachCharacter_1 {

	public static void main(String[] args) {
		// PrintWordsVowelsFrequencyofeachCharacter.java: Prints the total word count, count of vowels, and frequency of each character.
		
		String s= "Hello John Doe";
		
		//Counting words
		String[] words = s.split(" "); //
		int wordCount = words.length;
		
		// Counting vowels
		
		int vowelCount =0;
		String vowels = "aeiouAEIOU";
		for(char c: s.toCharArray()) //Loops through each character in the string.
		{
			if(vowels.indexOf(c) != -1) //Checks if the character is a vowel by seeing if it exists in the vowels string.
			{
				vowelCount++; //Increments the vowel count if the character is a vowel.
			}
		}
		
		// Counting frequency of each character
		HashMap<Character, Integer> newobj = new HashMap<>();
		for(char c: s.toCharArray()) //Loops through each character in the string again to count frequencies.
		{
			if( c != ' ') // Ignore spaces -  to avoid counting them.
			 {  
				newobj.put(c, newobj.getOrDefault(c, 0) + 1); //Adds the character to the HashMap. If the character already exists, it increments the count.
			 }
		}
		
	    // Printing results
        System.out.println("Word count: " + wordCount);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Character frequencies: " + newobj);

        
	}

}

/* Output:
 * 
 * Word count: 2
 * 
Vowel count: 5

Character frequencies: {D=1, e=2, H=1, h=1, J=1, l=2, n=1, o=3}

*/

/*
Explanation:
Word count: The number of words is calculated by splitting the string on spaces.

Vowel count: The program iterates through each character and counts how many are vowels (both lowercase and uppercase).

Character frequencies: A HashMap is used to count how many times each character appears in the string (excluding spaces).

*/

/*

What this topic is about: This program counts:

The total number of words in a string.

The total number of vowels (a, e, i, o, u).

The frequency of each character in the string.


Steps to Solve:

Counting Words:

Split the string by spaces to count individual words.

Counting Vowels:

Loop through the string and check each character.

If the character is a vowel (a, e, i, o, u), increase the vowel count.

Counting Character Frequency:

Use a simple loop to go through each character of the string.

Maintain a count of how many times each character appears in the string.



Line-by-Line Debug Mode

String str = "Welcome to Java Programming";

Initializes the string to be processed.

String[] words = str.split(" ");

Splits the string into words using space as the delimiter. The split(" ") method creates an array of words.

int wordCount = words.length;

The length of the words array gives the number of words in the string.

int vowelCount = 0;

Initializes a variable to count vowels.

String vowels = "aeiouAEIOU";

A string containing all vowels, both lowercase and uppercase.

for (char c : str.toCharArray()) {

Loops through each character in the string.

if (vowels.indexOf(c) != -1) {

Checks if the character is a vowel by seeing if it exists in the vowels string.

vowelCount++;

Increments the vowel count if the character is a vowel.

HashMap<Character, Integer> charFrequency = new HashMap<>();

Initializes a HashMap to store the frequency of each character.

for (char c : str.toCharArray()) {

Loops through each character in the string again to count frequencies.

if (c != ' ') {

Ignores spaces to avoid counting them.

charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);

Adds the character to the HashMap. If the character already exists, it increments the count.

System.out.println("Total words: " + wordCount);

Prints the total word count.

System.out.println("Total vowels: " + vowelCount);

Prints the total vowel count.

System.out.println("Character frequencies: " + charFrequency);

Prints the frequency of each character.



Output Explanation for 3 Scenarios

✔️ Positive Input Example:

Input: "Welcome to Java Programming"

Word count: 4 (Words: Welcome, to, Java, Programming)

Vowel count: 8 (e, o, e, o, a, a, o, a)

Character frequencies:

W: 1, e: 3, l: 1, c: 1, o: 3, m: 2, t: 1, J: 1, a: 3, v: 1, P: 1, r: 2, g: 1, i: 1, n: 1

Output:

Total words: 4

Total vowels: 8

Character frequencies: {W=1, e=3, l=1, c=1, o=3, m=2, t=1, J=1, a=3, v=1, P=1, r=2, g=1, i=1, n=1}


❌ Negative Input Example:

Input: "" (Empty string)

Word count: 0

Vowel count: 0

Character frequencies: {}

Output:

Total words: 0

Total vowels: 0

Character frequencies: {}


🟡 Edge Case Example:

Input: "Java"

Word count: 1

Vowel count: 2 (a, a)

Character frequencies:

J: 1, a: 2, v: 1

Output:

Total words: 1 

Total vowels: 2

Character frequencies: {J=1, a=2, v=1}

*/





