package collections_Map;

import java.util.HashMap;

public class Map_1 {

	public static void main(String[] args) {
		
		// Map: values can be duplicate
		
		HashMap newobj = new HashMap();
		newobj.put("java", "learn");
		newobj.put("python", "test");
		newobj.put("playwright", "grow");
		newobj.put("cypress", "study");
		newobj.put("java", "learn");
		newobj.put("java", "learn");
		
		newobj.put("null", "empty"); // The hashcode of null is zero so index would be zero.
		newobj.put("null", "empty");
		newobj.put("null", "empty");
		
		System.out.println(newobj.get("java"));
		System.out.println(newobj.get("null"));
		
		

	}

}
