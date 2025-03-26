package removeDuplicates_maintaining_the_original_order;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates_LinkedHashSet {

	
	/*
	 * 
	 * 1- Program in java to Remove duplicates from Array without changing the order? 
	 * 
input: int [] arr = {5,6,7,3,3,7,5};

output:  arr = {5,6,7,3};
	 * 
	 */
	public static void main(String[] args) {
		 int[] a = {5, 6, 7, 3, 3, 7, 5};
	        
	        // Convert array to a LinkedHashSet to remove duplicates and maintain order
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        
	        // Add elements to LinkedHashSet
	        for (int num : a) {
	            set.add(num);
	        }
	        
	        // Convert LinkedHashSet back to array
	        int[] result = new int[set.size()];
	       
	        int index = 0;
	        for (int num : set) {
	            result[index++] = num;
	        }
	        
	        // Output the result
	        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
	    }

}


/*


Initialization of Array: Initializing an integer array a with values {5, 6, 7, 3, 3, 7, 5}.

The array looks like: [5, 6, 7, 3, 3, 7, 5]

        // Convert array to a LinkedHashSet to remove duplicates and maintain order
        //
       
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
LinkedHashSet Initialization: You are creating a LinkedHashSet named set. A LinkedHashSet is used here because it removes duplicates and preserves the insertion order.

Initially, the set is empty: {}

        // Add elements to LinkedHashSet
        for (int num : a) {
        
            set.add(num);
            
        }
        
Adding elements to the LinkedHashSet:

Now iterating through each element in the array a and adding it to the set.

Step-by-step for each iteration:

First, 5 is added: {5}

Then 6 is added: {5, 6}

Then 7 is added: {5, 6, 7}

Then 3 is added: {5, 6, 7, 3}

Another 3 is encountered, but since LinkedHashSet doesn't allow duplicates, it doesn't add it again.

Another 7 is encountered, but again, it's not added because it's a duplicate.

Finally, 5 is encountered, but it's already in the set, so it's not added.

The final state of the set after all elements are added is:

{5, 6, 7, 3}

        // Convert LinkedHashSet back to array
        ///
         
        int[] result = new int[set.size()];

Creating the Result Array: You are creating an array result with a size equal to the size of the set. The size of the set is 4 because there are 4 unique elements {5, 6, 7, 3}.

At this point, the result array is initialized as:

[0, 0, 0, 0]  // Array with 4 elements (initialized to 0)

        int index = 0;
       
        for (int num : set) {
       
            result[index++] = num;
       
        }

Converting LinkedHashSet back to Array: Iterating over the set and copying each element into the result array.

On the first iteration, 5 is added to result[0]: [5, 0, 0, 0]

On the second iteration, 6 is added to result[1]: [5, 6, 0, 0]

On the third iteration, 7 is added to result[2]: [5, 6, 7, 0]

On the fourth iteration, 3 is added to result[3]: [5, 6, 7, 3]

The final result array is:

[5, 6, 7, 3]

        // Output the result
        
         
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

}

Output: You are printing the result array using Arrays.toString(result) which converts the array to a string representation.

The output printed will be:


Array after removing duplicates: [5, 6, 7, 3]

Final Output:


Array after removing duplicates: [5, 6, 7, 3]




*/