package collections_Map;

import java.util.HashMap;

public class B {

	public static void main(String[] args) {
		
		HashMap newobj = new HashMap();
		
		newobj.put("piyu", "dancer");
		newobj.put("rahul", "singer");
		System.out.println(newobj.keySet()); // only keys
		System.out.println(newobj.values()); // only values
		System.out.println(newobj.entrySet()); //  keys & values

	}

}
