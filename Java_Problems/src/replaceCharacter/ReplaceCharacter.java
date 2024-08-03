package replaceCharacter;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		//Original String
		
		String originalString = "Programming";
		
		//Replace 'm' wiht 'i'
		String modifiedString = originalString.replace('m', 'i');	
		
		//Output the result
		System.out.println("Original String: " + originalString);
		System.out.println("Modified String: " + modifiedString);
	}

}