package whiteSpace;

public class How_To_Remove_White_Spaces_in_a_String_1 {

	public static void main(String[] args) {
		
		String str ="   Java     programming     selenium      automation    ";
		System.out.println("Before Removing the white Spaces: " + str);
		
		//to remove space using regular expression
		str = str.replaceAll("\\s", "");
		
		System.out.println("After Removing the white Spaces: " + str);
	}
}