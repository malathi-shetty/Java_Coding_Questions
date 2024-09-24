package arrays_Equality;

public class Check_The_Equality_Of_Two_Arrays_2 {
	public static void main(String[] args) {
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,6};
				
		boolean status = true;		
		if(a1.length == a2.length)
		{
			//compare rest of elements
			for(int i=0; i<a1.length; i++)
			{
				if(a1[i] != a2[i])
				{
					status = false;
				}
			}			
		}
		else 
		{
			status = false;
		}		
		if(status == true)
		{
			System.out.println("Arrays are Equal - a1, a2");
		}else
		{
			System.out.println("Arrays are NOT Equal - a1, a2");
		}
	}
}