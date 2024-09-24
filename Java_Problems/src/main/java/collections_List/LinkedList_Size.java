package collections_List;

import java.util.LinkedList;

public class LinkedList_Size {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("test");
		list.add("testing");
		list.add("selenium");
		
		int num=0;
		while(list.size()>num)
		{
			System.out.println(list.get(num));
			num++;
		}

	}

}
