package find_Second_Largest_of_3_Numbers_in_an_array;

import java.util.Arrays;

public class Find_Second_Largest_of_Numbers_in_an_array_1_2_learn {

	public static void main(String[] args) {

		int[] a = { 8, 5, 1, 10, 4 };
		// int[] a = { 1, 4, 7, 7, 7 };
		if (a.length < 2) {
			System.out.println("Dont proceed");
			return;
		}

		Arrays.sort(a); // 1,4,5,8,10
		System.out.println("Sorted array: " + Arrays.toString(a));
		// for (int i = a.length-1 ; i > 0; i--) { //10 - largest number
		for (int i = a.length - 2; i >= 0; i--) { // length = 5 - 2nd largest number: 8

			if (a[i] != a[a.length - 1]) { // a[3] // 8 != 10
				System.out.println("the second largest number is: " + a[i]);
				return; // Exit once the second largest number is found
			}
		}

		// If the loop completes without finding a second largest number
		System.out.println("No second largest number found.");
	}
}

/*
 * Loop Condition: Changed the loop from i > 0 to i >= 0 to ensure we cover the
 * possibility of the second largest being the first element in the sorted
 * array.
 * 
 * Break Loop Early: Added return; inside the if block to exit the main method
 * as soon as the second largest number is found. This avoids unnecessary
 * iterations once the result is determined.
 * 
 * Edge Case Handling: Added a final message "No second largest number found."
 * in case all elements in the array are the same or there’s no distinct second
 * largest value.
 * 
 * These changes ensure that the code correctly identifies and prints the second
 * largest number, even in cases with duplicate values or all elements being the
 * same.
 * 
 * 
 * 
 * // int[] a = { 8 }; // Don't proceed
 * 
 * // int[] a = { 8, 5, 1, 8, 4 }; // the second largest number is: 5
 * 
 * // int[] a = { 8, 8, 8, 8, 8 }; // No second largest number found.
 * 
 * // for (int i = a.length - 1; i >= 0; i--) { // 1st largest number: 10
 * 
 * // for (int i = a.length - 2; i >= 0; i--) { // 2nd largest number: 8
 * 
 * // for (int i = a.length - 3; i >= 0; i--) { // 3rd largest number: 5
 * 
 * // for (int i = a.length - 4; i >= 0; i--) { // 4th largest number: 4
 * 
 * // for (int i = a.length - 5; i >= 0; i--) { // 5th largest number: 1
 * 
 * 
 * In the array int[] a = { 8, 5, 1, 10, 4 }, the value of a[a.length - 1] is 4.
 * 
 * This is because a.length is 5, so a.length - 1 is 4, and a[4] is 4. the
 * condition is checking if the current element (a[i]) is not equal to the last
 * element (a[a.length - 1]) of the array.
 * 
 * In the array int[] a = { 8, 5, 1, 10, 4 }, the value of a[a.length - 1] is 4.
 * 
 * This is because a.length is 5, so a.length - 1 is 4, and a[4] is 4.
 * 
 * 
 * ***********
 * 
 * 
 * int[] a = { 1, 4, 7, 7, 7 };
 * 
 * 
 * for (int i = a.length - 2; i >= 0; i--) { if (a[i] != a[a.length - 1]) { 
 * // Check if a[i] is not the largest
 * System.out.println("The second largest number is: " + a[i]); return; } }
 * 
 * Output: "The second largest number is: 4" Explanation: The largest number in
 * the sorted array is 7 (located at a[a.length - 1]). The first element from
 * the end that is not 7 is 4, so 4 is identified as the second largest number.
 * 
 * if (a[i] != a[a.length - 2]) { // Check if a[i] is not the second largest
 * 
 * Output: "The second largest number is: 4" Explanation: Here, a[a.length - 2]
 * is 7, so the condition if (a[i] != 7) will find the first element that is not
 * 7. Since all elements after the largest number (which is 7) are also 7, the
 * first non-7 encountered is 4.
 * 
 * 
 * if (a[i] != a[a.length - 3]) { // Check if a[i] is not the third largest
 * Output: "The second largest number is: 4" 
 * Explanation: In this case, a[a.length - 3] is also 7 because the largest three elements 
 * in the sorted array are 7. 
 * Therefore, the condition if (a[i] != 7) will again find 4 as the first number that is not 7.
 * 
 * 
 * if (a[i] != a[a.length - 4]) { // Check if a[i] is not the fourth largest
 * Output: "The second largest number is: 4" 
 * Explanation: Since a[a.length - 4] is 7, 
 * the condition if (a[i] != 7) again identifies 4 as the number that is not 7.
 * 
 * 
 * 
 * 
 * 
 * In each case, the condition a[i] != a[a.length - k] where k is 1, 2, 3, or 4,
 * results in the same output "The second largest number is: 4". This is because
 * the largest numbers in the array are 7 and are repeated, so the condition
 * finds the first element that is different from these largest numbers, which
 * is 4.
 * 
 * This approach is suitable for identifying the second largest number when
 * there are duplicate values for the largest number.
 * 
 * 
 */
