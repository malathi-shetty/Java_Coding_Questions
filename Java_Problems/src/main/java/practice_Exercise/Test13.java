package practice_Exercise;

public class Test13 {

	static int i = 10;
	i = 20; // particularly in a static context. The assignment should be within a method or a constructor.
	public static void main(String[] args) {
		System.out.println(i);
	}	
	//Output: 	Unresolved compilation problem

		
// Correct Version:
	/*	
		 static int a = 10;

		    public static void main(String[] args) {
		        a = 20;  // Valid assignment inside the main method
		        System.out.println(a);
		    }
		
		//Output: 20
	*/	
	}



// Exception in thread "main" java.lang.Error: Unresolved compilation problem: at practice_Exercise.Test13.main(Test13.java:7)


//we cannot assign a value directly to a variable (i = 20;) outside of any method or constructor, particularly in a static context like this. The assignment should be within a method or a constructor.

//To fix this, you should initialize i in a valid context, such as within the main method or a static block.

//Here is the corrected version of the code:

/*
    static int a = 10;

    public static void main(String[] args) {
        a = 20;  // Valid assignment inside the main method
        System.out.println(a);
    }
}
*/
//Now, the code will print 20 because we're modifying the value of i in the main method before printing it.