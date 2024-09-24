package smallest_Largest;

public class Smallest_Number_In_An_Array {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40}; //[0]-10 ,[1]-20, [2]-30, [3]-40
		int min=a[0];
		
		for(int i=0; i<a.length; i++)// a.length till 3 it should come
		{
				if(a[i]<min) 
// comparing with initialized number 10<10 - false i is incremented to 1 min is 10; 20<10 - false again increment 30<10 & so on & finally 10 is printed
				{
					min=a[i];
				}
		}
		System.out.println(min);

	}
}
