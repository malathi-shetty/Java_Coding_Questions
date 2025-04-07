package string_Transformation;

public class StringTransformation_without_StringBuilder {
	
//WAP in java to find input = “Tomorrow”, Output= “T&m&&rr&&&w” 
	
	public static void main(String[] args) {
		String input = "Tomorrow";
        String transformed = ""; // Start with an empty string for the result
        int oCount = 1; // To track how many times 'o' has appeared
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'o') {
                // Replace 'o' with '&' and repeat '&' according to its occurrence count
                for (int j = 0; j < oCount; j++) {
                    transformed += "&"; // Concatenate '&' for each occurrence of 'o'
                }
                oCount++; // Increase the count of '&' for the next 'o'
            } else {
                // For all other characters, simply append them
                transformed += currentChar; // Concatenate the character
            }

            // Debugging statement: Print the current transformation after each character
            System.out.println("Current transformation: " + transformed);
        }

        // Output the final transformed string
        System.out.println("Transformed string: " + transformed);
    }

}
