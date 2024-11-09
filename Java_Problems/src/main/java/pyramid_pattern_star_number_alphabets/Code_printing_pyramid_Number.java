package pyramid_pattern_star_number_alphabets;

public class Code_printing_pyramid_Number {

	public static void main(String[] args) {
		int n = 5; // Change this value for different height

		// Ascending
		System.out.println("Ascending");

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i + 1; j++) {
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
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j + " "); // Print the number followed by a space
			}
			System.out.println(); // Move to the next line after each row
		}

		// Descending

		System.out.println(" ");
		System.out.println("Descending");

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {

				System.out.print(j + " ");
				System.out.print("\t "); // space
			}
			System.out.println(" ");
			// System.out.println("outer loop_3 finished");
		}

		System.out.println(" --- to have space & form like a inverted pyramid ---- ");
		for (int i = 0; i < 5; i++) {
			// Print leading spaces for the current row
			for (int space = 0; space < i; space++) {
				System.out.print(" "); // Print a space for indentation
			}
			// Print the numbers
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // Move to the next line after each row
		}

	}

}




//Ascending
//1	
//1	2	
//1	2	3	
//1	2	3	4	
//--- to have space & form like a pyramid ---- 
//   1 
//  1 2 
// 1 2 3 
//1 2 3 4 
 
//Descending
//1 	 2 	 3 	 4 	 5 	  
//1 	 2 	 3 	 4 	  
//1 	 2 	 3 	  
//1 	 2 	  
//1 	  
// --- to have space & form like a inverted pyramid ---- 
//1 2 3 4 5 
// 1 2 3 4 
//  1 2 3 
//   1 2 
//   1 

