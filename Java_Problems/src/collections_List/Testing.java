package collections_List;

import java.util.ArrayList;
import java.util.List;


public class Testing {
	
	//Create Objects & add to the list in real time 
	
	int rollno;
	String ename, address;
	Testing(int rollno, String ename, String address)
	{
		this.rollno = rollno;
		this.address = address;
		this.ename = ename;
	}



	public static void main(String[] args) {
		
		List<Testing> list = new ArrayList();
		Testing newobj = new Testing(1, "pt", "siddipet");
		Testing newobj1 = new Testing(2, "pdsdt", "siddi");
		Testing newobj2 = new Testing(3, "pdsdst", "pet");
		Testing newobj3 = new Testing(4, "pdsdsddst", "petsiddipet");
		
		list.add(newobj);
		list.add(newobj1);
		list.add(newobj2);
		list.add(newobj3);
		
		for(Testing i:list)
		{
			System.out.println(i.rollno + " *********** " + i.ename + " ----------- " + i.address);
		}
		
	}

}
