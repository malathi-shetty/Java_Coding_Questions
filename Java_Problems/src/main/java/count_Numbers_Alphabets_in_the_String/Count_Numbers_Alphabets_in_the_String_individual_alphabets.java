package count_Numbers_Alphabets_in_the_String;

public class Count_Numbers_Alphabets_in_the_String_individual_alphabets {

	public static void main(String[] args) {
		String s = "23sdsdf 25sfs 24 wdsf";
		int alphabetCount = countAlphabets(s);
		System.out.println("Total number of alphabetic characters in the string: " + alphabetCount);
	}

	public static int countAlphabets(String s) {
		int count = 0;

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				count++; // Increment for each alphabetic character found
			}
		}

		return count;
	}

}

//For the string "23sdsdf 25sfs 24 wdsf", this code will count all the alphabetic characters and output 10, 
//since the letters are s, d, s, d, f, s, f, w, d, s, f.