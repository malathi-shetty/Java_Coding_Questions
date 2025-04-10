package collections_Fetch_Values_from_a_Map_Using_Keys;

import java.util.HashMap;
import java.util.Map;

public class Collections_Fetch_Values_from_a_Map_Using_Keys {

	public static void main(String[] args) {
		   // Step 1: Create a map
        Map<String, String> countryCapitalMap = new HashMap<>();

        // Step 2: Add key-value pairs to the map
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Germany", "Berlin");

        // Step 3: Fetch values using keys
        String capitalOfIndia = countryCapitalMap.get("India");
        String capitalOfJapan = countryCapitalMap.get("Japan");
        String capitalOfUSA = countryCapitalMap.get("USA");

        // Step 4: Display the results
        System.out.println("Capital of India: " + capitalOfIndia);
        System.out.println("Capital of Japan: " + capitalOfJapan);
        System.out.println("Capital of USA: " + capitalOfUSA);

        // Step 5: Handle non-existent key
        String capitalOfFrance = countryCapitalMap.get("France");
        if (capitalOfFrance == null) {
            System.out.println("Capital of France is not in the map.");
        } else {
            System.out.println("Capital of France: " + capitalOfFrance);
        }

        // Optional: Loop through all keys and fetch values
        System.out.println("\nAll countries and their capitals:");
        for (String country : countryCapitalMap.keySet()) {
            String capital = countryCapitalMap.get(country);
            System.out.println(country + " -> " + capital);
        }

	}

}

/*
 * 
 * Output:
 * 
 * Capital of India: New Delhi
 * 
Capital of Japan: Tokyo

Capital of USA: Washington D.C.

Capital of France is not in the map.


All countries and their capitals:


USA -> Washington D.C.

India -> New Delhi

Japan -> Tokyo

Germany -> Berlin      

*/
