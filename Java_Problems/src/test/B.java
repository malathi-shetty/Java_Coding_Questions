package test;

public class B extends A{
	
	static {
		System.out.println("Child Static...");
	}
	
	{
		System.out.println("Child Instance...");
	}
	
/*	B()
		{
			System.out.println("Child Constructor...");
		}
*/	
	static void m1()
	{
		System.out.println("Child Method....");
	}

	public static void main(String[] args) {
		
		A newobj = new B();
		newobj.m1();

	}

}
