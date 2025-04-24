package target;

import java.util.*;

public class NonContinous_Sequence_having_Sums_upto_target {

	public static void main(String[] args) {
		// Find all sequences in array that sums upto target(Non continous sequences) 

		int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 2, 1, 3};
		int target=6;
		ArrayList<ArrayList<Integer>> output = new ArrayList<>();
		ArrayList<Integer> current = new ArrayList<>();
		findsequences(arr,0,0,target,output,current);
		for(ArrayList<Integer> a:output )
		{
		System.out.println(a);
		}

		}

		static void findsequences(int[] arr, int index, int sum, int target, ArrayList<ArrayList<Integer>> output,
		ArrayList<Integer> current)
		{
		if(sum==target)
		{
		output.add(new ArrayList<>(current));
		return;
		}

		if (index >= arr.length || sum > target) {
		return;
		}
		current.add(arr[index]);
		findsequences(arr,index+1,sum+arr[index],target,output,current);
		current.remove(current.size()-1);
		findsequences(arr,index+1,sum,target,output,current);
	}

}
