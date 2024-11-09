package interfaceTest;

//public interface TestB implement TestA {
public interface TestB extends TestA {
//	 void methodA();  // method from interface A
	    void methodB();  // method added in interface B
	
}


/*

interface A{}

interface B implement A{}

is this statement correct ?

No, the statement is not correct.

In Java, interfaces do not use the implement keyword when extending other interfaces. Instead, they use the extends keyword.

So, if you want interface B to extend interface A, the correct syntax would be:


interface A {}

interface B extends A {}

Here, interface B extends interface A, meaning that B inherits the contract defined by A.


extends is used for interface inheritance (an interface can extend one or more other interfaces).
*/