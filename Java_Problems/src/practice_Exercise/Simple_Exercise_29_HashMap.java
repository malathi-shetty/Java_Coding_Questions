package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_29_HashMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		 map.put("V", "Violet");
		 map.put("I", "Indigo");
		 map.put("B", "Blue");
		 map.put("G", "Green");
		 map.put("Y", "Yellow");
		 
		 String value = map.get("B");
		 System.out.println(value);
		 boolean entryKey = map.containsKey("B");
		 System.out.println(entryKey);
		 boolean entryValue = map.containsValue("Brown");
		 System.out.println(entryValue);

	}

}
