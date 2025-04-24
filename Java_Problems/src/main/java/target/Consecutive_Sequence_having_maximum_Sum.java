package target;

public class Consecutive_Sequence_having_maximum_Sum {

	// Find a consecutive sequemce in an array having maximum sum.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 6, 7, 8, 2, 1, 2 };
		int start = 0;
		int max_start = 0;
		int max_end = 0;
		int sum = 0;
		int max_sum = arr[0];
		for (int i = 1; i < arr.length; i++) { //So you don’t skip the last element
			if (arr[i] - arr[i - 1] == 1) {
				sum = sum + arr[i];
			} else {
				if (sum > max_sum) {
					max_sum = sum;
					max_start = start;
					max_end = i - 1;
				}
				start = i;// reset start index
			    sum = 0;        // reset sum for next sequence breaks ✅


			}
		}

		if (sum > max_sum) { //To catch if the last sequence is the max one
			max_sum = sum;
			max_start = start;
			max_end = arr.length - 1;
		}
		for (int k = max_start; k <= max_end; k++) {
			System.out.println(arr[k]);
		}

	}

}

/*
 * 
 * 
 * 🔍 What is the Goal?
 * 
From this array:

int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 2, 1, 2};

We want to find the longest group of consecutive increasing numbers (e.g. 1, 2, 3, 4 or 5, 6, 7, 8) that has the maximum total sum.

🧠 Variables in the Code:

 * Variable			Purpose

 * start			Tracks the start index of current sequence
	
 * max_start		Start index of the max sum sequence

 * max_end			End index of the max sum sequence

 * sum				Sum of current consecutive sequence

 * max_sum			Highest sum seen so far (used to update max_start/end)

🔎 Step-by-Step Execution

Let’s simulate how this runs for:

int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 2, 1, 2};

➤ Initialization:

start = 0

max_start = 0

max_end = 0

sum = 0

max_sum = arr[0] = 1

✅ Loop Starts:

for (int i = 1; i < arr.length - 1; i++) {

(You loop up to arr.length - 2, but should go up to arr.length to include last elements — we’ll fix that later.)

i = 1:

arr[1] = 2, arr[0] = 1 → 2 - 1 == 1 ✅

It's consecutive → sum = sum + arr[1] = 0 + 2 = 2

i = 2:

arr[2] = 3, arr[1] = 2 → consecutive

sum = 2 + 3 = 5

i = 3:

arr[3] = 4, arr[2] = 3 → consecutive

sum = 5 + 4 = 9

i = 4:

arr[4] = 2, arr[3] = 4 → NOT consecutive

Check: sum = 9, max_sum = 1 → Update:

max_sum = 9

max_start = start = 0

max_end = i - 1 = 3

Reset: start = 4, sum = 0

i = 5:

arr[5] = 5, arr[4] = 2 → Not consecutive → skip

Check: sum = 0, no update

Reset: start = 5

i = 6:

arr[6] = 6, arr[5] = 5 → ✅

sum = 0 + 6 = 6

i = 7:

arr[7] = 7, arr[6] = 6 → ✅

sum = 6 + 7 = 13

i = 8:

arr[8] = 8, arr[7] = 7 → ✅

sum = 13 + 8 = 21

i = 9:

arr[9] = 2, arr[8] = 8 → ❌

sum = 21 > max_sum = 9 → Update:

max_sum = 21

max_start = 5

max_end = 8

Reset: start = 9, sum = 0

i = 10:

arr[10] = 1, arr[9] = 2 → Not consecutive

No update

start = 10

i = 11:

arr[11] = 2, arr[10] = 1 → ✅

sum = 0 + 2 = 2

✅ End of loop.

Final Check (after loop):

You do:

if (sum > max_sum) {

    // Update max_start/end if needed (not triggered here)
    
}

🔚 Output:

The array slice from max_start = 5 to max_end = 8 is:

{5, 6, 7, 8}

Which has the max consecutive sum: 5 + 6 + 7 + 8 = 26

✅ Suggestions for Fix:

✅ Fix loop boundary:

Change:


for (int i = 1; i < arr.length - 1; i++)

To:

for (int i = 1; i < arr.length; i++)

✅ Reset sum = 0 inside the else block after checking.

🧪 Final Result:

Your code correctly finds and prints:

5
6
7
8
*/
