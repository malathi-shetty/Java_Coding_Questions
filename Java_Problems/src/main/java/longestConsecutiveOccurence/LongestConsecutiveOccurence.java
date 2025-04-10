package longestConsecutiveOccurence;

public class LongestConsecutiveOccurence {

	public static void main(String[] args) {
		  int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };

	        int count = 1;  // Start with count 1 to count the first element
	        int max = 1;    // Start with max 1 as the minimum length can be 1

	        // Iterate over the array
	        for(int i = 0; i < arr.length - 1; i++) {
	            if(arr[i] + 1 == arr[i + 1]) {
	                count++; // Consecutive elements found
	            } else {
	                count = 1; // Reset count if no consecutive elements
	            }

	            max = Math.max(max, count); // Update max if current streak is larger
	        }

	        System.out.println("Longest Consecutive Occurrence Length: " + max);
	}

}

// Output: Longest Consecutive Occurrence Length: 4


/*
 * 
 * What is a consecutive occurrence?
A consecutive occurrence refers to a sequence of numbers in the array that appear in consecutive order, meaning each number in the sequence is exactly one more than the previous number. For example, the sequence [6, 7, 8, 9] is a consecutive occurrence because:

6 + 1 = 7

7 + 1 = 8

8 + 1 = 9

This is considered a valid consecutive subsequence.

 breakdown of the array: { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 }.

From 4 to 3 → Not consecutive (since 4 - 3 != 1).

From 3 to 25 → Not consecutive (25 - 3 != 1).

From 25 to 6 → Not consecutive (6 - 25 != 1).

From 6 to 7 → Consecutive (6 + 1 == 7).

From 7 to 8 → Consecutive (7 + 1 == 8).

From 8 to 9 → Consecutive (8 + 1 == 9).

After 9, we encounter 2 which breaks the consecutive sequence.

Thus, the longest consecutive subsequence is [6, 7, 8, 9], and its length is 4.

Example:
Let’s look at another example for better clarity:

Array: {1, 2, 3, 10, 11, 12, 4, 5}

1, 2, 3 → Consecutive.

10, 11, 12 → Consecutive.

4, 5 → Consecutive.

The longest consecutive subsequence here is [10, 11, 12], and its length is 3.

Conclusion:
A consecutive subsequence is a part of the array where each element is exactly one greater than the previous one.

The sequence [25] does not form a consecutive subsequence because there are no consecutive numbers directly following it (no 26 after 25).

*/

/*
 * 
 * 1. Initialization

* int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };
* int count = 1;  // Start with count 1 because the first element is itself a subsequence
* int max = 1;    // Start with max 1 because the minimum consecutive subsequence is 1
We have an array arr that contains the integers { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 }.

We initialize count as 1 because we always count the first element as part of a sequence.

We initialize max as 1 because, at the very least, there will be one number in the sequence (the first one).

2. Loop through the array

* for(int i = 0; i < arr.length - 1; i++) {
 *    if(arr[i] + 1 == arr[i + 1]) {
 *        count++; // Consecutive elements found
 *    } else {
  *       count = 1; // Reset count if no consecutive elements
   *  }
   *  max = Math.max(max, count); // Update max if current streak is larger
* }
* The loop goes through each element of the array, except for the last one (i < arr.length - 1).

Inside the loop, the code checks whether the current element (arr[i]) and the next element (arr[i + 1]) form a consecutive pair (i.e., whether arr[i] + 1 == arr[i + 1]).

If they are consecutive, we increase the count because we found another consecutive number in the sequence.

If they are not consecutive, we reset count to 1 because the sequence has been broken.

We then update the value of max to store the longest consecutive subsequence found so far. max = Math.max(max, count) ensures that max always holds the longest length.

3. Print the result

System.out.println("Longest Consecutive Occurrence Length: " + max);
After the loop finishes, max will hold the length of the longest consecutive subsequence.

The program then prints the result.


Let's go through the array {4, 3, 25, 6, 7, 8, 9, 2, 3, 10} step by step:

Initialization:

arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10 }

count = 1

max = 1

First iteration (i = 0):

Compare arr[0] = 4 with arr[1] = 3. 4 + 1 != 3, so the sequence is broken.

Reset count = 1.

max remains 1.

Second iteration (i = 1):

Compare arr[1] = 3 with arr[2] = 25. 3 + 1 != 25, so the sequence is broken.

Reset count = 1.

max remains 1.

Third iteration (i = 2):

Compare arr[2] = 25 with arr[3] = 6. 25 + 1 != 6, so the sequence is broken.

Reset count = 1.

max remains 1.

Fourth iteration (i = 3):

Compare arr[3] = 6 with arr[4] = 7. 6 + 1 == 7, so the sequence is consecutive.

Increase count to 2.

Update max = Math.max(1, 2) = 2.

Fifth iteration (i = 4):

Compare arr[4] = 7 with arr[5] = 8. 7 + 1 == 8, so the sequence is consecutive.

Increase count to 3.

Update max = Math.max(2, 3) = 3.

Sixth iteration (i = 5):

Compare arr[5] = 8 with arr[6] = 9. 8 + 1 == 9, so the sequence is consecutive.

Increase count to 4.

Update max = Math.max(3, 4) = 4.

Seventh iteration (i = 6):

Compare arr[6] = 9 with arr[7] = 2. 9 + 1 != 2, so the sequence is broken.

Reset count = 1.

max remains 4.

Eighth iteration (i = 7):

Compare arr[7] = 2 with arr[8] = 3. 2 + 1 == 3, so the sequence is consecutive.

Increase count to 2.

max remains 4 (since 2 is smaller than 4).

Ninth iteration (i = 8):

Compare arr[8] = 3 with arr[9] = 10. 3 + 1 != 10, so the sequence is broken.

Reset count = 1.

max remains 4.

Final result:
After the loop finishes, max is 4, which is the length of the longest consecutive subsequence [6, 7, 8, 9].

The program outputs: Longest Consecutive Occurrence Length: 4.

Summary:
The code iterates through the array to find consecutive numbers.

It tracks the length of each consecutive subsequence using count and updates the longest sequence found so far using max.

Finally, it prints the length of the longest consecutive subsequence.

*/
