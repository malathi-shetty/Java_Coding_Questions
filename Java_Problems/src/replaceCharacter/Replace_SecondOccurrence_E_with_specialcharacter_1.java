package replaceCharacter;

public class Replace_SecondOccurrence_E_with_specialcharacter_1 {

	public static void main(String[] args) {
		
		String s = "BOOKEEPER";
		
		StringBuilder newobj = new StringBuilder();
		char target ='E';
		char replacement = '#';
		int count = 0;
		
		for(int i =0; i < s.length(); i++) 
		{
			char j = s.charAt(i); // all the characters
			
			if(j == target)
			{
				count++;
				
				if(count == 2)
				{
					newobj.append(replacement);
				}else
				{
					newobj.append(j);
				}
			}else
			{
				newobj.append(j);
			}
			
			
		}
		System.out.println(newobj);
	}

}
