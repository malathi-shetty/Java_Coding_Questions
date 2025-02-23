package practice_Exercise;

public class Test20 {

	class A {
		public void A() {
			System.out.println("A");
		}
	}

	class B extends A {
		void A() {
			System.out.println("B");
		}
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.A();

	}

//correct answer is Compile Error

	/*
	 * class A { public void printA() { // Renamed the method to printA()
	 * System.out.println("A"); } }
	 * 
	 * class B extends A {
	 * 
	 * @Override public void printA() { // Correctly overriding the method printA()
	 * System.out.println("B"); } }
	 * 
	 * public static void main(String[] args) { Test20 test = new Test20(); //
	 * Create instance of outer class B b1 = test.new B(); // Create instance of B
	 * b1.printA(); // Calls the overridden method in B }
	 * 
	 * // Output: B //Creating an instance of B inside the main method works because
	 * B is an inner class of Test20. You need to create an instance of the outer
	 * class first (Test20 test = new Test20();) before creating an instance of B.
	 * 
	 */

}
