package practice_Exercise;

import java.util.Scanner;

public class Website_Type_from_URL {
	//WAP to find out the type of website from the "url": .com->commertial Website; .org->organization website; .in->indian website etc?

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter the URL: ");
	        String url = scanner.nextLine();

	        // Determine the type of website based on the URL suffix
	        String websiteType;
	        if (url.endsWith(".com")) {
	            websiteType = "Commercial Website";
	        } else if (url.endsWith(".org")) {
	            websiteType = "Organization Website";
	        } else if (url.endsWith(".in")) {
	            websiteType = "Indian Website";
	        } else {
	            websiteType = "Other Website Type";
	        }

	        // Output the result
	        System.out.println("The website type is: " + websiteType);
	}

}
