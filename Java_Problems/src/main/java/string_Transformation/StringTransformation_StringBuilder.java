package string_Transformation;

public class StringTransformation_StringBuilder {
//Java Program to transform the input string "Tomorrow" to "T&m&&rr&&&w"
	public static void main(String[] args) {
		String input = "Tomorrow";
        StringBuilder transformed = new StringBuilder();
        int oCount = 1; // To track how many times 'o' has appeared
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'o') {
                // Replace 'o' with '&' and repeat '&' according to its occurrence count
                for (int j = 0; j < oCount; j++) {
                    transformed.append('&');
                }
                oCount++; // Increase the count of '&' for the next 'o'
            } else {
                // For all other characters, simply append them
                transformed.append(currentChar);
            }
            
            // Debugging statement: Print the current transformation after each character
            System.out.println("Current transformation: " + transformed.toString());
        }
        

        // Output the transformed string
        System.out.println("Transformed string: " + transformed.toString());
    }

}
