package arrays;

public class Find_Duplicate_Elements_in_Array_1 {

	public static void main(String[] args) {
		
		String a[]= {"Java", "C", "C++", "Python" ,"Java"};
		
		// Logic-1: take 1st element & compare with each array if you find equivalent element then its duplicate
		//& if not not a duplicate
		
		boolean flag = false;
		for(int i=0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)//comparing so take i+1
			{
				if(a[i] == a[j])
				{
					System.out.println("Found Duplicate Element: " + a[i]);
					flag = true;
				}
			}
		}
		if(flag == false) 
		{
		System.out.println("Duplicate Element Not Found");
		}
	}
}