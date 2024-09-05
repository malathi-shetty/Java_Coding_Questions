package perfect_Number;

import java.util.Scanner;

public class Perfect_Number_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();

		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		if (sum == number) {
			System.out.println(number + " is a Perfect Number.");
		} else {
			System.out.println(number + " is not a Perfect Number.");
		}

	}

}

// Sum the divisors and compare with the number.
