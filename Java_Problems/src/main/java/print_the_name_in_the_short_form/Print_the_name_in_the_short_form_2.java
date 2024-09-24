package print_the_name_in_the_short_form;

public class Print_the_name_in_the_short_form_2 {

	public static void main(String[] args) {

		// String fullName ="Coach Rahul Dravid";
		String fullName = "Rahul Dravid";

		// Split the name into parts
		String[] parts = fullName.split(" ");

		// Create the short form if there are at least three parts
		String shortForm;
		if (parts.length >= 3) {
			// Construct the short form using proper string concatenation
			shortForm = String.valueOf(parts[0].charAt(0)) + "." + String.valueOf(parts[1].charAt(0)) + ". " + parts[2];
		} else {
			// Use the full name if there are not enough parts
			shortForm = fullName;
		}

		// Print the result
		System.out.println(shortForm);

	}

}

/*
 * String.valueOf(parts[0].charAt(0)): Converts the first character of the first name to a string. 
 * 
 * + ".": Concatenates the period as part of the final string.
 * 
 * String.valueOf(parts[1].charAt(0)): Converts the first character of the middle name to a string. 
 * 
 * + " ": Adds a space before the last name. 
 * 
 * parts[2]: Directly appends the last name. 
 * 
 * This approach ensures that all concatenations are handled as strings, avoiding any issues with numerical addition.
 * 
 */
