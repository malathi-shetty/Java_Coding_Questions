package removeDuplicates_maintaining_the_original_order;

import java.util.*;

public class RemoveDuplicates_HashSet {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 3, 3, 7, 5};
        
        // Create a HashSet to keep track of already seen elements
        Set<Integer> set = new HashSet<>();
        
        // Create a list to store the result (to maintain order)
        List<Integer> resultList = new ArrayList<>();
        
        // Loop through the original array
        for (int num : arr) {
            // If the number is not in the set, add it to the set and result list
            if (!set.contains(num)) {
                set.add(num);
                resultList.add(num);
            }
        }
        
        // Convert the result list back to an array
        int[] result = resultList.stream().mapToInt(Integer::intValue).toArray();
        
        // Output the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
