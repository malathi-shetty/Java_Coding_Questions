package target;

public class Consecutive_Triplets_sum_Equals_target {
	
	//Print the consecutive triplets in array having sum Equals target. 

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 2,1,2};
		int target = 6;
		for(int i=0;i<arr.length-2;i++)
		{
		if(arr[i]+arr[i+1]+arr[i+2]==target)
		{
		System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
		}
		} 

	}

}
