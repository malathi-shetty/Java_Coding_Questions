package generate_Random_Numbers_and_Strings;

import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

	//Write a Java program to get an integer input n (runtime), print a random string of length n and use the OOPS concept(After coding, explain what oops concepts you used)
	
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Method to generate a random string of given length
    public String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		 // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the random string
        System.out.print("Enter the length of the random string: "); // 10
        int length = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Create an instance of RandomStringGenerator
        RandomStringGenerator generator = new RandomStringGenerator();

        // Generate and display the random string
        String randomString = generator.generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);
    }

}

/*
 * 
 * Enter the length of the random string: 10
 * 
Generated Random String: jX7u2WrRzv


Explanation of OOP Concepts Used:

Classes and Objects:

The program defines a RandomStringGenerator class responsible for generating random strings.​

An object of this class is created in the main method to utilize its functionality.​

Encapsulation:

The CHARACTERS string is declared as a private static final variable within the RandomStringGenerator class, encapsulating the character set used for string generation.​

The generateRandomString method provides controlled access to the string generation functionality, ensuring that the internal implementation details are hidden from other classes.​

Methods:

The generateRandomString method defines the behavior for generating a random string of a specified length. It accepts an integer parameter length and returns a string.​

The main method serves as the entry point of the program, handling user input and orchestrating the string generation process.​

How the Program Works:

The user is prompted to enter the desired length for the random string.​

An instance of RandomStringGenerator is created.​

The generateRandomString method is called on the generator object with the specified length, producing a random string.​

The generated string is then displayed to the user.

*/
