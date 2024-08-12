package duplicates_In_An_Array;

public class Duplicate_Count_String_Occurence_Approach1 {

	public static void main(String[] args) {
		// just give the count
		
		String str ="Java is object oriented language";
		
		//**** Approach 1 ****/
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='o')
			{
				count++;
			}
		}
		System.out.println(count);
	
	
	}	

}
