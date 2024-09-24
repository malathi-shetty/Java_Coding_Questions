package find_duplicates_Words_In_An_Array;

public class Find_Duplicate_words_in_Array_1 {

	public static void main(String[] args) {
		
		String a[]= {"Java", "C", "C++", "Python" ,"Java"};
		
		// Logic-1: take 1st element & compare with each array if you find equivalent element then its duplicate
		//& if not not a duplicate
		
		boolean flag = false;
		for(int i=0; i<a.length; i++)
		{
			int count =1;
			for(int j = i+1; j<a.length; j++)//comparing so take i+1
			{
				if(a[i] == a[j])
				{
					count++;
					System.out.println("Found Duplicate Element: " + a[i] + " --> " + count);
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