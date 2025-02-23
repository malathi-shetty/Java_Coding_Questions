package practice_Exercise;

public class Test17 {
	
	public static boolean returnTrue() {
		System.out.println("m1");
		return true;
	}
	
	public static boolean returnFalse() {
		System.out.println("m2");
		return false;
	}

	public static void main(String[] args) {
		System.out.println(returnFalse() & returnTrue());

	}



}

/*

m2

m1

false

*/