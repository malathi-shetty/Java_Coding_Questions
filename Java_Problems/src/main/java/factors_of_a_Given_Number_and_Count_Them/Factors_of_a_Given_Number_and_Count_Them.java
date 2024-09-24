package factors_of_a_Given_Number_and_Count_Them;

import java.util.Scanner;

public class Factors_of_a_Given_Number_and_Count_Them {
	
	// Java Program to Find Factors of a Given Number and Count Them

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int count = 0;
        System.out.print("Factors: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.print("\nNumber of factors: " + count);

	}

}

// "Check divisors and count them."