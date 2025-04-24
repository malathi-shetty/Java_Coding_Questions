package target;

import java.util.*;

public class Target_Sum_1 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int target = 5;
		 Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
		    int value = target - a[i];
		    if (set.contains(value)) {
		        System.out.println("Given Target: " + a[i] + " + " + value);
		    }
		    set.add(a[i]);
		}

	}

}
