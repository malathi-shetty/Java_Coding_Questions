package practice_Exercise;

public class Simple_Exercise_13 {

	public static void main(String[] args) {
		 int[] i = {10, 11, 12, 13};
	        int secondToLastIndex = i.length - 2; // Index 2

	        for (int j = 0; j < i.length; j++) {
	            i[secondToLastIndex] = i[j]; // Update the value at index 2
	            System.out.println(i[secondToLastIndex]); // Print the updated value
		}

	}

}

/*
 * Iterates through the array. During each iteration, i[secondToLastIndex] is
 * updated to the current value. This modifies the element at index 2 and then
 * prints it.
 * 
 * 
 * In the first iteration, i[2] is set to 10 and printed as 10. In the second
 * iteration, i[2] is updated to 11 and printed as 11. In the third iteration,
 * i[2] is still 11 (the updated value) and hence printed as 11 again. In the
 * fourth iteration, i[2] is updated to 13 and printed as 13.
 */