package check_if_a_string_is_a_rotation_of_another_string;

public class Check_if_a_string_is_a_rotation_of_another_string {

	public static void main(String[] args) {
		 String s1 = "hello";
	        String s2 = "llohe"; // You can modify these strings
	        
	        if (isRotation(s1, s2)) {
	            System.out.println(s2 + " is a rotation of " + s1);
	        } else {
	            System.out.println(s2 + " is not a rotation of " + s1);
	        }
	    }

	    public static boolean isRotation(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        String concatenated = s1 + s1;
	        return concatenated.contains(s2);

	}

}
