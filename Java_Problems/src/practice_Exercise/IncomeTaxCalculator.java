
package practice_Exercise;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		/*
		 * Calculate income tax by an employee to the government as per the slabs
		 * mentioned below : ? Income Tax 2.5L - 5.0L 5% 5.0L - 10.0L 20% Above 10.0L
		 * 30%
		 */

		Scanner scanner = new Scanner(System.in);

		// Prompt user for input
		System.out.print("Enter the annual income: ");
		double income = scanner.nextDouble();

		// Initialize tax variable
		double tax = 0.0;

		// Calculate tax based on slabs
		if (income > 1000000) {
			tax += (income - 1000000) * 0.30; // 30% tax on income above 10.0L
			income = 1000000;
		}
		if (income > 500000) {
			tax += (income - 500000) * 0.20; // 20% tax on income between 5.0L and 10.0L
			income = 500000;
		}
		if (income > 250000) {
			tax += (income - 250000) * 0.05; // 5% tax on income between 2.5L and 5.0L
		}

		// Output the result
		System.out.printf("The income tax is: %.2f\n", tax);

	}

}

/*
 * 
 * Input Handling:
 * 
 * The program reads the annual income from the user.
 * 
 * Tax Calculation:
 * 
 * If the income is above ₹10,00,000, tax is calculated at 30% for the amount
 * exceeding ₹10,00,000.
 * 
 * If the income is between ₹5,00,000 and ₹10,00,000, tax is calculated at 20%
 * for the amount exceeding ₹5,00,000.
 * 
 * If the income is between ₹2,50,000 and ₹5,00,000, tax is calculated at 5% for
 * the amount exceeding ₹2,50,000.
 * 
 * Output:
 * 
 * The program prints the total income tax based on the slabs.
 * 
 * Example
 * 
 * For an income of ₹12,00,000:
 * 
 * Tax on ₹2,50,000 to ₹5,00,000 = ₹12,500 (5% of ₹2,50,000)
 * 
 * Tax on ₹5,00,000 to ₹10,00,000 = ₹1,00,000 (20% of ₹5,00,000)
 * 
 * Tax on ₹10,00,000 to ₹12,00,000 = ₹60,000 (30% of ₹2,00,000)
 * 
 * Total Tax = ₹12,500 + ₹1,00,000 + ₹60,000 = ₹1,72,500 This program will
 * handle the calculation and display the tax amount correctly based on the
 * income slabs provided.
 * 
 * 
 * 
 */
