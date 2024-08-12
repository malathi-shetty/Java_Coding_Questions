package practice_Exercise;

public class Find_Missing_Number_In_the_Array {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,5,6,7,8,9,10}; //maxNumber is 10 
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			//i=i+a[i];
			//0=0+1;
			//1=1+2;
			//3=3+4 & so on
			
			sum=sum+a[i];
	
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(int j=1; j<=10; j++) // i.e j<maxNumber i.e 10
		{
			
			sum1=sum1+j;
			
		}
		System.out.println(sum1);
		
		int Missing_number;
		Missing_number = sum1-sum;
		System.out.println( "Missing number: " + Missing_number );
		

	}

}
