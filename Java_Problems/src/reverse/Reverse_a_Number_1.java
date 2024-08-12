package reverse;

public class Reverse_a_Number_1 {

	public static void main(String[] args) {
		
		int[] a= {7,8,9,3,4,45,67,98,455,678,98};
		
		int k=a.length-1;
		
		for(k=a.length-1; k>=0; k--)
		{
			System.out.println(a[k] + "");
		}

	}

}
