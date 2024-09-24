package print_the_name_in_the_short_form;

public class Print_the_name_in_the_short_form_1 {

	public static void main(String[] args) {
		String fullName = "Mahendra Singh Dhoni";

		// Split the name and create the short form
		String[] parts = fullName.split(" ");
		if (parts.length >= 3) {
			// Extract initials from the first and middle names
			String shortForm = parts[0].charAt(0) + "." + parts[1].charAt(0) + ". " + parts[2];
			// Print the result
			System.out.println(shortForm);
		} else {
			// If the name does not have enough parts, print it as is
			System.out.println(fullName);
		}
	}

}


/*
parts[0].charAt(0): Takes the first character of the first name.

+ ".": Concatenates a period after the initial.

parts[1].charAt(0): Takes the first character of the middle name.

+ ".": Concatenates another period after the initial.

+ " ": Adds a space before the last name.

+ parts[2]: Appends the last name.

Example
For the full name "Mahendra Singh Dhoni":

parts[0] is "Mahendra", so parts[0].charAt(0) is 'M'.

parts[1] is "Singh", so parts[1].charAt(0) is 'S'.

parts[2] is "Dhoni".

*/