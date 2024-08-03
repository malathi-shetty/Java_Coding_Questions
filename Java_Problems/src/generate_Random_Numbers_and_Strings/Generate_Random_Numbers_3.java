package generate_Random_Numbers_and_Strings;

import org.apache.commons.lang3.RandomStringUtils;

public class Generate_Random_Numbers_3 {

	public static void main(String[] args) {
		// Approach 3 - Apache Commons-Language API - Generate random number & string 
		// Download jar from https://commons.apache.org/proper/commons-lang/download_lang.cgi
		// Apache Commons Lang 3.15.0 (Java 8+) ---> Download zip file -- Binaries --> commons-lang3-3.15.0-bin.zip
// RandomStringUtils.randomNumeric(5); // generate number which contains 5 digit - even though it is a Number it returns in form of String
		
		
		
		String ran_Num = RandomStringUtils.randomNumeric(5); // generate number which contains 5 digit
		System.out.println("Random Number_5_Digit: " + ran_Num);
		
		String ran_Num1 = RandomStringUtils.randomNumeric(10); // generate number which contains 10 digit
		System.out.println("Random Number_10_Digit: " + ran_Num1);
		
		String ran_Str = RandomStringUtils.randomAlphabetic(5);
		System.out.println("Random String_5_Digit: " + ran_Str);
	}

}