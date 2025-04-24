package target;

public class Consecutive_Sequence_having_Sum_EqualTo_Target {

	public static void main(String[] args) {
		// Program to find consecutive sequences in array having sum equal to target. 
		
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 2,1,3};

		for(int i=0;i<arr.length;i++)
		{int sum=0;
		for(int j=i;j<arr.length;j++)
		{
		sum=sum+arr[j];
		if(sum==6)
		{
		for(int k=i;k<=j;k++)
		{
		System.out.print(arr[k]);
		if (k < j) System.out.print(", ");
		}
		System.out.println();
		}
		else
		if(sum>6){
		break;
		}
		}
		} 

	}

}
