package practice_Exercise;

public class Simple_Exercise_33 {

	static int j = Simple_Exercise_33.i;
//	static int l = i;
	static int i = 10;
	static int k = Simple_Exercise_33.i;
	static int m = i;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	//	System.out.println(l);
		System.out.println(m);

	}

}

//j is assigned the default value of i (which is 0) because i has not yet been initialized when j is assigned. 
//That's why the output is 0