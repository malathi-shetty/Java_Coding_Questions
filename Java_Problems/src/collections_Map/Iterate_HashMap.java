package collections_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Iterate_HashMap {

	public static void main(String[] args) {
		
		HashMap newobj = new HashMap();
		newobj.put("java", "train");
		newobj.put("playwright", "learn");
		
		System.out.println(newobj.keySet());
		System.out.println(newobj.values());
		System.out.println(newobj.entrySet());
		
		System.out.println("******* OR ******");
		
		HashMap<String, String> newobj1 = new HashMap<String, String>();
		newobj1.put("fruit", "mango");
		newobj1.put("vegetable", "potato");
		for(String s: newobj1.keySet())
		{
			System.out.println(s);
			System.out.println(newobj1.get(s));
			
		}
		
		System.out.println(newobj1.entrySet());
		
		System.out.println("******* OR ******");
		
		Set its = newobj1.keySet();
		Iterator k = its.iterator();
		while(k.hasNext())
		{
			String a = (String) k.next();
			System.out.println(a);
		}
		
		System.out.println("******* OR ******");
		
		Set<Entry<String,String>> it = newobj.entrySet();
		for(Entry<String,String> i: it)
		{
			System.out.print(i.getKey() + ": ");
			System.out.println(i.getValue());
		}

	}

}
