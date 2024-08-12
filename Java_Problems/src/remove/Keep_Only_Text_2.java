package remove;

public class Keep_Only_Text_2 {

	public static void main(String[] args) {
		String s = "Training@1234";
		String a = s.replaceAll("[@0-9]", "");
		System.out.println(a);
	}

}