package target;

public class Consecutive_Pairs_sum_Equals_target {

	//Print the consecutive pairs in array having sum Equals targe
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 2,1,2};
		int target = 3;
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i]+arr[i+1]==target)
		{
		System.out.println(arr[i]+" "+arr[i+1]);
		}
		} 

	}

}

