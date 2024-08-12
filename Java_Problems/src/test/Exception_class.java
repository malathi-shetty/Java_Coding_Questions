package test;

public class Exception_class {

	public static void main(String[] args) {

		try {
		System.out.println(10/0);
		System.out.println("try");
		System.out.println("ratan".charAt(12));
		
		}
		catch(ArithmeticException a)
		{
		//	System.out.println(10/0);
		//	System.out.println(a);
		System.out.println(a.getMessage());
		System.out.println(a.fillInStackTrace());
	//	System.out.println(10/0);
			
			System.out.println("code execution in catch");
		}
		catch(IndexOutOfBoundsException b)
		{
		//	System.out.println(b);
			System.out.println(b.getMessage());
			b.printStackTrace();
			
			System.out.println("code execution in catch in Array index");
		}
		catch(Exception c)
		{
		//	System.out.println(b);
			System.out.println(c.getMessage());
			
			System.out.println("code execution in catch in Array index");
		}
		
		System.out.println("code execution");

	}

}
