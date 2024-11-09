package interfaceTest;

public abstract class MyClass implements TestA {

	
		 // Abstract methods or concrete methods can be here
		 @Override
		    public void methodA() {
		        System.out.println("methodA from interface A");
		    }

		    // C doesn't need to implement methodB, as it is abstract
	}



/*

The implements keyword is used when a class implements an interface, not for interface-to-interface inheritance. For example:

public class MyClass implements TestA {

implements is used for a class to implement an interface.
*/