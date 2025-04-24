package target;

import java.util.*;

public class AllPairSums {
	 public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4, 5, 2, 3, -1};
	        int target = 5;

	        List<String> result = findAllPairSums(nums, target);

	        System.out.println("Pairs that sum to " + target + ":");
	        for (String pair : result) {
	            System.out.println(pair);
	        }
	    }

	    public static List<String> findAllPairSums(int[] nums, int target) {
	        List<String> result = new ArrayList<>();
	        Set<String> seenPairs = new HashSet<>(); // To track seen value pairs
	        Map<Integer, Integer> map = new HashMap<>(); // To track indices of numbers

	        // Iterate through the array to find pairs
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];

	            if (map.containsKey(complement)) {
	                // Check for duplicates (pair of values)
	                int complementIndex = map.get(complement);
	                String pairKey = Math.min(nums[i], complement) + "-" + Math.max(nums[i], complement);

	                if (!seenPairs.contains(pairKey)) {
	                    seenPairs.add(pairKey);
	                    result.add("Pair (" + nums[i] + ", " + complement + ") | Indices [" + complementIndex + ", " + i + "] | Sum = " + target);
	                }
	            }

	            // Store the current number with its index in the map
	            map.put(nums[i], i);
	        }

	        return result;

}
}


/* output:

Pairs that sum to 5:

Pair (3, 2) | Indices [1, 2] | Sum = 5

Pair (4, 1) | Indices [0, 3] | Sum = 5

*/

/*

Test Cases to try:
With Negative Numbers: {1, 2, 3, -1, 4, 5, -2} and target = 3.

Array with Duplicates: {2, 2, 3, 3, 4, 4} and target = 6.

Array of Mixed Signs: {1, -1, 5, 0, 3, 2} and target = 4.

*/