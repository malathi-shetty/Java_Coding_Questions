package vowels_And_Consonants_Checker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vowel_And_Consonant_Checker_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        Map<String,Integer> countMap = new HashMap<>();
        countMap.put("Vowels", 0);
        countMap.put("Consonants", 0);
        
        for(char ch : input.toCharArray())
        {
        	if(Character.isLetter(ch))
        	{
        		if("AEIOUaeiou".indexOf(ch) != -1)
        		{
        			countMap.put("Vowels", countMap.get("Vowels") + 1);
        		}else
        		{
        			countMap.put("Consonants", countMap.get("Consonants") + 1);
        		}
        	}
        }
        System.out.println("Vowels: " + countMap.get("Vowels"));
        System.out.println("Consonants: " + countMap.get("Consonants"));
	}
}