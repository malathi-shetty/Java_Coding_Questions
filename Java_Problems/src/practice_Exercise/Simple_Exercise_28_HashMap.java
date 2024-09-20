package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_28_HashMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		 map.put("A", "Apple");
		 map.put("B", "Boy");
		 map.put("C", "Cat");
		 map.replace("C", "Element");
		 map.remove("A","Apple");
		 System.out.println(map);

	}

}
