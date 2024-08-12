package test;

public class A {
	
	/*static {
		System.out.println("Parent Static...");
	}
	*/
	{
		System.out.println("Parent Instance...");
	}
	
	A()
		{
			System.out.println("Parent Constructor...");
		}
	
	static void m1()
	{
		System.out.println("Parent Method....");
	}
	

}
