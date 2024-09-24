package find_Common_Elements_In_An_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Common_Elements_Between_any_two_Arrays_3_6_ArrayList_with_Java_Stream {

	
	//NOT SUPPORTED JDK - else correct code
	public static void main(String[] args) {
		String[] a3 = { "Java", "JavaScript", "C", "C++" }; 
		String[] a4 = { "Python", "C#", "Java", "C++" }; 
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(a3)); 
		ArrayList<String> list4 = new ArrayList<>(Arrays.asList(a4)); 
	//	List<String> commonElements1 = list3.stream().filter(list4::contains).collect(Collectors.toList()); 
	//	System.out.println(commonElements1);

	}

}
