package print_the_name_in_the_short_form;

public class Print_the_name_in_the_short_form_3 {

	public static void main(String[] args) {

		String fullName = "Mahendra Singh Dhoni";

		// Split the full name by spaces
		String[] parts = fullName.split(" ");

		// Handle names with at least three parts
		if (parts.length < 3) {
			System.out.println(fullName); // Print as is if not enough parts
			return; // Exit if not enough parts
		}

		// Extract the first name, middle name, and last name
		String firstName = parts[0];
		String middleName = parts[1];
		String lastName = parts[2];

		// Create the short form: Initial of first and middle names followed by the last
		// name
		String shortFormName = firstName.charAt(0) + "." + middleName.charAt(0) + ". " + lastName;

		// Print the result
		System.out.println(shortFormName);

	}

}

/*
 * Splitting: The full name is split into parts based on spaces.
 * 
 * Condition Check: Ensures there are at least three parts. If not, it prints
 * the full name.
 * 
 * Short Form Creation: Constructs the short form using the initials of the
 * first two names and the full last name.
 * 
 * Printing: Outputs the correctly formatted short form.
 * 
 * 
 */
