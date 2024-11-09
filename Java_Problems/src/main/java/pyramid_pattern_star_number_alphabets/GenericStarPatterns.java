package pyramid_pattern_star_number_alphabets;

public class GenericStarPatterns {

	public static void main(String[] args) {
		 // Pattern 4: Right-aligned Star Pyramid
        printStarPattern(4, true); // (rows, rightAligned)
        System.out.println();

        // Pattern 5: Left-aligned Star Pyramid
        printStarPattern(4, false); // (rows, rightAligned)
        System.out.println();

        // Pattern 6: Descending Star Pyramid
        printDescendingStarPattern(5); // (rows)
    

	}
	
	// Generic function to print star patterns
    static void printStarPattern(int rows, boolean rightAligned) {
        for (int i = 1; i <= rows; i++) {
            if (rightAligned) {
                // Print spaces for right alignment
                for (int j = rows; j > i; j--) {
                    System.out.print(" ");
                }
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Function to print descending star pyramid
    static void printDescendingStarPattern(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print stars
            }
            System.out.println(); // Move to the next line after each row
        }

}
}