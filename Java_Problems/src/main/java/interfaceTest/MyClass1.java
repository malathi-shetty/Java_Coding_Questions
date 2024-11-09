package interfaceTest;

//public class MyClass1 extends MyClass {

public class MyClass1 implements TestB {

	/*
	 * what do you think below code will work ?
	 * 
	 * interface A{}
	 * 
	 * interface B extends A{}
	 * 
	 * abstract class C implements B{}
	 * 
	 * class D extends C
	 */

	@Override
	public void methodB() { // In this example, MyClass1 provides an implementation for methodB, but MyClass
							// provides a partial implementation by implementing methodA.
		System.out.println("methodB from interface B");
	}
	// Implement abstract methods from C (if any) or use concrete methods

	@Override
	public void methodA() {
		 System.out.println("methodA implemented");
		
	}



	/*
	 * abstract class MyClass can implement the TestB interface and can leave method
	 * implementations incomplete (abstract methods).
	 * 
	 * class MyClass1 must implement any remaining abstract methods from class
	 * MyClass.
	 */
}

/*
 * 
 * interface TestA and interface TestB extends A are valid. Interface TestB
 * extends interface TestA, so TestB inherits the contract of TestA.
 * 
 * abstract class C(MyClass) implements TestB is also valid. The abstract class
 * C implements interface B. This means that C is required to implement the
 * methods defined by interface TestB. Since C is abstract, it does not need to
 * implement all of B's methods; it can leave the implementation for concrete
 * subclasses.
 * 
 * class D(MyClass1) extends C is valid as long as C either has no abstract
 * methods left unimplemented or class D provides implementations for them. If C
 * has abstract methods, class D must provide concrete implementations for those
 * methods unless D is also declared as abstract.
 * 
 */