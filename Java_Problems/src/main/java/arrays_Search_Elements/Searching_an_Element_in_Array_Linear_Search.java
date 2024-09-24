package arrays_Search_Elements;

public class Searching_an_Element_in_Array_Linear_Search {

	public static void main(String[] args) {
		// 10 20 40 30 50 - need to search 30
		
		int a[] = {10,20,40,50,30};
		
		int search_ele = 50;
		boolean flag = false;
		for(int i =0; i<a.length; i++)
		{
			//System.out.println(a[i]);
			if(search_ele == a[i])
			{
				System.out.println("Element is Found at i^th-index: " + i);
				flag = true;
				break;
			}
		}
		if(flag == false) 
		{
		System.out.println("NO Element is Found");
		}
	}
}