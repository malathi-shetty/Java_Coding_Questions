package target;

import java.util.*;

public class AllPairSums_1 {

	public static void main(String[] args) {
		// Finding all unique pairs that sum to the target

		int[] a = {1, 2, 3, 4, 5, 2, 3, -1};
        int target = 5;
        List<String> result = new ArrayList<>();
		Set<String> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
		    int c = target - a[i];
		    if (map.containsKey(c)) {
		    	 int cIndex = map.get(c);
		        String pairKey = Math.min(a[i], c) + "-" + Math.max(a[i], c);
		        if (!set.contains(pairKey)) {
		        	set.add(pairKey);
		            result.add("Pair (" + a[i] + ", " + c + ") | Indices [" + cIndex + ", " + i + "] | Sum = " + target);
		        }
		    }
		    map.put(a[i], i);
		}
		
		 System.out.println("Pairs that sum to " + target + ":");
	        for (String pair : result) {
	            System.out.println(pair);
	        }

	}

}

/*
 * 
 * Pairs that sum to 5:
Pair (3, 2) | Indices [1, 2] | Sum = 5
Pair (4, 1) | Indices [0, 3] | Sum = 5

*/
