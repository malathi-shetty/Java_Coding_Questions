package practice_Exercise;

import java.util.HashMap;
import java.util.Map;

public class Simple_Exercise_27_HashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		 map.put(101, "Red");
		 map.put(103, "Green");
		 map.put(102, "Yellow");
		 map.remove(104);
		 map.remove(106,"Pink");
		 System.out.println(map);

	}

}
