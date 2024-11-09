package pyramid_pattern_star_number_alphabets;

public class GenericNumberPatterns {

	public static void main(String[] args) {
		// Uncomment the desired pattern and change the parameters as needed

		// Pattern 1: Even Numbers starting from 8
		printPattern(8, 2, 3); // (start, increment, rows)
		System.out.println();

		// Pattern 2: Multiples starting from 3
		printPattern(3, 3, 3); // (start, increment, rows)
		System.out.println();

		// Pattern 3: Simple Increment starting from 1 or Floyd's Triangle
		printPattern(1, 1, 4); // (start, increment, rows)
		System.out.println();

		// Pattern 4: Number Pyramid
		printNumberPyramid(4);
		System.out.println();

		// Pattern 5: Inverted Number Triangle
		printInvertedNumberTriangle(4);
		System.out.println();
	}

	// Generic function to print number patterns
	static void printPattern(int start, int increment, int rows) {
		int k = start; // Start with the given value
		for (int i = 0; i < rows; i++) { // Loop for the number of rows
			for (int j = 0; j <= i; j++) { // Loop for the columns in each row
				System.out.print(k + " "); // Print current value
				k += increment; // Increment the value
			}
			System.out.println(); // Move to the next line after each row
		}

	}

	// Number Pyramid
	static void printNumberPyramid(int n) {
		System.out.println("Number Pyramid");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// Inverted Number Triangle

	static void printInvertedNumberTriangle(int n) {
		System.out.println("Inverted Number Triangle");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}

//Output:

//Pattern 1: Even Numbers starting from 8
//8 
//10 12 
//14 16 18 

//Pattern 2: Multiples starting from 3
//3 
//6 9 
//12 15 18 

//Pattern 3: Simple Increment starting from 1 or Floyd's Triangle
//1 
//2 3 
//4 5 6 
//7 8 9 10 

//Pattern 4: Number Pyramid
//   1 
//  1 2 
// 1 2 3 
//1 2 3 4 

//Pattern 5: Inverted Number Triangle
//1 2 3 4 
//1 2 3 
//1 2 
//1 
