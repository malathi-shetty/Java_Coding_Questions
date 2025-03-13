package searchInsertPosition_target;

public class SearchInsertPosition_target {

	
		public int searchInsert(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;
	        
	        while (left <= right) {  // Corrected the syntax error here
	            int mid = left + (right - left) / 2;  // To avoid overflow
	            
	            if (nums[mid] == target) {
	                return mid;  // If the target is found, return the index
	            } else if (nums[mid] < target) {
	                left = mid + 1;  // Move to the right side
	            } else {
	                right = mid - 1;  // Move to the left side
	            }
	        }
	        
	        return left;  // If not found, 'left' is the correct insertion position
	    }

	    public static void main(String[] args) {
	    	SearchInsertPosition_target sol = new SearchInsertPosition_target();
	        
	        // Test cases
	        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 5));  // Output: 2
	        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 2));  // Output: 1
	        System.out.println(sol.searchInsert(new int[]{1, 3, 5, 6}, 7));  // Output: 4
	    

	}

}
/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5

Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2

Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7

Output: 4
 

Constraints:

1 <= nums.length <= 104

-104 <= nums[i] <= 104

nums contains distinct values sorted in ascending order.

-104 <= target <= 104

*/