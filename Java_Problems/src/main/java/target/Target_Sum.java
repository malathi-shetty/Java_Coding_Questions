package target;

import java.util.ArrayList;
import java.util.List;

public class Target_Sum {

	public static void main(String[] args) {
		/*
		 * Find Pair with Target Sum
🔸 Input: {1, 2, 3, 4, 5}, Target = 5
🔸 Output: 3+2, 4+1
 * 
		 */
	int[] a={1,2,3,4,5};
	int target = 5;
		findTarget(a, target);

	}

	public static void findTarget(int[] a, int target) {
		List<Integer> set = new ArrayList<>();
		for(int i=0; i<a.length; i++)
		{
			int value = target - a[i];
			if(set.contains(value))
			{
				System.out.println("Given Target: " + a[i] + " + " + value);
			}
			set.add(a[i]);
		}
		
	}

}
