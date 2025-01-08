package sum_of_all_the_digits_in_a_number;

public class Find_Sum_of_Elements_in_Array_1_learn {

	public static void main(String[] args) {
		//Enhanced For Loop - For each loop
				int b[] = {12, 35, 1, 10, 34, 1};
				
				 // Calculate the sum of the array
				int sum = 0;
				for(int num: b)
				{
					sum = sum + num; // Add each element to the sum
				}
				
				// Print the sum
				System.out.println("Sum of all elements in the Array: " + sum);

	}

}

/*

Explanation:

Array Initialization: We initialize the array arr with some integer values.

Sum Calculation:

We declare a variable sum initialized to 0.

We use a for-each loop to iterate over each element (num) in the array, and for each iteration, we add the value of num to sum.

Output: After the loop, we print the final value of sum.

Output:

For the input array {12, 35, 1, 10, 34, 1}, the output will be:

Sum of all elements in the array: 93

*/