package pyramid_pattern_star_number_alphabets;

public class GenericPatterns {

	public static void main(String[] args) {
		 // Hollow Square
        printHollowSquare(5);
        System.out.println();

        // Diamond Pattern
        printDiamond(5);
        System.out.println();

       
    }

    // Hollow Square Pattern
    static void printHollowSquare(int n) {
    	System.out.println("Hollow Square Pattern");
    	System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Diamond Pattern
    
    static void printDiamond(int n) {
    	System.out.println("Diamond Pattern");
    	System.out.println(" ");
        // Upper triangle
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

   
}
    

