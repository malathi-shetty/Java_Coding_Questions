package pyramid_pattern_star_number_alphabets;

public class Code_printing_pyramid_Alphabet {

	public static void main(String[] args) {

		// Ascending

		System.out.println("Ascending");

		for (int i = 0; i < 4; i++) {
			for (char j = 'A'; j <= 'A' + i; j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}

		System.out.println("--- to have space & form like a pyramid ---- ");

		for (int i = 0; i < 4; i++) {
			// Print leading spaces for indentation
			for (int space = 0; space < 3 - i; space++) {
				System.out.print(" "); // Print a space for indentation
			}
			// Print the numbers
			for (char j = 'A'; j <= 'A' + i; j++) {
				System.out.print(j + " "); // Print the number followed by a space
			}
			System.out.println(); // Move to the next line after each row
		}

		// Descending

		System.out.println(" ");
		System.out.println("Descending");

		for (int i = 0; i < 4; i++) {
			// Print characters from 'A' to 'A' + (4 - i - 1)
			for (char j = 'A'; j < 'A' + (4 - i); j++) {

				System.out.print(j);
				System.out.print("\t "); // space
			}
			System.out.println(" ");
			// System.out.println("outer loop_3 finished");

		}
		System.out.println("Character Pattern:");

		for (int i = 0; i < 4; i++) {
			// Print leading spaces for indentation
			for (int space = 0; space < i; space++) {
				System.out.print(" "); // Print a space for indentation
			}

			// Print characters in a row
			for (char j = 'A'; j < 'A' + (4 - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // Move to the next line after each row

		}

	}
}

//Ascending
//A	
//A	B	
//A	B	C	
//A	B	C	D	
//--- to have space & form like a pyramid ---- 
//   A 
//  A B 
// A B C 
//A B C D 
 
//Descending
//A	 B	 C	 D	  
//A	 B	 C	  
//A	 B	  
//A	  
//Character Pattern:
//A B C D 
// A B C 
//  A B 
//   A 