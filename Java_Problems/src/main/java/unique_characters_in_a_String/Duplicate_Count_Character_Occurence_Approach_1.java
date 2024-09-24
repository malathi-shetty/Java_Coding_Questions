package unique_characters_in_a_String;

public class Duplicate_Count_Character_Occurence_Approach_1 {

	public static void main(String[] args) {
		// just give the count_Number_of_Words_in_a_String
		
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
