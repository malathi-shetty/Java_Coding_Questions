package smallest_Largest;

public class Smallest_Largest_Number {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40};
		
		int largest =a[0];
		int smallest = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] < smallest)
			{
				smallest = a[i];
			}
			
			if(a[i] > largest)
			{
				largest=a[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}
